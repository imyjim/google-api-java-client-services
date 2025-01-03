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

package com.google.api.services.pubsub.model;

/**
 * Request for the ModifyAckDeadline method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModifyAckDeadlineRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The new ack deadline with respect to the time this request was sent to the Pub/Sub
   * system. For example, if the value is 10, the new ack deadline will expire 10 seconds after the
   * `ModifyAckDeadline` call was made. Specifying zero might immediately make the message available
   * for delivery to another subscriber client. This typically results in an increase in the rate of
   * message redeliveries (that is, duplicates). The minimum deadline you can specify is 0 seconds.
   * The maximum deadline you can specify in a single request is 600 seconds (10 minutes).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ackDeadlineSeconds;

  /**
   * Required. List of acknowledgment IDs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ackIds;

  /**
   * Required. The new ack deadline with respect to the time this request was sent to the Pub/Sub
   * system. For example, if the value is 10, the new ack deadline will expire 10 seconds after the
   * `ModifyAckDeadline` call was made. Specifying zero might immediately make the message available
   * for delivery to another subscriber client. This typically results in an increase in the rate of
   * message redeliveries (that is, duplicates). The minimum deadline you can specify is 0 seconds.
   * The maximum deadline you can specify in a single request is 600 seconds (10 minutes).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAckDeadlineSeconds() {
    return ackDeadlineSeconds;
  }

  /**
   * Required. The new ack deadline with respect to the time this request was sent to the Pub/Sub
   * system. For example, if the value is 10, the new ack deadline will expire 10 seconds after the
   * `ModifyAckDeadline` call was made. Specifying zero might immediately make the message available
   * for delivery to another subscriber client. This typically results in an increase in the rate of
   * message redeliveries (that is, duplicates). The minimum deadline you can specify is 0 seconds.
   * The maximum deadline you can specify in a single request is 600 seconds (10 minutes).
   * @param ackDeadlineSeconds ackDeadlineSeconds or {@code null} for none
   */
  public ModifyAckDeadlineRequest setAckDeadlineSeconds(java.lang.Integer ackDeadlineSeconds) {
    this.ackDeadlineSeconds = ackDeadlineSeconds;
    return this;
  }

  /**
   * Required. List of acknowledgment IDs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAckIds() {
    return ackIds;
  }

  /**
   * Required. List of acknowledgment IDs.
   * @param ackIds ackIds or {@code null} for none
   */
  public ModifyAckDeadlineRequest setAckIds(java.util.List<java.lang.String> ackIds) {
    this.ackIds = ackIds;
    return this;
  }

  @Override
  public ModifyAckDeadlineRequest set(String fieldName, Object value) {
    return (ModifyAckDeadlineRequest) super.set(fieldName, value);
  }

  @Override
  public ModifyAckDeadlineRequest clone() {
    return (ModifyAckDeadlineRequest) super.clone();
  }

}
