// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SnmpTrapServer snmp trap server
// swagger:model SnmpTrapServer
type SnmpTrapServer struct {

	// The community *string to communicate with the trap server. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Community *string `json:"community,omitempty"`

	// IP Address of the SNMP trap destination. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	IPAddr *IPAddr `json:"ip_addr"`

	// The UDP port of the trap server. Field introduced in 16.5.4,17.2.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Port *int32 `json:"port,omitempty"`

	// SNMP version 3 configuration. Field introduced in 17.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	User *SnmpV3UserParams `json:"user,omitempty"`

	// SNMP version support. V2 or V3. Enum options - SNMP_VER2, SNMP_VER3. Field introduced in 17.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Version *string `json:"version,omitempty"`
}
