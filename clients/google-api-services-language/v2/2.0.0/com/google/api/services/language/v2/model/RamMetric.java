/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.language.v2.model;

/**
 * Model definition for RamMetric.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RamMetric extends com.google.api.client.json.GenericJson {

  /**
   * Required. VM memory in Gigabyte second, e.g. 3600. Using int64 type to match billing metrics
   * definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long gibSec;

  /**
   * Required. Machine spec, e.g. N1_STANDARD_4.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineSpec;

  /**
   * Required. VM memory in gb.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double memories;

  /**
   * Required. Type of ram.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ramType;

  /**
   * Billing tracking labels. They do not contain any user data but only the labels set by Vertex
   * Core Infra itself. Tracking labels' keys are defined with special format: goog-[\p{Ll}\p{N}]+
   * E.g. "key": "goog-k8s-cluster-name","value": "us-east1-b4rk"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> trackingLabels;

  /**
   * Required. VM memory in Gigabyte second, e.g. 3600. Using int64 type to match billing metrics
   * definition.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGibSec() {
    return gibSec;
  }

  /**
   * Required. VM memory in Gigabyte second, e.g. 3600. Using int64 type to match billing metrics
   * definition.
   * @param gibSec gibSec or {@code null} for none
   */
  public RamMetric setGibSec(java.lang.Long gibSec) {
    this.gibSec = gibSec;
    return this;
  }

  /**
   * Required. Machine spec, e.g. N1_STANDARD_4.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineSpec() {
    return machineSpec;
  }

  /**
   * Required. Machine spec, e.g. N1_STANDARD_4.
   * @param machineSpec machineSpec or {@code null} for none
   */
  public RamMetric setMachineSpec(java.lang.String machineSpec) {
    this.machineSpec = machineSpec;
    return this;
  }

  /**
   * Required. VM memory in gb.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMemories() {
    return memories;
  }

  /**
   * Required. VM memory in gb.
   * @param memories memories or {@code null} for none
   */
  public RamMetric setMemories(java.lang.Double memories) {
    this.memories = memories;
    return this;
  }

  /**
   * Required. Type of ram.
   * @return value or {@code null} for none
   */
  public java.lang.String getRamType() {
    return ramType;
  }

  /**
   * Required. Type of ram.
   * @param ramType ramType or {@code null} for none
   */
  public RamMetric setRamType(java.lang.String ramType) {
    this.ramType = ramType;
    return this;
  }

  /**
   * Billing tracking labels. They do not contain any user data but only the labels set by Vertex
   * Core Infra itself. Tracking labels' keys are defined with special format: goog-[\p{Ll}\p{N}]+
   * E.g. "key": "goog-k8s-cluster-name","value": "us-east1-b4rk"
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getTrackingLabels() {
    return trackingLabels;
  }

  /**
   * Billing tracking labels. They do not contain any user data but only the labels set by Vertex
   * Core Infra itself. Tracking labels' keys are defined with special format: goog-[\p{Ll}\p{N}]+
   * E.g. "key": "goog-k8s-cluster-name","value": "us-east1-b4rk"
   * @param trackingLabels trackingLabels or {@code null} for none
   */
  public RamMetric setTrackingLabels(java.util.Map<String, java.lang.String> trackingLabels) {
    this.trackingLabels = trackingLabels;
    return this;
  }

  @Override
  public RamMetric set(String fieldName, Object value) {
    return (RamMetric) super.set(fieldName, value);
  }

  @Override
  public RamMetric clone() {
    return (RamMetric) super.clone();
  }

}
