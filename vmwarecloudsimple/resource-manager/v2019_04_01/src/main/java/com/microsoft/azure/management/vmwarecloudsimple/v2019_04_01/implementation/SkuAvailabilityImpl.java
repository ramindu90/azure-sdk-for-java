/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.SkuAvailability;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class SkuAvailabilityImpl extends WrapperImpl<SkuAvailabilityInner> implements SkuAvailability {
    private final VMwareCloudSimpleManager manager;

    SkuAvailabilityImpl(SkuAvailabilityInner inner,  VMwareCloudSimpleManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public VMwareCloudSimpleManager manager() {
        return this.manager;
    }



    @Override
    public String dedicatedAvailabilityZoneId() {
        return this.inner().dedicatedAvailabilityZoneId();
    }

    @Override
    public String dedicatedAvailabilityZoneName() {
        return this.inner().dedicatedAvailabilityZoneName();
    }

    @Override
    public String dedicatedPlacementGroupId() {
        return this.inner().dedicatedPlacementGroupId();
    }

    @Override
    public String dedicatedPlacementGroupName() {
        return this.inner().dedicatedPlacementGroupName();
    }

    @Override
    public int limit() {
        return this.inner().limit();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public String skuId() {
        return this.inner().skuId();
    }

    @Override
    public String skuName() {
        return this.inner().skuName();
    }

}