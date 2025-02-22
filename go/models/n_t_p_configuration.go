// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NTPConfiguration n t p configuration
// swagger:model NTPConfiguration
type NTPConfiguration struct {

	// NTP Authentication keys. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NtpAuthenticationKeys []*NTPAuthenticationKey `json:"ntp_authentication_keys,omitempty"`

	// List of NTP server hostnames or IP addresses. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NtpServerList []*IPAddr `json:"ntp_server_list,omitempty"`

	// List of NTP Servers. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NtpServers []*NTPServer `json:"ntp_servers,omitempty"`
}
