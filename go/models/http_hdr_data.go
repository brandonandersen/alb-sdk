// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPHdrData HTTP hdr data
// swagger:model HTTPHdrData
type HTTPHdrData struct {

	// HTTP header name. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// HTTP header value. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Value *HTTPHdrValue `json:"value,omitempty"`
}
