// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ElasticPoolLicenseType. */
public final class ElasticPoolLicenseType extends ExpandableStringEnum<ElasticPoolLicenseType> {
    /** Static value LicenseIncluded for ElasticPoolLicenseType. */
    public static final ElasticPoolLicenseType LICENSE_INCLUDED = fromString("LicenseIncluded");

    /** Static value BasePrice for ElasticPoolLicenseType. */
    public static final ElasticPoolLicenseType BASE_PRICE = fromString("BasePrice");

    /**
     * Creates or finds a ElasticPoolLicenseType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ElasticPoolLicenseType.
     */
    @JsonCreator
    public static ElasticPoolLicenseType fromString(String name) {
        return fromString(name, ElasticPoolLicenseType.class);
    }

    /** @return known ElasticPoolLicenseType values. */
    public static Collection<ElasticPoolLicenseType> values() {
        return values(ElasticPoolLicenseType.class);
    }
}
