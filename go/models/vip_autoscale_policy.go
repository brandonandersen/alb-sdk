// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VipAutoscalePolicy vip autoscale policy
// swagger:model VipAutoscalePolicy
type VipAutoscalePolicy struct {

	// The amount of time, in seconds, when a Vip is withdrawn before a scaling activity starts. Field introduced in 17.2.12, 18.1.2. Unit is SECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DNSCooldown *int32 `json:"dns_cooldown,omitempty"`

	// The maximum size of the group. Field introduced in 17.2.12, 18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MaxSize *int32 `json:"max_size,omitempty"`

	// The minimum size of the group. Field introduced in 17.2.12, 18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MinSize *int32 `json:"min_size,omitempty"`

	// When set, scaling is suspended. Field introduced in 17.2.12, 18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Suspend *bool `json:"suspend,omitempty"`
}
