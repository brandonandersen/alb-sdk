// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeRateLimiters se rate limiters
// swagger:model SeRateLimiters
type SeRateLimiters struct {

	// Rate limiter for ARP packets in pps. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ArpRl *int32 `json:"arp_rl,omitempty"`

	// Default Rate limiter in pps. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DefaultRl *int32 `json:"default_rl,omitempty"`

	// Rate limiter for number of flow probes in pps. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FlowProbeRl *int32 `json:"flow_probe_rl,omitempty"`

	// Rate limiter for ICMP requests in pps. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IcmpRl *int32 `json:"icmp_rl,omitempty"`

	// Rate limiter for ICMP response in pps. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IcmpRspRl *int32 `json:"icmp_rsp_rl,omitempty"`

	// Rate limiter for number RST pkts sent in pps. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RstRl *int32 `json:"rst_rl,omitempty"`
}
