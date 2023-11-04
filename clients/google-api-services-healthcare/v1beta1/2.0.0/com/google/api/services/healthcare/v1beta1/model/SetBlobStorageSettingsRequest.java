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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Request message for `SetBlobStorageSettings` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SetBlobStorageSettingsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The blob storage settings to update for the specified resources. Only fields listed in
   * `update_mask` are applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BlobStorageSettings blobStorageSettings;

  /**
   * Optional. A filter configuration. If `filter_config` is specified, set the value of `resource`
   * to the resource name of a DICOM store in the format
   * `projects/{projectID}/datasets/{datasetID}/dicomStores/{dicomStoreID}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DicomFilterConfig filterConfig;

  /**
   * The blob storage settings to update for the specified resources. Only fields listed in
   * `update_mask` are applied.
   * @return value or {@code null} for none
   */
  public BlobStorageSettings getBlobStorageSettings() {
    return blobStorageSettings;
  }

  /**
   * The blob storage settings to update for the specified resources. Only fields listed in
   * `update_mask` are applied.
   * @param blobStorageSettings blobStorageSettings or {@code null} for none
   */
  public SetBlobStorageSettingsRequest setBlobStorageSettings(BlobStorageSettings blobStorageSettings) {
    this.blobStorageSettings = blobStorageSettings;
    return this;
  }

  /**
   * Optional. A filter configuration. If `filter_config` is specified, set the value of `resource`
   * to the resource name of a DICOM store in the format
   * `projects/{projectID}/datasets/{datasetID}/dicomStores/{dicomStoreID}`.
   * @return value or {@code null} for none
   */
  public DicomFilterConfig getFilterConfig() {
    return filterConfig;
  }

  /**
   * Optional. A filter configuration. If `filter_config` is specified, set the value of `resource`
   * to the resource name of a DICOM store in the format
   * `projects/{projectID}/datasets/{datasetID}/dicomStores/{dicomStoreID}`.
   * @param filterConfig filterConfig or {@code null} for none
   */
  public SetBlobStorageSettingsRequest setFilterConfig(DicomFilterConfig filterConfig) {
    this.filterConfig = filterConfig;
    return this;
  }

  @Override
  public SetBlobStorageSettingsRequest set(String fieldName, Object value) {
    return (SetBlobStorageSettingsRequest) super.set(fieldName, value);
  }

  @Override
  public SetBlobStorageSettingsRequest clone() {
    return (SetBlobStorageSettingsRequest) super.clone();
  }

}