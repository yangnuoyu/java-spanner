/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/common.proto

package com.google.spanner.admin.database.v1;

/**
 *
 *
 * <pre>
 * Encryption configuration describing key resources in Cloud KMS used to
 * encrypt/decrypt a Cloud Spanner database.
 * </pre>
 *
 * Protobuf type {@code google.spanner.admin.database.v1.EncryptionConfig}
 */
public final class EncryptionConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.database.v1.EncryptionConfig)
    EncryptionConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EncryptionConfig.newBuilder() to construct.
  private EncryptionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EncryptionConfig() {
    kmsKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EncryptionConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private EncryptionConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              kmsKey_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.admin.database.v1.CommonProto
        .internal_static_google_spanner_admin_database_v1_EncryptionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.database.v1.CommonProto
        .internal_static_google_spanner_admin_database_v1_EncryptionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.database.v1.EncryptionConfig.class,
            com.google.spanner.admin.database.v1.EncryptionConfig.Builder.class);
  }

  public static final int KMS_KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object kmsKey_;
  /**
   *
   *
   * <pre>
   * Required. A required resource name of the Cloud KMS key that was used to
   * encrypt and decrypt the database. The form of the kms_key is
   * `projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEY_RING]/cryptoKeys/kms_key&gt;`.
   * </pre>
   *
   * <code>string kms_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The kmsKey.
   */
  public java.lang.String getKmsKey() {
    java.lang.Object ref = kmsKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kmsKey_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. A required resource name of the Cloud KMS key that was used to
   * encrypt and decrypt the database. The form of the kms_key is
   * `projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEY_RING]/cryptoKeys/kms_key&gt;`.
   * </pre>
   *
   * <code>string kms_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for kmsKey.
   */
  public com.google.protobuf.ByteString getKmsKeyBytes() {
    java.lang.Object ref = kmsKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      kmsKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getKmsKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kmsKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKmsKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kmsKey_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.spanner.admin.database.v1.EncryptionConfig)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.database.v1.EncryptionConfig other =
        (com.google.spanner.admin.database.v1.EncryptionConfig) obj;

    if (!getKmsKey().equals(other.getKmsKey())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KMS_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKmsKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.spanner.admin.database.v1.EncryptionConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Encryption configuration describing key resources in Cloud KMS used to
   * encrypt/decrypt a Cloud Spanner database.
   * </pre>
   *
   * Protobuf type {@code google.spanner.admin.database.v1.EncryptionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.database.v1.EncryptionConfig)
      com.google.spanner.admin.database.v1.EncryptionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.admin.database.v1.CommonProto
          .internal_static_google_spanner_admin_database_v1_EncryptionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.database.v1.CommonProto
          .internal_static_google_spanner_admin_database_v1_EncryptionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.database.v1.EncryptionConfig.class,
              com.google.spanner.admin.database.v1.EncryptionConfig.Builder.class);
    }

    // Construct using com.google.spanner.admin.database.v1.EncryptionConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      kmsKey_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.admin.database.v1.CommonProto
          .internal_static_google_spanner_admin_database_v1_EncryptionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.EncryptionConfig getDefaultInstanceForType() {
      return com.google.spanner.admin.database.v1.EncryptionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.EncryptionConfig build() {
      com.google.spanner.admin.database.v1.EncryptionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.EncryptionConfig buildPartial() {
      com.google.spanner.admin.database.v1.EncryptionConfig result =
          new com.google.spanner.admin.database.v1.EncryptionConfig(this);
      result.kmsKey_ = kmsKey_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.admin.database.v1.EncryptionConfig) {
        return mergeFrom((com.google.spanner.admin.database.v1.EncryptionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.database.v1.EncryptionConfig other) {
      if (other == com.google.spanner.admin.database.v1.EncryptionConfig.getDefaultInstance())
        return this;
      if (!other.getKmsKey().isEmpty()) {
        kmsKey_ = other.kmsKey_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.spanner.admin.database.v1.EncryptionConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.spanner.admin.database.v1.EncryptionConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object kmsKey_ = "";
    /**
     *
     *
     * <pre>
     * Required. A required resource name of the Cloud KMS key that was used to
     * encrypt and decrypt the database. The form of the kms_key is
     * `projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEY_RING]/cryptoKeys/kms_key&gt;`.
     * </pre>
     *
     * <code>string kms_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The kmsKey.
     */
    public java.lang.String getKmsKey() {
      java.lang.Object ref = kmsKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kmsKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A required resource name of the Cloud KMS key that was used to
     * encrypt and decrypt the database. The form of the kms_key is
     * `projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEY_RING]/cryptoKeys/kms_key&gt;`.
     * </pre>
     *
     * <code>string kms_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for kmsKey.
     */
    public com.google.protobuf.ByteString getKmsKeyBytes() {
      java.lang.Object ref = kmsKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kmsKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A required resource name of the Cloud KMS key that was used to
     * encrypt and decrypt the database. The form of the kms_key is
     * `projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEY_RING]/cryptoKeys/kms_key&gt;`.
     * </pre>
     *
     * <code>string kms_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The kmsKey to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      kmsKey_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A required resource name of the Cloud KMS key that was used to
     * encrypt and decrypt the database. The form of the kms_key is
     * `projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEY_RING]/cryptoKeys/kms_key&gt;`.
     * </pre>
     *
     * <code>string kms_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKmsKey() {

      kmsKey_ = getDefaultInstance().getKmsKey();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A required resource name of the Cloud KMS key that was used to
     * encrypt and decrypt the database. The form of the kms_key is
     * `projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEY_RING]/cryptoKeys/kms_key&gt;`.
     * </pre>
     *
     * <code>string kms_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for kmsKey to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      kmsKey_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.admin.database.v1.EncryptionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.database.v1.EncryptionConfig)
  private static final com.google.spanner.admin.database.v1.EncryptionConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.database.v1.EncryptionConfig();
  }

  public static com.google.spanner.admin.database.v1.EncryptionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncryptionConfig> PARSER =
      new com.google.protobuf.AbstractParser<EncryptionConfig>() {
        @java.lang.Override
        public EncryptionConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new EncryptionConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<EncryptionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncryptionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.admin.database.v1.EncryptionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
