// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AlertMetricThreshold alert metric threshold
// swagger:model AlertMetricThreshold
type AlertMetricThreshold struct {

	//  Enum options - ALERT_OP_LT, ALERT_OP_LE, ALERT_OP_EQ, ALERT_OP_NE, ALERT_OP_GE, ALERT_OP_GT. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Comparator *string `json:"comparator"`

	// Metric threshold for comparison. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Threshold *int32 `json:"threshold,omitempty"`
}
