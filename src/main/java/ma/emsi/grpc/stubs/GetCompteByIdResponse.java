// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompteService.proto

package ma.emsi.grpc.stubs;

/**
 * <pre>
 * Réponse contenant le compte demandé
 * </pre>
 *
 * Protobuf type {@code GetCompteByIdResponse}
 */
public  final class GetCompteByIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetCompteByIdResponse)
    GetCompteByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCompteByIdResponse.newBuilder() to construct.
  private GetCompteByIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCompteByIdResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCompteByIdResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCompteByIdResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 10: {
            Compte.Builder subBuilder = null;
            if (compte_ != null) {
              subBuilder = compte_.toBuilder();
            }
            compte_ = input.readMessage(Compte.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(compte_);
              compte_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return CompteServiceOuterClass.internal_static_GetCompteByIdResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return CompteServiceOuterClass.internal_static_GetCompteByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GetCompteByIdResponse.class, Builder.class);
  }

  public static final int COMPTE_FIELD_NUMBER = 1;
  private Compte compte_;
  /**
   * <code>.Compte compte = 1;</code>
   * @return Whether the compte field is set.
   */
  public boolean hasCompte() {
    return compte_ != null;
  }
  /**
   * <code>.Compte compte = 1;</code>
   * @return The compte.
   */
  public Compte getCompte() {
    return compte_ == null ? Compte.getDefaultInstance() : compte_;
  }
  /**
   * <code>.Compte compte = 1;</code>
   */
  public CompteOrBuilder getCompteOrBuilder() {
    return getCompte();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (compte_ != null) {
      output.writeMessage(1, getCompte());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (compte_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCompte());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof GetCompteByIdResponse)) {
      return super.equals(obj);
    }
    GetCompteByIdResponse other = (GetCompteByIdResponse) obj;

    if (hasCompte() != other.hasCompte()) return false;
    if (hasCompte()) {
      if (!getCompte()
          .equals(other.getCompte())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCompte()) {
      hash = (37 * hash) + COMPTE_FIELD_NUMBER;
      hash = (53 * hash) + getCompte().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GetCompteByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetCompteByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetCompteByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetCompteByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetCompteByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetCompteByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetCompteByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetCompteByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetCompteByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GetCompteByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetCompteByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetCompteByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(GetCompteByIdResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Réponse contenant le compte demandé
   * </pre>
   *
   * Protobuf type {@code GetCompteByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetCompteByIdResponse)
      GetCompteByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CompteServiceOuterClass.internal_static_GetCompteByIdResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CompteServiceOuterClass.internal_static_GetCompteByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetCompteByIdResponse.class, Builder.class);
    }

    // Construct using ma.emsi.grpc.stubs.GetCompteByIdResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (compteBuilder_ == null) {
        compte_ = null;
      } else {
        compte_ = null;
        compteBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return CompteServiceOuterClass.internal_static_GetCompteByIdResponse_descriptor;
    }

    @Override
    public GetCompteByIdResponse getDefaultInstanceForType() {
      return GetCompteByIdResponse.getDefaultInstance();
    }

    @Override
    public GetCompteByIdResponse build() {
      GetCompteByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GetCompteByIdResponse buildPartial() {
      GetCompteByIdResponse result = new GetCompteByIdResponse(this);
      if (compteBuilder_ == null) {
        result.compte_ = compte_;
      } else {
        result.compte_ = compteBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GetCompteByIdResponse) {
        return mergeFrom((GetCompteByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GetCompteByIdResponse other) {
      if (other == GetCompteByIdResponse.getDefaultInstance()) return this;
      if (other.hasCompte()) {
        mergeCompte(other.getCompte());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      GetCompteByIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GetCompteByIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Compte compte_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Compte, Compte.Builder, CompteOrBuilder> compteBuilder_;
    /**
     * <code>.Compte compte = 1;</code>
     * @return Whether the compte field is set.
     */
    public boolean hasCompte() {
      return compteBuilder_ != null || compte_ != null;
    }
    /**
     * <code>.Compte compte = 1;</code>
     * @return The compte.
     */
    public Compte getCompte() {
      if (compteBuilder_ == null) {
        return compte_ == null ? Compte.getDefaultInstance() : compte_;
      } else {
        return compteBuilder_.getMessage();
      }
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public Builder setCompte(Compte value) {
      if (compteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        compte_ = value;
        onChanged();
      } else {
        compteBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public Builder setCompte(
        Compte.Builder builderForValue) {
      if (compteBuilder_ == null) {
        compte_ = builderForValue.build();
        onChanged();
      } else {
        compteBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public Builder mergeCompte(Compte value) {
      if (compteBuilder_ == null) {
        if (compte_ != null) {
          compte_ =
            Compte.newBuilder(compte_).mergeFrom(value).buildPartial();
        } else {
          compte_ = value;
        }
        onChanged();
      } else {
        compteBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public Builder clearCompte() {
      if (compteBuilder_ == null) {
        compte_ = null;
        onChanged();
      } else {
        compte_ = null;
        compteBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public Compte.Builder getCompteBuilder() {
      
      onChanged();
      return getCompteFieldBuilder().getBuilder();
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    public CompteOrBuilder getCompteOrBuilder() {
      if (compteBuilder_ != null) {
        return compteBuilder_.getMessageOrBuilder();
      } else {
        return compte_ == null ?
            Compte.getDefaultInstance() : compte_;
      }
    }
    /**
     * <code>.Compte compte = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Compte, Compte.Builder, CompteOrBuilder>
        getCompteFieldBuilder() {
      if (compteBuilder_ == null) {
        compteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Compte, Compte.Builder, CompteOrBuilder>(
                getCompte(),
                getParentForChildren(),
                isClean());
        compte_ = null;
      }
      return compteBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GetCompteByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:GetCompteByIdResponse)
  private static final GetCompteByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetCompteByIdResponse();
  }

  public static GetCompteByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCompteByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCompteByIdResponse>() {
    @Override
    public GetCompteByIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCompteByIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCompteByIdResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetCompteByIdResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public GetCompteByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

