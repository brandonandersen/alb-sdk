// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSOptRecord Dns opt record
// swagger:model DnsOptRecord
type DNSOptRecord struct {

	// Flag indicating client is DNSSEC aware. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DnssecOk *bool `json:"dnssec_ok,omitempty"`

	// EDNS options. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Options []*DNSEdnsOption `json:"options,omitempty"`

	// Client requestor's UDP payload size. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UDPPayloadSize *int32 `json:"udp_payload_size,omitempty"`

	// EDNS version. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Version *int32 `json:"version,omitempty"`
}
