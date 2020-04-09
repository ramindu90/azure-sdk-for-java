/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of integration runtime node.
 */
public class ManagedIntegrationRuntimeNode {
    /**
     * The managed integration runtime node id.
     */
    @JsonProperty(value = "nodeId", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeId;

    /**
     * The managed integration runtime node status. Possible values include:
     * 'Starting', 'Available', 'Recycling', 'Unavailable'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ManagedIntegrationRuntimeNodeStatus status;

    /**
     * The errors that occurred on this integration runtime node.
     */
    @JsonProperty(value = "errors")
    private List<ManagedIntegrationRuntimeError> errors;

    /**
     * Get the managed integration runtime node id.
     *
     * @return the nodeId value
     */
    public String nodeId() {
        return this.nodeId;
    }

    /**
     * Get the managed integration runtime node status. Possible values include: 'Starting', 'Available', 'Recycling', 'Unavailable'.
     *
     * @return the status value
     */
    public ManagedIntegrationRuntimeNodeStatus status() {
        return this.status;
    }

    /**
     * Get the errors that occurred on this integration runtime node.
     *
     * @return the errors value
     */
    public List<ManagedIntegrationRuntimeError> errors() {
        return this.errors;
    }

    /**
     * Set the errors that occurred on this integration runtime node.
     *
     * @param errors the errors value to set
     * @return the ManagedIntegrationRuntimeNode object itself.
     */
    public ManagedIntegrationRuntimeNode withErrors(List<ManagedIntegrationRuntimeError> errors) {
        this.errors = errors;
        return this;
    }

}
