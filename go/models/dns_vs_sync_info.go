// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSVsSyncInfo DNS vs sync info
// swagger:model DNSVsSyncInfo
type DNSVsSyncInfo struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Error *string `json:"error,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TotalRecords *int32 `json:"total_records,omitempty"`
}
