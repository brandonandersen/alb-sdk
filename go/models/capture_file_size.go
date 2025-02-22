// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CaptureFileSize capture file size
// swagger:model CaptureFileSize
type CaptureFileSize struct {

	// Maximum size in MB. Set 0 for avi default size. Allowed values are 100-512000. Special values are 0 - AVI_DEFAULT. Field introduced in 18.2.8. Unit is MB. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AbsoluteSize *int32 `json:"absolute_size,omitempty"`

	// Limits capture to percentage of free disk space. Set 0 for avi default size. Allowed values are 0-75. Field introduced in 18.2.8. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PercentageSize *int32 `json:"percentage_size,omitempty"`
}
