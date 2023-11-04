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

package com.google.api.services.clouddeploy.v1.model;

/**
 * RollbackAttempt represents an action of rolling back a Cloud Deploy 'Target'.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deploy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RollbackAttempt extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The phase to which the rollout will be rolled back to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationPhase;

  /**
   * Output only. ID of the rollback `Rollout` to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rolloutId;

  /**
   * Output only. Valid state of this rollback action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Description of the state of the Rollback.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateDesc;

  /**
   * Output only. The phase to which the rollout will be rolled back to.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationPhase() {
    return destinationPhase;
  }

  /**
   * Output only. The phase to which the rollout will be rolled back to.
   * @param destinationPhase destinationPhase or {@code null} for none
   */
  public RollbackAttempt setDestinationPhase(java.lang.String destinationPhase) {
    this.destinationPhase = destinationPhase;
    return this;
  }

  /**
   * Output only. ID of the rollback `Rollout` to create.
   * @return value or {@code null} for none
   */
  public java.lang.String getRolloutId() {
    return rolloutId;
  }

  /**
   * Output only. ID of the rollback `Rollout` to create.
   * @param rolloutId rolloutId or {@code null} for none
   */
  public RollbackAttempt setRolloutId(java.lang.String rolloutId) {
    this.rolloutId = rolloutId;
    return this;
  }

  /**
   * Output only. Valid state of this rollback action.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Valid state of this rollback action.
   * @param state state or {@code null} for none
   */
  public RollbackAttempt setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Description of the state of the Rollback.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateDesc() {
    return stateDesc;
  }

  /**
   * Output only. Description of the state of the Rollback.
   * @param stateDesc stateDesc or {@code null} for none
   */
  public RollbackAttempt setStateDesc(java.lang.String stateDesc) {
    this.stateDesc = stateDesc;
    return this;
  }

  @Override
  public RollbackAttempt set(String fieldName, Object value) {
    return (RollbackAttempt) super.set(fieldName, value);
  }

  @Override
  public RollbackAttempt clone() {
    return (RollbackAttempt) super.clone();
  }

}