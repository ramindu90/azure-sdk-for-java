/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for operation result info.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("OperationResultInfoBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ExportJobsOperationResultInfo", value = ExportJobsOperationResultInfo.class),
    @JsonSubTypes.Type(name = "OperationResultInfo", value = OperationResultInfo.class)
})
public class OperationResultInfoBase {
}