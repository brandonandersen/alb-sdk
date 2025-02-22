// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HealthScoreDetails health score details
// swagger:model HealthScoreDetails
type HealthScoreDetails struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AnomalyPenalty *int32 `json:"anomaly_penalty,omitempty"`

	// Reason for Anomaly Penalty. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AnomalyReason *string `json:"anomaly_reason,omitempty"`

	// Reason for Performance Score. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PerformanceReason *string `json:"performance_reason,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PerformanceScore *int32 `json:"performance_score,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	PreviousValue *float64 `json:"previous_value"`

	// Reason for the Health Score Change. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ResourcesPenalty *int32 `json:"resources_penalty,omitempty"`

	// Reason for Resources Penalty. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ResourcesReason *string `json:"resources_reason,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SecurityPenalty *int32 `json:"security_penalty,omitempty"`

	// Reason for Security Threat Level. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SecurityReason *string `json:"security_reason,omitempty"`

	// The step interval in seconds. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Step *int32 `json:"step,omitempty"`

	// Resource prefix containing entity information. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SubResourcePrefix *string `json:"sub_resource_prefix,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Timestamp *string `json:"timestamp"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Value *float64 `json:"value"`
}
