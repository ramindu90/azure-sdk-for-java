// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The MetricValue model.
 */
@Fluent
public final class MetricValue {
    /*
     * the timestamp for the metric value in ISO 8601 format.
     */
    @JsonProperty(value = "timeStamp", required = true)
    private OffsetDateTime timeStamp;

    /*
     * the average value in the time range.
     */
    @JsonProperty(value = "average")
    private Double average;

    /*
     * the least value in the time range.
     */
    @JsonProperty(value = "minimum")
    private Double minimum;

    /*
     * the greatest value in the time range.
     */
    @JsonProperty(value = "maximum")
    private Double maximum;

    /*
     * the sum of all of the values in the time range.
     */
    @JsonProperty(value = "total")
    private Double total;

    /*
     * the number of samples in the time range. Can be used to determine the
     * number of values that contributed to the average value.
     */
    @JsonProperty(value = "count")
    private Double count;

    /**
     * Get the timeStamp property: the timestamp for the metric value in ISO
     * 8601 format.
     * 
     * @return the timeStamp value.
     */
    public OffsetDateTime timeStamp() {
        return this.timeStamp;
    }

    /**
     * Set the timeStamp property: the timestamp for the metric value in ISO
     * 8601 format.
     * 
     * @param timeStamp the timeStamp value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue withTimeStamp(OffsetDateTime timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * Get the average property: the average value in the time range.
     * 
     * @return the average value.
     */
    public Double average() {
        return this.average;
    }

    /**
     * Set the average property: the average value in the time range.
     * 
     * @param average the average value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue withAverage(Double average) {
        this.average = average;
        return this;
    }

    /**
     * Get the minimum property: the least value in the time range.
     * 
     * @return the minimum value.
     */
    public Double minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: the least value in the time range.
     * 
     * @param minimum the minimum value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: the greatest value in the time range.
     * 
     * @return the maximum value.
     */
    public Double maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: the greatest value in the time range.
     * 
     * @param maximum the maximum value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue withMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the total property: the sum of all of the values in the time range.
     * 
     * @return the total value.
     */
    public Double total() {
        return this.total;
    }

    /**
     * Set the total property: the sum of all of the values in the time range.
     * 
     * @param total the total value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue withTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * Get the count property: the number of samples in the time range. Can be
     * used to determine the number of values that contributed to the average
     * value.
     * 
     * @return the count value.
     */
    public Double count() {
        return this.count;
    }

    /**
     * Set the count property: the number of samples in the time range. Can be
     * used to determine the number of values that contributed to the average
     * value.
     * 
     * @param count the count value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue withCount(Double count) {
        this.count = count;
        return this;
    }
}
