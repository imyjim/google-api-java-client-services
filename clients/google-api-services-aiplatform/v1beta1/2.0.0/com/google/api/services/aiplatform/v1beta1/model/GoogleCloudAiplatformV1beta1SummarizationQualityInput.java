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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Input for summarization quality metric.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1SummarizationQualityInput extends com.google.api.client.json.GenericJson {

  /**
   * Required. Summarization quality instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1SummarizationQualityInstance instance;

  /**
   * Required. Spec for summarization quality score metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1SummarizationQualitySpec metricSpec;

  /**
   * Required. Summarization quality instance.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SummarizationQualityInstance getInstance() {
    return instance;
  }

  /**
   * Required. Summarization quality instance.
   * @param instance instance or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SummarizationQualityInput setInstance(GoogleCloudAiplatformV1beta1SummarizationQualityInstance instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Required. Spec for summarization quality score metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SummarizationQualitySpec getMetricSpec() {
    return metricSpec;
  }

  /**
   * Required. Spec for summarization quality score metric.
   * @param metricSpec metricSpec or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SummarizationQualityInput setMetricSpec(GoogleCloudAiplatformV1beta1SummarizationQualitySpec metricSpec) {
    this.metricSpec = metricSpec;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1SummarizationQualityInput set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1SummarizationQualityInput) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1SummarizationQualityInput clone() {
    return (GoogleCloudAiplatformV1beta1SummarizationQualityInput) super.clone();
  }

}
