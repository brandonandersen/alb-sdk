// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolDeploymentUpdateInfo pool deployment update info
// swagger:model PoolDeploymentUpdateInfo
type PoolDeploymentUpdateInfo struct {

	// Pool deployment state used with the PG deployment policy. Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DeploymentState *string `json:"deployment_state,omitempty"`

	// Evaluation period for deployment update. Unit is SEC. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	EvaluationDuration *int32 `json:"evaluation_duration,omitempty"`

	// Operational traffic ratio for the pool. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Ratio *int32 `json:"ratio,omitempty"`

	// List of results for each deployment rule. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Results []*PGDeploymentRuleResult `json:"results,omitempty"`

	// Member Pool's ID. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Reason returned in webhook callback when configured. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	WebhookReason *string `json:"webhook_reason,omitempty"`

	// Result of webhook callback when configured. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	WebhookResult *bool `json:"webhook_result,omitempty"`
}
