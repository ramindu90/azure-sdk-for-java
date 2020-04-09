// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The AlertRuleResourceCollection model.
 */
@Fluent
public final class AlertRuleResourceCollectionInner {
    /*
     * the values for the alert rule resources.
     */
    @JsonProperty(value = "value")
    private List<AlertRuleResourceInner> value;

    /**
     * Get the value property: the values for the alert rule resources.
     * 
     * @return the value value.
     */
    public List<AlertRuleResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the values for the alert rule resources.
     * 
     * @param value the value value to set.
     * @return the AlertRuleResourceCollectionInner object itself.
     */
    public AlertRuleResourceCollectionInner withValue(List<AlertRuleResourceInner> value) {
        this.value = value;
        return this;
    }
}
