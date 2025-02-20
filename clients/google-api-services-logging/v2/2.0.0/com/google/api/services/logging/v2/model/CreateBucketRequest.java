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

package com.google.api.services.logging.v2.model;

/**
 * The parameters to CreateBucket.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateBucketRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The new bucket. The region specified in the new bucket must be compliant with any
   * Location Restriction Org Policy. The name field in the bucket is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LogBucket bucket;

  /**
   * Required. A client-assigned identifier such as "my-bucket". Identifiers are limited to 100
   * characters and can include only letters, digits, underscores, hyphens, and periods. Bucket
   * identifiers must start with an alphanumeric character.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bucketId;

  /**
   * Required. The resource in which to create the log bucket:
   * "projects/[PROJECT_ID]/locations/[LOCATION_ID]" For example:"projects/my-
   * project/locations/global"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Required. The new bucket. The region specified in the new bucket must be compliant with any
   * Location Restriction Org Policy. The name field in the bucket is ignored.
   * @return value or {@code null} for none
   */
  public LogBucket getBucket() {
    return bucket;
  }

  /**
   * Required. The new bucket. The region specified in the new bucket must be compliant with any
   * Location Restriction Org Policy. The name field in the bucket is ignored.
   * @param bucket bucket or {@code null} for none
   */
  public CreateBucketRequest setBucket(LogBucket bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Required. A client-assigned identifier such as "my-bucket". Identifiers are limited to 100
   * characters and can include only letters, digits, underscores, hyphens, and periods. Bucket
   * identifiers must start with an alphanumeric character.
   * @return value or {@code null} for none
   */
  public java.lang.String getBucketId() {
    return bucketId;
  }

  /**
   * Required. A client-assigned identifier such as "my-bucket". Identifiers are limited to 100
   * characters and can include only letters, digits, underscores, hyphens, and periods. Bucket
   * identifiers must start with an alphanumeric character.
   * @param bucketId bucketId or {@code null} for none
   */
  public CreateBucketRequest setBucketId(java.lang.String bucketId) {
    this.bucketId = bucketId;
    return this;
  }

  /**
   * Required. The resource in which to create the log bucket:
   * "projects/[PROJECT_ID]/locations/[LOCATION_ID]" For example:"projects/my-
   * project/locations/global"
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Required. The resource in which to create the log bucket:
   * "projects/[PROJECT_ID]/locations/[LOCATION_ID]" For example:"projects/my-
   * project/locations/global"
   * @param parent parent or {@code null} for none
   */
  public CreateBucketRequest setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  @Override
  public CreateBucketRequest set(String fieldName, Object value) {
    return (CreateBucketRequest) super.set(fieldName, value);
  }

  @Override
  public CreateBucketRequest clone() {
    return (CreateBucketRequest) super.clone();
  }

}
