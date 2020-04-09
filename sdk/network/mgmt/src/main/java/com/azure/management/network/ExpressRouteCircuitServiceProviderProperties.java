// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ExpressRouteCircuitServiceProviderProperties model.
 */
@Fluent
public final class ExpressRouteCircuitServiceProviderProperties {
    /*
     * The serviceProviderName.
     */
    @JsonProperty(value = "serviceProviderName")
    private String serviceProviderName;

    /*
     * The peering location.
     */
    @JsonProperty(value = "peeringLocation")
    private String peeringLocation;

    /*
     * The BandwidthInMbps.
     */
    @JsonProperty(value = "bandwidthInMbps")
    private Integer bandwidthInMbps;

    /**
     * Get the serviceProviderName property: The serviceProviderName.
     * 
     * @return the serviceProviderName value.
     */
    public String serviceProviderName() {
        return this.serviceProviderName;
    }

    /**
     * Set the serviceProviderName property: The serviceProviderName.
     * 
     * @param serviceProviderName the serviceProviderName value to set.
     * @return the ExpressRouteCircuitServiceProviderProperties object itself.
     */
    public ExpressRouteCircuitServiceProviderProperties withServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
        return this;
    }

    /**
     * Get the peeringLocation property: The peering location.
     * 
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the peeringLocation property: The peering location.
     * 
     * @param peeringLocation the peeringLocation value to set.
     * @return the ExpressRouteCircuitServiceProviderProperties object itself.
     */
    public ExpressRouteCircuitServiceProviderProperties withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the bandwidthInMbps property: The BandwidthInMbps.
     * 
     * @return the bandwidthInMbps value.
     */
    public Integer bandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    /**
     * Set the bandwidthInMbps property: The BandwidthInMbps.
     * 
     * @param bandwidthInMbps the bandwidthInMbps value to set.
     * @return the ExpressRouteCircuitServiceProviderProperties object itself.
     */
    public ExpressRouteCircuitServiceProviderProperties withBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }
}
