// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package session

import (
	"crypto/tls"
	"encoding/json"
	"errors"
	"fmt"
	stdhttp "net/http"
	"os"
	"os/exec"
	"reflect"
	"strconv"
	"testing"
	"time"

	"github.com/golang/glog"
	"github.com/vmware/alb-sdk/go/models"
)

var AVI_CONTROLLER = os.Getenv("AVI_CONTROLLER")
var AVI_USERNAME = os.Getenv("AVI_USERNAME")
var AVI_TENANT = os.Getenv("AVI_TENANT")
var AVI_PASSWORD = os.Getenv("AVI_PASSWORD")
var AVI_POOL_NAME = os.Getenv("")
var AVI_VIRTUALSERVICE_NAME = os.Getenv("")
var AVI_AUTH_TOKEN = os.Getenv("AVI_AUTH_TOKEN")
var AVI_API_ITERATIONS int

func TestMain(m *testing.M) {
	// call flag.Parse() here if TestMain uses flags
	if AVI_CONTROLLER == "" {
		AVI_CONTROLLER = "localhost"
	}
	if AVI_USERNAME == "" {
		AVI_USERNAME = "admin"
	}
	if AVI_TENANT == "" {
		AVI_TENANT = "admin"
	}
	if iterations, err := strconv.Atoi(os.Getenv("AVI_API_ITERATIONS")); err == nil {
		AVI_API_ITERATIONS = iterations
	} else {
		AVI_API_ITERATIONS = 1
	}
	os.Exit(m.Run())
}

// Function that generates auth token from django
// In future, this will become an internal API
func getAuthToken() string {
	output, err := exec.Command("/opt/avi/python/bin/portal/manage.py", "gen_auth_token", "--user", "admin", "--hours", "12").Output()
	if err != nil {
		glog.Infof("ERROR: %s", err)
		return ""
	}
	var jsonData interface{}
	err = json.Unmarshal(output, &jsonData)
	if err != nil {
		glog.Infof("ERROR: %s", err)
		return ""
	}
	jsonDataMap := jsonData.(map[string]interface{})
	authToken := jsonDataMap["token"].(string)
	return authToken
}

func getValidTokenV2() (string, error) {
	tokenPath := "api/user-token"
	aviVersion, ok := os.LookupEnv("AVI_VERSION")
	if !ok {
		aviVersion = "18.1.3"
	}
	var robj interface{}
	data := make(map[string]string)
	data["hours"] = "2"

	var aviAuthSessionV2 *AviSession
	var err error
	if AVI_PASSWORD != "" {
		aviAuthSessionV2, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetPassword(AVI_PASSWORD), SetInsecure, SetTenant(AVI_TENANT),
			SetVersion(aviVersion))
	} else {
		aviAuthSessionV2, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetAuthToken(AVI_AUTH_TOKEN), SetInsecure, SetTenant(AVI_TENANT),
			SetVersion(aviVersion))
	}
	err = aviAuthSessionV2.Post(tokenPath, data, &robj)
	if err != nil {
		glog.Infof("Error while getting auth token. [ERROR]: %s", err.Error())
		return "", err
	}
	token := fmt.Sprintf("%v", robj.(map[string]interface{})["token"])
	return token, nil
}

func getSessions(t *testing.T) []*AviSession {
	/* Test username/password authentication */

	aviVersion, ok := os.LookupEnv("AVI_VERSION")
	if !ok {
		aviVersion = "21.1.1"
	}

	var err error
	var credentialsSession *AviSession

	if AVI_PASSWORD != "" {
		credentialsSession, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetTenant(AVI_TENANT), SetPassword(AVI_PASSWORD), SetInsecure, SetVersion(aviVersion))
	} else {
		credentialsSession, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetTenant(AVI_TENANT), SetAuthToken(AVI_AUTH_TOKEN), SetInsecure, SetVersion(aviVersion))
	}

	var sessionSetAuthTokenV2 *AviSession
	sessionSetAuthTokenV2, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
		SetRefreshAuthTokenCallbackV2(getValidTokenV2), SetInsecure, SetTenant(AVI_TENANT),
		SetVersion(aviVersion))
	if err != nil {
		t.Errorf("Session Creation failed: %s", err)
	}

	if AVI_CONTROLLER != "localhost" {
		return []*AviSession{credentialsSession, sessionSetAuthTokenV2}
	}

	/* Test token authentication */
	authToken := getAuthToken()
	authTokenSession, err := NewAviSession(AVI_CONTROLLER, "admin",
		SetAuthToken(authToken), SetInsecure)

	if err != nil {
		t.Fatalf("Session Creation failed: %s", err)
	}

	/* Test token authentication with provided callback function */
	authTokenSessionCallback, err := NewAviSession(AVI_CONTROLLER, "admin",
		SetRefreshAuthTokenCallback(getAuthToken),
		SetInsecure)

	if err != nil {
		t.Errorf("Session Creation failed: %s", err)
	}

	return []*AviSession{credentialsSession, authTokenSession, authTokenSessionCallback, sessionSetAuthTokenV2}
}

func testControllerStatusCheckLimits(t *testing.T) {
	aviVersion, ok := os.LookupEnv("AVI_VERSION")
	if !ok {
		aviVersion = "18.1.3"
	}

	var err error
	var aviSession *AviSession
	var numRetries = 4
	var numTimeIntervalSecs = 10

	// try to init the session with illegal inputs for controller status check limits.
	if AVI_PASSWORD != "" {
		aviSession, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetTenant(AVI_TENANT), SetPassword(AVI_PASSWORD), SetInsecure, SetLazyAuthentication(true),
			SetControllerStatusCheckLimits(0, -1), SetVersion(aviVersion))
	} else {
		aviSession, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetTenant(AVI_TENANT), SetAuthToken(AVI_AUTH_TOKEN), SetInsecure, SetLazyAuthentication(true),
			SetControllerStatusCheckLimits(-2, -3),
			SetVersion(aviVersion))
	}
	if err == nil {
		t.Errorf("The Avi session go created with illegal arguments")
	}
	if AVI_PASSWORD != "" {
		aviSession, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetTenant(AVI_TENANT), SetPassword(AVI_PASSWORD), SetInsecure, SetLazyAuthentication(true),
			SetControllerStatusCheckLimits(numRetries, numTimeIntervalSecs),
			SetVersion(aviVersion))
	} else {
		aviSession, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetTenant(AVI_TENANT), SetAuthToken(AVI_AUTH_TOKEN), SetInsecure, SetLazyAuthentication(true),
			SetControllerStatusCheckLimits(numRetries, numTimeIntervalSecs),
			SetVersion(aviVersion))
	}

	if err != nil {
		t.Errorf("Session Creation failed: %s", err)
	}
	if aviSession.ctrlStatusCheckRetryCount != numRetries {
		t.Errorf("Failed to initialise the AVI session with expected retry count")
	}
	if aviSession.ctrlStatusCheckRetryInterval != numTimeIntervalSecs {
		t.Errorf("Failed to initialise the AVI session with expected time interval to poll the controller status.")
	}
}

func testControllerStatusCheckDisabled(t *testing.T) {
	aviVersion, ok := os.LookupEnv("AVI_VERSION")
	if !ok {
		aviVersion = "18.1.3"
	}

	var err error
	var aviSession *AviSession

	if AVI_PASSWORD != "" {
		aviSession, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetTenant(AVI_TENANT), SetPassword(AVI_PASSWORD), SetInsecure, SetLazyAuthentication(true),
			DisableControllerStatusCheckOnFailure(true), SetVersion(aviVersion))
	} else {
		aviSession, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetTenant(AVI_TENANT), SetAuthToken(AVI_AUTH_TOKEN), SetInsecure, SetLazyAuthentication(true),
			DisableControllerStatusCheckOnFailure(true), SetVersion(aviVersion))
	}

	if err != nil {
		t.Errorf("The Avi session creation failed. error: %s", err)
	}
	if aviSession.disableControllerStatusCheck != true {
		t.Errorf("Failed to disable controller status check during session init..")
	}

	if AVI_PASSWORD != "" {
		aviSession, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetTenant(AVI_TENANT), SetPassword(AVI_PASSWORD), SetInsecure, SetLazyAuthentication(true),
			SetVersion(aviVersion))
	} else {
		aviSession, err = NewAviSession(AVI_CONTROLLER, AVI_USERNAME,
			SetTenant(AVI_TENANT), SetAuthToken(AVI_AUTH_TOKEN), SetInsecure, SetLazyAuthentication(true),
			SetVersion(aviVersion))
	}

	if err != nil {
		t.Errorf("Session Creation failed: %s", err)
	}
	// Now create the session where controller status check will not be disabled.
	if aviSession.disableControllerStatusCheck == true {
		t.Errorf("Failed to initialise the AVI session with controller status check disabled.")
	}
}

func testAviSession(t *testing.T, avisess *AviSession) {

	var res interface{}
	err := avisess.Get("api/tenant", &res)
	glog.Infof("res: %+v, err: %s", res, err)
	resp := res.(map[string]interface{})
	glog.Infof("count: %s", resp["count"])

	// create a tenant
	tenant := make(map[string]string)
	tenant["name"] = "testtenant"
	var tres interface{}
	err = avisess.Post("api/tenant", &tenant, &tres)
	glog.Infof("res: %s, err: %s", tres, err)
	if err != nil {
		t.Error("Tenant Creation failed: ", err)
		return
	}

	// check tenant is created well
	err = avisess.Get("api/tenant?name=testtenant", &res)
	glog.Infof("res: %s, err: %s", res, err)
	if reflect.TypeOf(res).Kind() == reflect.String {
		t.Errorf("Got string instead of json!")
		return
	}
	resp = res.(map[string]interface{})
	glog.Infof("count: %s", resp["count"])
	currCount := resp["count"].(float64)
	if currCount != 1.0 {
		t.Errorf("could not find a tenant with name testtenant")
		return
	}
	tenant["uuid"] = resp["results"].([]interface{})[0].(map[string]interface{})["uuid"].(string)

	// delete the tenant
	err = avisess.Delete("api/tenant/" + tenant["uuid"])
	glog.Infof("err: %s", err)
	if err != nil {
		t.Error("Deletion failed")
		return
	}

	// check to make sure that the tenant is not there any more
	// check tenant is created well
	err = avisess.Get("api/tenant?name=testtenant", &res)
	glog.Infof("res: %s, err: %s", res, err)
	resp = res.(map[string]interface{})
	glog.Infof("count: %v", resp["count"])
	currCount = resp["count"].(float64)
	if currCount != 0.0 {
		t.Errorf("Expecting no tenant with that name")
		return
	}

}

func testAviPool(t *testing.T, avisess *AviSession) {
	tpool := models.Pool{}
	pname := "testpool"
	tpool.Name = &pname
	var res models.Pool
	err := avisess.Post("api/pool", &tpool, &res)
	glog.Infof("res: %v, err: %v", res, err)
	if err != nil {
		t.Errorf("Pool Creation failed: %s", err)
	}

	var npool2 models.Pool
	err = avisess.GetObjectByName("pool", "testpool", &npool2)

	glog.Infof("npool: %+v err: %+v", npool2, err)
	glog.Infof("name %v: ", npool2.Name)

	var npool3 models.Pool
	// Test patch before deleting the pool
	var patch = make(map[string]interface{})
	server := models.Server{}
	ipaddr := models.IPAddr{}
	addr := "10.90.164.222"
	ipaddr.Addr = &addr
	Type := "V4"
	ipaddr.Type = &Type
	server.IP = &ipaddr
	var servers = make([]models.Server, 1)
	servers[0] = server
	patch["servers"] = servers
	err = avisess.Patch("api/pool/"+*npool2.UUID, &patch, "add", &npool3)
	if err != nil {
		t.Errorf("Pool Patch failed %s", err)
	}

	//if len(npool3.Servers) != 1 {
	//	t.Error("Pool Patch failed %v", npool3)
	//}

	err = avisess.Delete("api/pool/" + *npool2.UUID)

	if err != nil {
		t.Errorf("Pool deletion failed: %s", err)
	}
}

func TestAviSession(t *testing.T) {
	for _, session := range getSessions(t) {
		testAviSession(t, session)
	}
}

func TestAviSessionControllerStatusCheckLimits(t *testing.T) {
	testControllerStatusCheckLimits(t)
}

func TestAviSessionControllerStatusCheckDisabled(t *testing.T) {
	testControllerStatusCheckDisabled(t)
}

func TestAviPool(t *testing.T) {
	for _, session := range getSessions(t) {
		testAviPool(t, session)
	}
}

func TestTenantSwitch(t *testing.T) {
	for _, session := range getSessions(t) {
		testTenantSwitch(t, session)
	}
}

func TestApiLogout(t *testing.T) {
	for _, session := range getSessions(t) {
		testApiLogout(t, session)
	}
}

func TestApiReLogin(t *testing.T) {
	for _, session := range getSessions(t) {
		testApiReLogin(t, session)
	}
}

func testAviDefaultFields(t *testing.T, avisess *AviSession) {
	tpool := models.Pool{}
	pname := "gosdk-test-pool"
	tpool.Name = &pname
	//bt := true
	//tpool.InlineHealthMonitor = &bt
	var res models.Pool
	err := avisess.Post("api/pool", &tpool, &res)
	glog.Infof("res: %v, err: %v", res, err)
	if err != nil {
		t.Errorf("Pool Creation failed: %s", err)
	}

	if *res.InlineHealthMonitor == false {
		t.Errorf("Pool inline health monitor setting changed")
	}

	var npool2 models.Pool
	err = avisess.GetObjectByName("pool", pname, &npool2)

	if err != nil {
		t.Errorf("Pool %s lookup failed", pname)
	}

	if *npool2.InlineHealthMonitor == false {
		t.Errorf("Pool inline health monitor setting changed")
	}

	server := models.Server{}
	ipaddr := models.IPAddr{}
	addr := "10.90.164.222"
	ipaddr.Addr = &addr
	Type := "V4"
	ipaddr.Type = &Type
	server.IP = &ipaddr
	npool2.Servers = append(npool2.Servers, &server)
	nt := false
	npool2.InlineHealthMonitor = &nt

	var npool3 models.Pool
	err = avisess.Put("api/pool/"+*npool2.UUID, &npool2, &npool3)

	if err != nil {
		t.Errorf("Pool Patch failed %s", err)
	}

	// AV-44749: This logic should be flipped after fixing AV-44749.
	if *npool3.InlineHealthMonitor != nt {
		t.Errorf("Pool inline health monitor setting changed to true")
	}

	err = avisess.Delete("api/pool/" + *npool2.UUID)
	if err != nil {
		t.Errorf("Pool deletion failed: %s", err)
	}
}

func TestAviDefaultFields(t *testing.T) {
	for _, session := range getSessions(t) {
		testAviDefaultFields(t, session)
	}
}

func bogusAuthTokenFunction() string {
	return "incorrect-auth-token"
}

func bogusAuthTokenFunctionV2() (string, error) {
	return "", errors.New("Invalid token from callback method")
}

func TestTokenAuthRobustness(t *testing.T) {
	if AVI_CONTROLLER != "localhost" {
		t.Skip("SKIPPING as test not running in controller.")
		return
	}
	/* Test token authentication with provided callback function */
	authTokenSessionCallback, err := NewAviSession(AVI_CONTROLLER, "admin",
		SetRefreshAuthTokenCallback(bogusAuthTokenFunction),
		SetInsecure)
	var res interface{}
	err = authTokenSessionCallback.Get("api/tenant", &res)
	if err == nil {
		t.Errorf("ERROR: Expected an error from incorrect token auth")
	}

	authTokenSession, err := NewAviSession(AVI_CONTROLLER, "admin",
		SetAuthToken("wrong-auth-token"),
		SetInsecure)
	err = authTokenSession.Get("api/tenant", &res)
	if err == nil {
		t.Errorf("ERROR: Expected an error from incorrect token auth")
	}
}

func TestTokenAuthRobustnessV2(t *testing.T) {
	/* Test token authentication V2 with provided callback function */
	authTokenSessionCallback, err := NewAviSession(AVI_CONTROLLER, "admin",
		SetRefreshAuthTokenCallbackV2(bogusAuthTokenFunctionV2),
		SetInsecure)
	var res interface{}
	err = authTokenSessionCallback.Get("api/tenant", &res)
	if err.Error() != "Invalid token from callback method" {
		t.Errorf("Didn't get expected error for wrong token using SetRefreshAuthTokenCallback V2 functionality")
	}
}

func checkTime(t *testing.T, start time.Time, testcase string) {
	now := time.Now()
	delta := now.Sub(start)
	if delta.Seconds() > 1 {
		t.Errorf("Testcase %s took %v seconds", testcase, delta)
	}
}

func TestAviReads(t *testing.T) {
	for _, avisess := range getSessions(t) {
		for i := 0; i < AVI_API_ITERATIONS; i++ {
			start := time.Now()
			var res interface{}
			err := avisess.Get("api/tenant", &res)
			glog.Infof("res: %s, err: %s", res, err)
			resp := res.(map[string]interface{})
			glog.Infof("count: %s", resp["count"])
			checkTime(t, start, "GetTenant")

			if AVI_POOL_NAME != "" {
				start = time.Now()
				err := avisess.GetObjectByName("pool", AVI_POOL_NAME, &res)
				glog.Infof("res: %s, err: %s", res, err)
				checkTime(t, start, "GetPoolByName")
			}

			start = time.Now()
			err = avisess.Get("api/pool", &res)
			glog.Infof("res: %s, err: %s", res, err)
			resp = res.(map[string]interface{})
			glog.Infof("count: %s", resp["count"])
			checkTime(t, start, "GetPool")

			if AVI_VIRTUALSERVICE_NAME != "" {
				start = time.Now()
				err := avisess.GetObjectByName("virtualservice", AVI_VIRTUALSERVICE_NAME, &res)
				glog.Infof("res: %s, err: %s", res, err)
				checkTime(t, start, "GetVirtualServiceByName")
			}

			start = time.Now()
			err = avisess.Get("api/virtualservice", &res)
			glog.Infof("res: %s, err: %s", res, err)
			resp = res.(map[string]interface{})
			checkTime(t, start, "GetVirtualServiceList")

			start = time.Now()
			err = avisess.Get("api/virtualservice-inventory", &res)
			glog.Infof("res: %s, err: %s", res, err)
			resp = res.(map[string]interface{})
			checkTime(t, start, "GetVirtualServiceInventory")

		}
	}
}

func testTenantSwitch(t *testing.T, avisess *AviSession) {
	tenant := "Test-Admin"
	tobj := models.Tenant{}
	tname := tenant
	tobj.Name = &tname
	var tres models.Tenant
	err := avisess.Post("api/tenant", &tobj, &tres)
	if err != nil {
		t.Errorf("Tenant Creation failed: %s", err)
	}

	tpool := models.Pool{}
	pname := "test-admin-pool"
	tpool.Name = &pname
	var res models.Pool
	err = avisess.Post("api/pool", &tpool, &res, SetOptTenant(tenant))
	glog.Infof("res: %v, err: %v", res, err)
	if err != nil {
		t.Errorf("Pool Creation failed: %s", err)
	}
	glog.Infof("Created Pool name %s", *tpool.Name)
	var npool2 models.Pool
	err = avisess.GetObject("pool", SetName(pname), SetOptTenant(tenant), SetResult(&npool2))
	if err != nil {
		t.Errorf("Pool Fecting failed: %s", err)
	}

	glog.Infof("Get Pool name %s uuid %s", *npool2.Name, *npool2.UUID)

	if *npool2.Name != pname {
		t.Errorf("Pool fetched did not match name %s", pname)
	}

	var npool3 models.Pool
	// Test patch on the pool
	var patch = make(map[string]interface{})
	server := models.Server{}
	ipaddr := models.IPAddr{}
	addr := "10.90.164.222"
	ipaddr.Addr = &addr
	Type := "V4"
	ipaddr.Type = &Type
	server.IP = &ipaddr
	var servers = make([]models.Server, 1)
	servers[0] = server
	patch["servers"] = servers
	glog.Infof("Patching Pool name %s uuid %s", *npool2.Name, *npool2.UUID)

	err = avisess.Patch("api/pool/"+*npool2.UUID, &patch, "add", &npool3, SetOptTenant(tenant))
	if err != nil {
		t.Errorf("Pool Patch failed %s", err)
	}
	// Test put before deleting the pool

	err = avisess.GetObject("pool", SetName(pname), SetOptTenant(tenant), SetResult(&npool2))
	if err != nil {
		t.Errorf("Pool Fecting failed: %s", err)
		t.Fail()
	}

	glog.Infof("Get Patched name %s uuid %s", *npool2.Name, *npool2.UUID)

	// Trying to change the name
	update_pool := "test-pool"
	npool3.Name = &update_pool
	var npool4 models.Pool
	err = avisess.Put("api/pool/"+*npool3.UUID, &npool3, &npool4, SetOptTenant(tenant))
	if err != nil {
		t.Errorf("Pool %s Patch failed %s", *npool3.UUID, err)
		t.Fail()
	}
	if update_pool != *npool4.Name {
		t.Errorf("Pool %s Put failed %s for name change %s", *npool3.UUID, err, update_pool)
		t.Fail()
	}

	//Trying out PUT Raw
	glog.Infof("PUT Pool name %s uuid %s", *npool4.Name, *npool4.UUID)

	uri := "api/pool/" + *npool3.UUID
	err = avisess.DeleteObject(uri, SetOptTenant(tenant))
	if err != nil {
		t.Errorf("Pool Deletion failed: %s", err)
	}

	uri = "api/tenant/" + *tres.UUID
	err = avisess.Delete(uri)
	if err != nil {
		t.Errorf("Tenant Deletion failed: %s", err)
	}
}

// Tests to check logout functionality
func testApiLogout(t *testing.T, avisess *AviSession) {
	avisess.Logout()
	prevSsnId := avisess.sessionid
	var res interface{}
	if err := avisess.Get("api/pool", &res); err == nil {
		if prevSsnId == avisess.sessionid {
			t.Fail()
		}
	} else {
		t.Fail()
	}
}

// Tests to check logout functionality
func testApiReLogin(t *testing.T, avisess *AviSession) {
	avisess.csrfToken = "XXXX"
	prevSsnId := avisess.sessionid
	newP := models.Pool{}
	pname := "test-admin-pool"
	newP.Name = &pname
	var pObj models.Pool
	if err := avisess.Post("api/pool", newP, &pObj); err == nil {
		glog.Infof("prev ssn %s new session %v", prevSsnId, avisess.sessionid)
		uri := "api/pool/" + *pObj.UUID
		err = avisess.DeleteObject(uri)
		if err != nil {
			t.Errorf("Pool Deletion failed: %s", err)
		}
	} else {
		t.Fail()
	}
}

func TestApiLazyAuthentication(t *testing.T) {
	var avisess *AviSession
	var err error
	if AVI_PASSWORD != "" {
		avisess, err = NewAviSession(AVI_CONTROLLER, "admin",
			SetPassword(AVI_PASSWORD), SetLazyAuthentication(true),
			SetInsecure)
	} else {
		avisess, err = NewAviSession(AVI_CONTROLLER, "admin",
			SetAuthToken(AVI_AUTH_TOKEN), SetLazyAuthentication(true),
			SetInsecure)
	}
	if !avisess.lazyAuthentication {
		t.Fail()
	}
	if avisess.sessionid != "" {
		glog.Errorf("%v", err)
		t.Fail()
	}
	var res interface{}
	if err := avisess.Get("api/pool", &res); err != nil {
		glog.Infof("Error: %v", err)
		t.Fail()
	}
}

func TestSetClient(t *testing.T) {
	var avisess *AviSession
	var err error
	client := &stdhttp.Client{
		Transport: &stdhttp.Transport{
			TLSClientConfig: &tls.Config{
				InsecureSkipVerify: true,
			},
		},
		Timeout: 10 * time.Second,
	}
	if AVI_PASSWORD != "" {
		avisess, err = NewAviSession(AVI_CONTROLLER, "admin",
			SetPassword(AVI_PASSWORD), SetLazyAuthentication(true),
			SetInsecure, SetClient(client))
		if err != nil {
			t.Fatal(err)
		}
	} else {
		avisess, err = NewAviSession(AVI_CONTROLLER, "admin",
			SetAuthToken(AVI_AUTH_TOKEN), SetLazyAuthentication(true),
			SetInsecure, SetClient(client))
		if err != nil {
			t.Fatal(err)
		}
	}

	var res interface{}
	if err := avisess.Get("api/pool", &res); err != nil {
		glog.Infof("Error: %v", err)
		t.Fail()
	}
}

func testRawAPI(t *testing.T, avisess *AviSession) {
	rpool := models.Pool{}
	pname := "gosdk-test-raw-pool"
	var defaultPort int32 = 4000
	rpool.DefaultServerPort = &defaultPort
	rpool.Name = &pname
	uri := "/api/pool"
	var response models.Pool
	var res []byte
	var err error

	// Create Pool using PostRaw
	if res, err = avisess.PostRaw(uri, &rpool); err != nil {
		t.Errorf("Pool PostRow failed %s", err)
	}
	if err = json.Unmarshal(res, &response); err != nil {
		t.Errorf("Pool PostRow Unmarshal failed %s", err)
	}

	// Check DefaultServerPort from response
	if *response.DefaultServerPort != 4000 {
		t.Errorf("Failed to set the DefaultServerPort using PostRow")
	}

	// Update pool using PutRaw
	defaultPort = 5000
	updateUri := "/api/pool/" + *response.UUID
	if res, err = avisess.PutRaw(updateUri, &rpool); err != nil {
		t.Errorf("Pool PutRow failed %s", err)
	}
	if err = json.Unmarshal(res, &response); err != nil {
		t.Errorf("Pool PutRow Unmarshal failed %s", err)
	}

	// Get pool using GetRaw
	if res, err = avisess.GetRaw(uri); err != nil {
		t.Errorf("Pool GetRow failed %s", err)
	}
	if err = json.Unmarshal(res, &response); err != nil {
		t.Errorf("Pool GetRow Unmarshal failed %s", err)
	}

	// Check DefaultServerPort from updated response
	if *response.DefaultServerPort != 5000 {
		t.Errorf("Failed to set the DefaultServerPort using PutRow")
	}

	// Delete pool
	if err = avisess.Delete(updateUri); err != nil {
		t.Errorf("Pool deletion failed: %s", err)
	}
}

func testNonDefaultTenantRawAPI(t *testing.T, avisess *AviSession) {
	// Create Tenant
	tenant := "Test-Raw-Tenant"
	tobj := models.Tenant{}
	tname := tenant
	tobj.Name = &tname
	var tres models.Tenant
	var err error
	err = avisess.Post("api/tenant", &tobj, &tres)
	if err != nil {
		t.Errorf("Tenant Creation failed: %s", err)
	}

	// Create Pool in Test-Raw-Tenant using PostRaw
	rpool := models.Pool{}
	pname := "gosdk-test-raw-pool"
	var defaultPort int32 = 4000
	rpool.DefaultServerPort = &defaultPort
	rpool.Name = &pname
	uri := "/api/pool"
	var response models.Pool
	var res []byte
	if res, err = avisess.PostRaw(uri, &rpool, SetOptTenant(tenant)); err != nil {
		t.Errorf("Pool PostRow failed %s", err)
	}
	if err = json.Unmarshal(res, &response); err != nil {
		t.Errorf("Pool PostRow Unmarshal failed %s", err)
	}

	// Check DefaultServerPort from response
	if *response.DefaultServerPort != 4000 {
		t.Errorf("Failed to set the DefaultServerPort using PostRow")
	}

	// Update pool using PutRaw
	defaultPort = 5000
	updateUri := "/api/pool/" + *response.UUID
	if res, err = avisess.PutRaw(updateUri, &rpool, SetOptTenant(tenant)); err != nil {
		t.Errorf("Pool PutRow failed %s", err)
	}
	if err = json.Unmarshal(res, &response); err != nil {
		t.Errorf("Pool PutRow Unmarshal failed %s", err)
	}

	// Get pool using GetRaw
	if res, err = avisess.GetRaw(uri, SetOptTenant(tenant)); err != nil {
		t.Errorf("Pool GetRow failed %s", err)
	}
	if err = json.Unmarshal(res, &response); err != nil {
		t.Errorf("Pool GetRow Unmarshal failed %s", err)
	}

	// Check DefaultServerPort from updated response
	if *response.DefaultServerPort != 5000 {
		t.Errorf("Failed to set the DefaultServerPort using PutRow")
	}

	// Delete pool
	if err = avisess.DeleteObject(updateUri, SetOptTenant(tenant)); err != nil {
		t.Errorf("Pool deletion failed: %s", err)
	}

	// Delete Tenant
	uri = "api/tenant/" + *tres.UUID
	if err = avisess.Delete(uri); err != nil {
		t.Errorf("Tenant Deletion failed: %s", err)
	}
}

func TestRawAPI(t *testing.T) {
	for _, session := range getSessions(t) {
		testRawAPI(t, session)
		testNonDefaultTenantRawAPI(t, session)
	}
}
