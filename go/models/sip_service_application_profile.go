// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SipServiceApplicationProfile sip service application profile
// swagger:model SipServiceApplicationProfile
type SipServiceApplicationProfile struct {

	// SIP transaction timeout in seconds. Allowed values are 2-512. Field introduced in 17.2.8, 18.1.3, 18.2.1. Unit is SEC. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TransactionTimeout *int32 `json:"transaction_timeout,omitempty"`
}
