// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VIMgrDCRuntimeAPIResponse v i mgr d c runtime Api response
// swagger:model VIMgrDCRuntimeApiResponse
type VIMgrDCRuntimeAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*VIMgrDCRuntime `json:"results,omitempty"`
}
