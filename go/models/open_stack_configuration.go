// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OpenStackConfiguration open stack configuration
// swagger:model OpenStackConfiguration
type OpenStackConfiguration struct {

	// OpenStack admin tenant (or project) information. For Keystone v3, provide the project information in project@domain format. Domain need not be specified if the project belongs to the 'Default' domain. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	AdminTenant *string `json:"admin_tenant"`

	// admin-tenant's UUID in OpenStack. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AdminTenantUUID *string `json:"admin_tenant_uuid,omitempty"`

	// If false, allowed-address-pairs extension will not be used. . Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AllowedAddressPairs *bool `json:"allowed_address_pairs,omitempty"`

	// If true, an anti-affinity policy will be applied to all SEs of a SE-Group, else no such policy will be applied. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AntiAffinity *bool `json:"anti_affinity,omitempty"`

	// Auth URL for connecting to keystone. If this is specified, any value provided for keystone_host is ignored. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AuthURL *string `json:"auth_url,omitempty"`

	// If false, metadata service will be used instead of  config-drive functionality to retrieve SE VM metadata. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ConfigDrive *bool `json:"config_drive,omitempty"`

	// When set to True, the VIP and Data ports will be programmed to set virtual machine interface disable-policy. Please refer Contrail documentation for more on disable-policy. Field introduced in 18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ContrailDisablePolicy *bool `json:"contrail_disable_policy,omitempty"`

	// Contrail VNC endpoint url (example http //10.10.10.100 8082). By default, 'http //' scheme and 8082 port will be used if not provided in the url. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ContrailEndpoint *string `json:"contrail_endpoint,omitempty"`

	// Enable Contrail plugin mode. (deprecated). Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ContrailPlugin *bool `json:"contrail_plugin,omitempty"`

	// Custom image properties to be set on a Service Engine image. Only hw_vif_multiqueue_enabled property is supported. Other properties will be ignored. Field introduced in 18.2.7, 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CustomSeImageProperties []*Property `json:"custom_se_image_properties,omitempty"`

	// If True, allow selection of networks marked as 'external' for management,  vip or data networks. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ExternalNetworks *bool `json:"external_networks,omitempty"`

	// Free unused floating IPs. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FreeFloatingips *bool `json:"free_floatingips,omitempty"`

	// Default hypervisor type, only KVM is supported. Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Hypervisor *string `json:"hypervisor,omitempty"`

	// Custom properties per hypervisor type. Field introduced in 17.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	HypervisorProperties []*OpenStackHypervisorProperties `json:"hypervisor_properties,omitempty"`

	// If OS_IMG_FMT_RAW, use RAW images else use QCOW2 for KVM. Enum options - OS_IMG_FMT_AUTO, OS_IMG_FMT_QCOW2, OS_IMG_FMT_VMDK, OS_IMG_FMT_RAW, OS_IMG_FMT_FLAT. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ImgFormat *string `json:"img_format,omitempty"`

	// Import keystone tenants list into Avi. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ImportKeystoneTenants *bool `json:"import_keystone_tenants,omitempty"`

	// Allow self-signed certificates when communicating with https service endpoints. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Insecure *bool `json:"insecure,omitempty"`

	// If True, interface-secondary-ips method will be used for VIP association. Field deprecated in 18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IntfSecIps *bool `json:"intf_sec_ips,omitempty"`

	// Keystone's hostname or IP address. (Deprecated) Use auth_url instead. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	KeystoneHost *string `json:"keystone_host,omitempty"`

	// If True, map Avi 'admin' tenant to the admin_tenant of the Cloud. Else map Avi 'admin' to OpenStack 'admin' tenant. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MapAdminToCloudadmin *bool `json:"map_admin_to_cloudadmin,omitempty"`

	// Avi Management network name or cidr. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	MgmtNetworkName *string `json:"mgmt_network_name"`

	// Management network UUID. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MgmtNetworkUUID *string `json:"mgmt_network_uuid,omitempty"`

	// If True, embed owner info in VIP port 'name', else embed owner info in 'device_id' field. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NameOwner *bool `json:"name_owner,omitempty"`

	// If True, enable neutron rbac discovery of networks shared across tenants/projects. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NeutronRbac *bool `json:"neutron_rbac,omitempty"`

	//  Field deprecated in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NuageOrganization *string `json:"nuage_organization,omitempty"`

	//  Field deprecated in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NuagePassword *string `json:"nuage_password,omitempty"`

	//  Field deprecated in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NuagePort *int32 `json:"nuage_port,omitempty"`

	//  Field deprecated in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NuageUsername *string `json:"nuage_username,omitempty"`

	// Applicable only if allowed-address-pairs is disabled or unusable. VIP placement uses Nuage virtualIp if true, else redirectionTarget. Field deprecated in 20.1.1. Field introduced in 17.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NuageVirtualip *bool `json:"nuage_virtualip,omitempty"`

	// Nuage VSD host name or IP address. Field deprecated in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NuageVsdHost *string `json:"nuage_vsd_host,omitempty"`

	// The password Avi Vantage will use when authenticating to Keystone. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Password *string `json:"password,omitempty"`

	// If true, port-security extension (if detected) will be used instead of security-groups, allowed-address-pairs or interface-secondary-ips. If false, port-security extension is skipped. Field deprecated in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PortSecurity *bool `json:"port_security,omitempty"`

	// Access privilege. Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Privilege *string `json:"privilege"`

	// LBaaS provider name. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ProvName []string `json:"prov_name,omitempty"`

	// A tenant can normally use its own networks and any networks shared with it. In addition, this setting provides extra networks that are usable by tenants. Field introduced in 18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ProviderVipNetworks []*OpenStackVipNetwork `json:"provider_vip_networks,omitempty"`

	// Region name. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Region *string `json:"region,omitempty"`

	// Defines the mapping from OpenStack role names to avi local role names. For an OpenStack role, this mapping is consulted only if there is no local Avi role with the same name as the OpenStack role. This is an ordered list and only the first matching entry is used. You can use '*' to match all OpenStack role names. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RoleMapping []*OpenStackRoleMapping `json:"role_mapping,omitempty"`

	// This field has been generalized for all clouds and has been renamed to se_group_template_uuid. It is a reference to an object of type ServiceEngineGroup. Field deprecated in 18.2.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeGroupRef *string `json:"se_group_ref,omitempty"`

	// If false, security-groups extension will not be used. . Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SecurityGroups *bool `json:"security_groups,omitempty"`

	// If true, then SEs will be created in the appropriate tenants, else SEs will be created in the admin_tenant. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TenantSe *bool `json:"tenant_se,omitempty"`

	// Deprecated, please use provider_vip_networks. Field deprecated in 18.2.2. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UsableNetworkUuids []string `json:"usable_network_uuids,omitempty"`

	// If admin URLs are either inaccessible or not to be accessed from Avi Controller, then set this to False. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UseAdminURL *bool `json:"use_admin_url,omitempty"`

	// Use internalURL for OpenStack endpoints instead of the default publicURL endpoints. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UseInternalEndpoints *bool `json:"use_internal_endpoints,omitempty"`

	// Use keystone for user authentication. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UseKeystoneAuth *bool `json:"use_keystone_auth,omitempty"`

	// If True, use nuage vip as device_owner of VIP ports, else use neutron LOADBALANCER. Field deprecated in 20.1.1. Field introduced in 17.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UseNuagevip *bool `json:"use_nuagevip,omitempty"`

	// The username Avi Vantage will use when authenticating to Keystone. For Keystone v3, provide the user information in user@domain format, unless that user belongs to the Default domain. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Username *string `json:"username"`

	// If enabled, program SE security group with ingress rule to allow SSH (port 22) access from 0.0.0.0/0. Field deprecated in 17.1.5. Field introduced in 17.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	WildcardAccess *bool `json:"wildcard_access,omitempty"`
}
