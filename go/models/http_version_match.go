// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPVersionMatch HTTP version match
// swagger:model HTTPVersionMatch
type HTTPVersionMatch struct {

	// Criterion to use for HTTP version matching the version used in the HTTP request. Enum options - IS_IN, IS_NOT_IN. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	MatchCriteria *string `json:"match_criteria"`

	// HTTP protocol version. Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO. Minimum of 1 items required. Maximum of 8 items allowed. Allowed in Enterprise with any value edition, Essentials(Allowed values- ONE_ZERO,ONE_ONE) edition, Basic(Allowed values- ONE_ZERO,ONE_ONE) edition, Enterprise with Cloud Services edition.
	Versions []string `json:"versions,omitempty"`
}
