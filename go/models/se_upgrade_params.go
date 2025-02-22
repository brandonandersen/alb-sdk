// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeUpgradeParams se upgrade params
// swagger:model SeUpgradeParams
type SeUpgradeParams struct {

	// This field is used to disable scale-in/scale out operations during upgrade operations. . Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Disruptive *bool `json:"disruptive,omitempty"`

	//  Field deprecated in 18.2.10, 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Force *bool `json:"force,omitempty"`

	// Upgrade System with patch upgrade. Field introduced in 17.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Patch *bool `json:"patch,omitempty"`

	// Rollback System with patch upgrade. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PatchRollback *bool `json:"patch_rollback,omitempty"`

	// Resume from suspended state. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	ResumeFromSuspend *bool `json:"resume_from_suspend,omitempty"`

	// It is used in rollback operations. . Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Rollback *bool `json:"rollback,omitempty"`

	//  It is a reference to an object of type ServiceEngineGroup. Field introduced in 17.2.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeGroupRefs []string `json:"se_group_refs,omitempty"`

	// When set, this will skip upgrade on the Service Engine which is upgrade suspended state. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	SkipSuspended *bool `json:"skip_suspended,omitempty"`

	// When set to true, if there is any failure during the SE upgrade, upgrade will be suspended for this SE group and manual intervention would be needed to resume the upgrade. Field introduced in 17.1.4. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SuspendOnFailure *bool `json:"suspend_on_failure,omitempty"`

	//  Field deprecated in 18.2.10, 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Test *bool `json:"test,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
