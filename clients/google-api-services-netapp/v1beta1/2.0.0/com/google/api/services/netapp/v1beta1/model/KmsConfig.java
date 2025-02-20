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

package com.google.api.services.netapp.v1beta1.model;

/**
 * KmsConfig is the customer managed encryption key(CMEK) configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the NetApp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KmsConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Create time of the KmsConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. Customer managed crypto key resource full name. Format:
   * projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{key}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cryptoKeyName;

  /**
   * Description of the KmsConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. Instructions to provide the access to the customer provided encryption key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instructions;

  /**
   * Labels as key value pairs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Identifier. Name of the KmsConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The Service account which will have access to the customer provided encryption
   * key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Output only. State of the KmsConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. State details of the KmsConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateDetails;

  /**
   * Output only. Create time of the KmsConfig.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Create time of the KmsConfig.
   * @param createTime createTime or {@code null} for none
   */
  public KmsConfig setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. Customer managed crypto key resource full name. Format:
   * projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{key}.
   * @return value or {@code null} for none
   */
  public java.lang.String getCryptoKeyName() {
    return cryptoKeyName;
  }

  /**
   * Required. Customer managed crypto key resource full name. Format:
   * projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{key}.
   * @param cryptoKeyName cryptoKeyName or {@code null} for none
   */
  public KmsConfig setCryptoKeyName(java.lang.String cryptoKeyName) {
    this.cryptoKeyName = cryptoKeyName;
    return this;
  }

  /**
   * Description of the KmsConfig.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the KmsConfig.
   * @param description description or {@code null} for none
   */
  public KmsConfig setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. Instructions to provide the access to the customer provided encryption key.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstructions() {
    return instructions;
  }

  /**
   * Output only. Instructions to provide the access to the customer provided encryption key.
   * @param instructions instructions or {@code null} for none
   */
  public KmsConfig setInstructions(java.lang.String instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * Labels as key value pairs
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels as key value pairs
   * @param labels labels or {@code null} for none
   */
  public KmsConfig setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Identifier. Name of the KmsConfig.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Name of the KmsConfig.
   * @param name name or {@code null} for none
   */
  public KmsConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The Service account which will have access to the customer provided encryption
   * key.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Output only. The Service account which will have access to the customer provided encryption
   * key.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public KmsConfig setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Output only. State of the KmsConfig.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the KmsConfig.
   * @param state state or {@code null} for none
   */
  public KmsConfig setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. State details of the KmsConfig.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateDetails() {
    return stateDetails;
  }

  /**
   * Output only. State details of the KmsConfig.
   * @param stateDetails stateDetails or {@code null} for none
   */
  public KmsConfig setStateDetails(java.lang.String stateDetails) {
    this.stateDetails = stateDetails;
    return this;
  }

  @Override
  public KmsConfig set(String fieldName, Object value) {
    return (KmsConfig) super.set(fieldName, value);
  }

  @Override
  public KmsConfig clone() {
    return (KmsConfig) super.clone();
  }

}
