// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeVnicUpEventDetails se vnic up event details
// swagger:model SeVnicUpEventDetails
type SeVnicUpEventDetails struct {

	// Vnic name. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IfName *string `json:"if_name,omitempty"`

	// Vnic linux name. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LinuxName *string `json:"linux_name,omitempty"`

	// Mac Address. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Mac *string `json:"mac,omitempty"`

	// UUID of the SE responsible for this event. It is a reference to an object of type ServiceEngine. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
