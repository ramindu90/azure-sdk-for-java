// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.network.ExpressRoutePortsLocationBandwidths;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * ExpressRoutePorts Peering Locationnull.
 */
@JsonFlatten
@Fluent
public class ExpressRoutePortsLocationInner extends Resource {
    /*
     * Address of peering location.
     */
    @JsonProperty(value = "properties.address", access = JsonProperty.Access.WRITE_ONLY)
    private String address;

    /*
     * Contact details of peering locations.
     */
    @JsonProperty(value = "properties.contact", access = JsonProperty.Access.WRITE_ONLY)
    private String contact;

    /*
     * The inventory of available ExpressRoutePort bandwidths.
     */
    @JsonProperty(value = "properties.availableBandwidths")
    private List<ExpressRoutePortsLocationBandwidths> availableBandwidths;

    /*
     * The provisioning state of the ExpressRoutePortLocation resource.
     * Possible values are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the address property: Address of peering location.
     * 
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Get the contact property: Contact details of peering locations.
     * 
     * @return the contact value.
     */
    public String contact() {
        return this.contact;
    }

    /**
     * Get the availableBandwidths property: The inventory of available
     * ExpressRoutePort bandwidths.
     * 
     * @return the availableBandwidths value.
     */
    public List<ExpressRoutePortsLocationBandwidths> availableBandwidths() {
        return this.availableBandwidths;
    }

    /**
     * Set the availableBandwidths property: The inventory of available
     * ExpressRoutePort bandwidths.
     * 
     * @param availableBandwidths the availableBandwidths value to set.
     * @return the ExpressRoutePortsLocationInner object itself.
     */
    public ExpressRoutePortsLocationInner withAvailableBandwidths(List<ExpressRoutePortsLocationBandwidths> availableBandwidths) {
        this.availableBandwidths = availableBandwidths;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the
     * ExpressRoutePortLocation resource. Possible values are: 'Succeeded',
     * 'Updating', 'Deleting', and 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the ExpressRoutePortsLocationInner object itself.
     */
    public ExpressRoutePortsLocationInner withId(String id) {
        this.id = id;
        return this;
    }
}
