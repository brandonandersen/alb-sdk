// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Service service
// swagger:model Service
type Service struct {

	// Enable HTTP2 on this port. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials(Allowed values- false) edition, Basic(Allowed values- false) edition, Enterprise with Cloud Services edition.
	EnableHttp2 *bool `json:"enable_http2,omitempty"`

	// Enable SSL termination and offload for traffic from clients. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	EnableSsl *bool `json:"enable_ssl,omitempty"`

	// Used for Horizon deployment. If set used for L7 redirect. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	HorizonInternalPorts *bool `json:"horizon_internal_ports,omitempty"`

	// Enable application layer specific features for the this specific service. It is a reference to an object of type ApplicationProfile. Field introduced in 17.2.4. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	OverrideApplicationProfileRef *string `json:"override_application_profile_ref,omitempty"`

	// Override the network profile for this specific service port. It is a reference to an object of type NetworkProfile. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	OverrideNetworkProfileRef *string `json:"override_network_profile_ref,omitempty"`

	// The Virtual Service's port number. Allowed values are 0-65535. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Port *int32 `json:"port"`

	// The end of the Virtual Service's port number range. Allowed values are 1-65535. Special values are 0- single port. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PortRangeEnd *int32 `json:"port_range_end,omitempty"`
}
