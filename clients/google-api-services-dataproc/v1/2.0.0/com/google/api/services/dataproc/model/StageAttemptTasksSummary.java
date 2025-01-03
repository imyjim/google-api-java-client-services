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

package com.google.api.services.dataproc.model;

/**
 * Data related to tasks summary for a Spark Stage Attempt
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StageAttemptTasksSummary extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String applicationId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numFailedTasks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numKilledTasks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numPendingTasks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numRunningTasks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numSuccessTasks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numTasks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer stageAttemptId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long stageId;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getApplicationId() {
    return applicationId;
  }

  /**
   * @param applicationId applicationId or {@code null} for none
   */
  public StageAttemptTasksSummary setApplicationId(java.lang.String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumFailedTasks() {
    return numFailedTasks;
  }

  /**
   * @param numFailedTasks numFailedTasks or {@code null} for none
   */
  public StageAttemptTasksSummary setNumFailedTasks(java.lang.Integer numFailedTasks) {
    this.numFailedTasks = numFailedTasks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumKilledTasks() {
    return numKilledTasks;
  }

  /**
   * @param numKilledTasks numKilledTasks or {@code null} for none
   */
  public StageAttemptTasksSummary setNumKilledTasks(java.lang.Integer numKilledTasks) {
    this.numKilledTasks = numKilledTasks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumPendingTasks() {
    return numPendingTasks;
  }

  /**
   * @param numPendingTasks numPendingTasks or {@code null} for none
   */
  public StageAttemptTasksSummary setNumPendingTasks(java.lang.Integer numPendingTasks) {
    this.numPendingTasks = numPendingTasks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumRunningTasks() {
    return numRunningTasks;
  }

  /**
   * @param numRunningTasks numRunningTasks or {@code null} for none
   */
  public StageAttemptTasksSummary setNumRunningTasks(java.lang.Integer numRunningTasks) {
    this.numRunningTasks = numRunningTasks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumSuccessTasks() {
    return numSuccessTasks;
  }

  /**
   * @param numSuccessTasks numSuccessTasks or {@code null} for none
   */
  public StageAttemptTasksSummary setNumSuccessTasks(java.lang.Integer numSuccessTasks) {
    this.numSuccessTasks = numSuccessTasks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumTasks() {
    return numTasks;
  }

  /**
   * @param numTasks numTasks or {@code null} for none
   */
  public StageAttemptTasksSummary setNumTasks(java.lang.Integer numTasks) {
    this.numTasks = numTasks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStageAttemptId() {
    return stageAttemptId;
  }

  /**
   * @param stageAttemptId stageAttemptId or {@code null} for none
   */
  public StageAttemptTasksSummary setStageAttemptId(java.lang.Integer stageAttemptId) {
    this.stageAttemptId = stageAttemptId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getStageId() {
    return stageId;
  }

  /**
   * @param stageId stageId or {@code null} for none
   */
  public StageAttemptTasksSummary setStageId(java.lang.Long stageId) {
    this.stageId = stageId;
    return this;
  }

  @Override
  public StageAttemptTasksSummary set(String fieldName, Object value) {
    return (StageAttemptTasksSummary) super.set(fieldName, value);
  }

  @Override
  public StageAttemptTasksSummary clone() {
    return (StageAttemptTasksSummary) super.clone();
  }

}
