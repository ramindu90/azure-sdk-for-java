// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OS. */
public final class OS extends ExpandableStringEnum<OS> {
    /** Static value Windows for OS. */
    public static final OS WINDOWS = fromString("Windows");

    /** Static value Linux for OS. */
    public static final OS LINUX = fromString("Linux");

    /**
     * Creates or finds a OS from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OS.
     */
    @JsonCreator
    public static OS fromString(String name) {
        return fromString(name, OS.class);
    }

    /** @return known OS values. */
    public static Collection<OS> values() {
        return values(OS.class);
    }
}
