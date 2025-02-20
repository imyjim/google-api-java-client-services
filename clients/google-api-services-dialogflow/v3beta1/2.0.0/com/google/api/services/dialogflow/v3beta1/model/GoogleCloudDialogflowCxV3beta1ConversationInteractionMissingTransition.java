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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Information collected for DF CX agents in case NLU predicted an intent that was filtered out as
 * being inactive which may indicate a missing transition and/or absent functionality.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1ConversationInteractionMissingTransition extends com.google.api.client.json.GenericJson {

  /**
   * Name of the intent that could have triggered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String intentDisplayName;

  /**
   * Score of the above intent. The higher it is the more likely a transition was missed on a given
   * page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float score;

  /**
   * Name of the intent that could have triggered.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntentDisplayName() {
    return intentDisplayName;
  }

  /**
   * Name of the intent that could have triggered.
   * @param intentDisplayName intentDisplayName or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ConversationInteractionMissingTransition setIntentDisplayName(java.lang.String intentDisplayName) {
    this.intentDisplayName = intentDisplayName;
    return this;
  }

  /**
   * Score of the above intent. The higher it is the more likely a transition was missed on a given
   * page.
   * @return value or {@code null} for none
   */
  public java.lang.Float getScore() {
    return score;
  }

  /**
   * Score of the above intent. The higher it is the more likely a transition was missed on a given
   * page.
   * @param score score or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ConversationInteractionMissingTransition setScore(java.lang.Float score) {
    this.score = score;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ConversationInteractionMissingTransition set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1ConversationInteractionMissingTransition) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ConversationInteractionMissingTransition clone() {
    return (GoogleCloudDialogflowCxV3beta1ConversationInteractionMissingTransition) super.clone();
  }

}
