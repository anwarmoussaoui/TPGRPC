package ma.emsi.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Définition du service correspondant aux requêtes et mutations GraphQL
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: CompteService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CompteServiceGrpc {

  private CompteServiceGrpc() {}

  public static final String SERVICE_NAME = "CompteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GetAllComptesRequest,
      GetAllComptesResponse> getAllComptesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllComptes",
      requestType = GetAllComptesRequest.class,
      responseType = GetAllComptesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetAllComptesRequest,
      GetAllComptesResponse> getAllComptesMethod() {
    io.grpc.MethodDescriptor<GetAllComptesRequest, GetAllComptesResponse> getAllComptesMethod;
    if ((getAllComptesMethod = CompteServiceGrpc.getAllComptesMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getAllComptesMethod = CompteServiceGrpc.getAllComptesMethod) == null) {
          CompteServiceGrpc.getAllComptesMethod = getAllComptesMethod =
              io.grpc.MethodDescriptor.<GetAllComptesRequest, GetAllComptesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllComptes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetAllComptesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetAllComptesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("AllComptes"))
              .build();
        }
      }
    }
    return getAllComptesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetCompteByIdRequest,
      GetCompteByIdResponse> getCompteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompteById",
      requestType = GetCompteByIdRequest.class,
      responseType = GetCompteByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetCompteByIdRequest,
      GetCompteByIdResponse> getCompteByIdMethod() {
    io.grpc.MethodDescriptor<GetCompteByIdRequest, GetCompteByIdResponse> getCompteByIdMethod;
    if ((getCompteByIdMethod = CompteServiceGrpc.getCompteByIdMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getCompteByIdMethod = CompteServiceGrpc.getCompteByIdMethod) == null) {
          CompteServiceGrpc.getCompteByIdMethod = getCompteByIdMethod =
              io.grpc.MethodDescriptor.<GetCompteByIdRequest, GetCompteByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetCompteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetCompteByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("CompteById"))
              .build();
        }
      }
    }
    return getCompteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetTotalSoldeRequest,
      GetTotalSoldeResponse> getTotalSoldeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalSolde",
      requestType = GetTotalSoldeRequest.class,
      responseType = GetTotalSoldeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetTotalSoldeRequest,
      GetTotalSoldeResponse> getTotalSoldeMethod() {
    io.grpc.MethodDescriptor<GetTotalSoldeRequest, GetTotalSoldeResponse> getTotalSoldeMethod;
    if ((getTotalSoldeMethod = CompteServiceGrpc.getTotalSoldeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getTotalSoldeMethod = CompteServiceGrpc.getTotalSoldeMethod) == null) {
          CompteServiceGrpc.getTotalSoldeMethod = getTotalSoldeMethod =
              io.grpc.MethodDescriptor.<GetTotalSoldeRequest, GetTotalSoldeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalSolde"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetTotalSoldeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetTotalSoldeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("TotalSolde"))
              .build();
        }
      }
    }
    return getTotalSoldeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SaveCompteRequest,
      SaveCompteResponse> getSaveCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveCompte",
      requestType = SaveCompteRequest.class,
      responseType = SaveCompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SaveCompteRequest,
      SaveCompteResponse> getSaveCompteMethod() {
    io.grpc.MethodDescriptor<SaveCompteRequest, SaveCompteResponse> getSaveCompteMethod;
    if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
          CompteServiceGrpc.getSaveCompteMethod = getSaveCompteMethod =
              io.grpc.MethodDescriptor.<SaveCompteRequest, SaveCompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SaveCompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SaveCompteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("SaveCompte"))
              .build();
        }
      }
    }
    return getSaveCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetComptesByTypeRequest,
      GetComptesByTypeResponse> getGetComptesByTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetComptesByType",
      requestType = GetComptesByTypeRequest.class,
      responseType = GetComptesByTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetComptesByTypeRequest,
      GetComptesByTypeResponse> getGetComptesByTypeMethod() {
    io.grpc.MethodDescriptor<GetComptesByTypeRequest, GetComptesByTypeResponse> getGetComptesByTypeMethod;
    if ((getGetComptesByTypeMethod = CompteServiceGrpc.getGetComptesByTypeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetComptesByTypeMethod = CompteServiceGrpc.getGetComptesByTypeMethod) == null) {
          CompteServiceGrpc.getGetComptesByTypeMethod = getGetComptesByTypeMethod =
              io.grpc.MethodDescriptor.<GetComptesByTypeRequest, GetComptesByTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetComptesByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetComptesByTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetComptesByTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("GetComptesByType"))
              .build();
        }
      }
    }
    return getGetComptesByTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DeleteCompteRequest,
      DeleteCompteResponse> getDeleteCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCompte",
      requestType = DeleteCompteRequest.class,
      responseType = DeleteCompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DeleteCompteRequest,
      DeleteCompteResponse> getDeleteCompteMethod() {
    io.grpc.MethodDescriptor<DeleteCompteRequest, DeleteCompteResponse> getDeleteCompteMethod;
    if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
          CompteServiceGrpc.getDeleteCompteMethod = getDeleteCompteMethod =
              io.grpc.MethodDescriptor.<DeleteCompteRequest, DeleteCompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DeleteCompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DeleteCompteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("DeleteCompte"))
              .build();
        }
      }
    }
    return getDeleteCompteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompteServiceStub>() {
        @Override
        public CompteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompteServiceStub(channel, callOptions);
        }
      };
    return CompteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompteServiceBlockingStub>() {
        @Override
        public CompteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompteServiceBlockingStub(channel, callOptions);
        }
      };
    return CompteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompteServiceFutureStub>() {
        @Override
        public CompteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompteServiceFutureStub(channel, callOptions);
        }
      };
    return CompteServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static abstract class CompteServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public void allComptes(GetAllComptesRequest request,
                           io.grpc.stub.StreamObserver<GetAllComptesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllComptesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public void compteById(GetCompteByIdRequest request,
                           io.grpc.stub.StreamObserver<GetCompteByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompteByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public void totalSolde(GetTotalSoldeRequest request,
                           io.grpc.stub.StreamObserver<GetTotalSoldeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalSoldeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public void saveCompte(SaveCompteRequest request,
                           io.grpc.stub.StreamObserver<SaveCompteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveCompteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Nouvelle requête pour trouver les comptes par type
     * </pre>
     */
    public void getComptesByType(GetComptesByTypeRequest request,
                                 io.grpc.stub.StreamObserver<GetComptesByTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetComptesByTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Nouvelle mutation pour supprimer un compte
     * </pre>
     */
    public void deleteCompte(DeleteCompteRequest request,
                             io.grpc.stub.StreamObserver<DeleteCompteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCompteMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllComptesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GetAllComptesRequest,
                GetAllComptesResponse>(
                  this, METHODID_ALL_COMPTES)))
          .addMethod(
            getCompteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GetCompteByIdRequest,
                GetCompteByIdResponse>(
                  this, METHODID_COMPTE_BY_ID)))
          .addMethod(
            getTotalSoldeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GetTotalSoldeRequest,
                GetTotalSoldeResponse>(
                  this, METHODID_TOTAL_SOLDE)))
          .addMethod(
            getSaveCompteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SaveCompteRequest,
                SaveCompteResponse>(
                  this, METHODID_SAVE_COMPTE)))
          .addMethod(
            getGetComptesByTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GetComptesByTypeRequest,
                GetComptesByTypeResponse>(
                  this, METHODID_GET_COMPTES_BY_TYPE)))
          .addMethod(
            getDeleteCompteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                DeleteCompteRequest,
                DeleteCompteResponse>(
                  this, METHODID_DELETE_COMPTE)))
          .build();
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceStub extends io.grpc.stub.AbstractAsyncStub<CompteServiceStub> {
    private CompteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CompteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompteServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public void allComptes(GetAllComptesRequest request,
                           io.grpc.stub.StreamObserver<GetAllComptesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllComptesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public void compteById(GetCompteByIdRequest request,
                           io.grpc.stub.StreamObserver<GetCompteByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public void totalSolde(GetTotalSoldeRequest request,
                           io.grpc.stub.StreamObserver<GetTotalSoldeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalSoldeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public void saveCompte(SaveCompteRequest request,
                           io.grpc.stub.StreamObserver<SaveCompteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Nouvelle requête pour trouver les comptes par type
     * </pre>
     */
    public void getComptesByType(GetComptesByTypeRequest request,
                                 io.grpc.stub.StreamObserver<GetComptesByTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetComptesByTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Nouvelle mutation pour supprimer un compte
     * </pre>
     */
    public void deleteCompte(DeleteCompteRequest request,
                             io.grpc.stub.StreamObserver<DeleteCompteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CompteServiceBlockingStub> {
    private CompteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CompteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompteServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public GetAllComptesResponse allComptes(GetAllComptesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllComptesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public GetCompteByIdResponse compteById(GetCompteByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompteByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public GetTotalSoldeResponse totalSolde(GetTotalSoldeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalSoldeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public SaveCompteResponse saveCompte(SaveCompteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveCompteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Nouvelle requête pour trouver les comptes par type
     * </pre>
     */
    public GetComptesByTypeResponse getComptesByType(GetComptesByTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetComptesByTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Nouvelle mutation pour supprimer un compte
     * </pre>
     */
    public DeleteCompteResponse deleteCompte(DeleteCompteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCompteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CompteServiceFutureStub> {
    private CompteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CompteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompteServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetAllComptesResponse> allComptes(
        GetAllComptesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllComptesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetCompteByIdResponse> compteById(
        GetCompteByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompteByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetTotalSoldeResponse> totalSolde(
        GetTotalSoldeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalSoldeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SaveCompteResponse> saveCompte(
        SaveCompteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Nouvelle requête pour trouver les comptes par type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetComptesByTypeResponse> getComptesByType(
        GetComptesByTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetComptesByTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Nouvelle mutation pour supprimer un compte
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<DeleteCompteResponse> deleteCompte(
        DeleteCompteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_COMPTES = 0;
  private static final int METHODID_COMPTE_BY_ID = 1;
  private static final int METHODID_TOTAL_SOLDE = 2;
  private static final int METHODID_SAVE_COMPTE = 3;
  private static final int METHODID_GET_COMPTES_BY_TYPE = 4;
  private static final int METHODID_DELETE_COMPTE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_COMPTES:
          serviceImpl.allComptes((GetAllComptesRequest) request,
              (io.grpc.stub.StreamObserver<GetAllComptesResponse>) responseObserver);
          break;
        case METHODID_COMPTE_BY_ID:
          serviceImpl.compteById((GetCompteByIdRequest) request,
              (io.grpc.stub.StreamObserver<GetCompteByIdResponse>) responseObserver);
          break;
        case METHODID_TOTAL_SOLDE:
          serviceImpl.totalSolde((GetTotalSoldeRequest) request,
              (io.grpc.stub.StreamObserver<GetTotalSoldeResponse>) responseObserver);
          break;
        case METHODID_SAVE_COMPTE:
          serviceImpl.saveCompte((SaveCompteRequest) request,
              (io.grpc.stub.StreamObserver<SaveCompteResponse>) responseObserver);
          break;
        case METHODID_GET_COMPTES_BY_TYPE:
          serviceImpl.getComptesByType((GetComptesByTypeRequest) request,
              (io.grpc.stub.StreamObserver<GetComptesByTypeResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMPTE:
          serviceImpl.deleteCompte((DeleteCompteRequest) request,
              (io.grpc.stub.StreamObserver<DeleteCompteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompteServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CompteServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompteService");
    }
  }

  private static final class CompteServiceFileDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier {
    CompteServiceFileDescriptorSupplier() {}
  }

  private static final class CompteServiceMethodDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompteServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CompteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompteServiceFileDescriptorSupplier())
              .addMethod(getAllComptesMethod())
              .addMethod(getCompteByIdMethod())
              .addMethod(getTotalSoldeMethod())
              .addMethod(getSaveCompteMethod())
              .addMethod(getGetComptesByTypeMethod())
              .addMethod(getDeleteCompteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
