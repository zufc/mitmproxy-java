// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mitm_hub_client.proto

package com.deep007.mitmproxyjava;

public final class MitmProxyHubClientServerProto {
  private MitmProxyHubClientServerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mitm_VoidResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mitm_VoidResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mitm_MitmproxyStartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mitm_MitmproxyStartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mitm_MitmproxyStartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mitm_MitmproxyStartResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mitm_MitmproxyStopRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mitm_MitmproxyStopRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mitm_MitmHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mitm_MitmHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mitm_MitmRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mitm_MitmRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mitm_MitmResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mitm_MitmResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025mitm_hub_client.proto\022\004mitm\"\016\n\014VoidRes" +
      "ponse\"\223\001\n\025MitmproxyStartRequest\022\014\n\004bind\030" +
      "\001 \001(\t\022\014\n\004port\030\002 \001(\005\022\032\n\022callbackServerAdd" +
      "r\030\003 \001(\t\022\032\n\022callbackServerPort\030\004 \001(\005\022\020\n\010u" +
      "pstream\030\005 \001(\t\022\024\n\014upstreamAuth\030\006 \001(\t\"-\n\026M" +
      "itmproxyStartResponse\022\023\n\013mitmproxyId\030\001 \001" +
      "(\t\"+\n\024MitmproxyStopRequest\022\023\n\013mitmproxyI" +
      "d\030\001 \001(\t\")\n\nMitmHeader\022\014\n\004name\030\001 \001(\t\022\r\n\005v" +
      "alue\030\002 \001(\t\"s\n\013MitmRequest\022\013\n\003url\030\001 \001(\t\022\016" +
      "\n\006method\030\002 \001(\t\022!\n\007headers\030\003 \003(\0132\020.mitm.M" +
      "itmHeader\022\017\n\007content\030\004 \001(\014\022\023\n\013mitmproxyI" +
      "d\030\005 \001(\t\"\217\001\n\014MitmResponse\022\"\n\007request\030\001 \001(" +
      "\0132\021.mitm.MitmRequest\022!\n\007headers\030\002 \003(\0132\020." +
      "mitm.MitmHeader\022\017\n\007content\030\003 \001(\014\022\022\n\nstat" +
      "usCode\030\004 \001(\005\022\023\n\013mitmproxyId\030\005 \001(\t2\224\001\n\022Mi" +
      "tmProxyHubServer\022D\n\005start\022\033.mitm.Mitmpro" +
      "xyStartRequest\032\034.mitm.MitmproxyStartResp" +
      "onse\"\000\0228\n\004stop\022\032.mitm.MitmproxyStopReque" +
      "st\032\022.mitm.VoidResponse\"\0002\217\001\n\030MitmProxyHu" +
      "bClientServer\0227\n\ronMitmRequest\022\021.mitm.Mi" +
      "tmRequest\032\021.mitm.MitmRequest\"\000\022:\n\016onMitm" +
      "Response\022\022.mitm.MitmResponse\032\022.mitm.Mitm" +
      "Response\"\000B<\n\031com.deep007.mitmproxyjavaB" +
      "\035MitmProxyHubClientServerProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_mitm_VoidResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mitm_VoidResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mitm_VoidResponse_descriptor,
        new java.lang.String[] { });
    internal_static_mitm_MitmproxyStartRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_mitm_MitmproxyStartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mitm_MitmproxyStartRequest_descriptor,
        new java.lang.String[] { "Bind", "Port", "CallbackServerAddr", "CallbackServerPort", "Upstream", "UpstreamAuth", });
    internal_static_mitm_MitmproxyStartResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_mitm_MitmproxyStartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mitm_MitmproxyStartResponse_descriptor,
        new java.lang.String[] { "MitmproxyId", });
    internal_static_mitm_MitmproxyStopRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_mitm_MitmproxyStopRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mitm_MitmproxyStopRequest_descriptor,
        new java.lang.String[] { "MitmproxyId", });
    internal_static_mitm_MitmHeader_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_mitm_MitmHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mitm_MitmHeader_descriptor,
        new java.lang.String[] { "Name", "Value", });
    internal_static_mitm_MitmRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_mitm_MitmRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mitm_MitmRequest_descriptor,
        new java.lang.String[] { "Url", "Method", "Headers", "Content", "MitmproxyId", });
    internal_static_mitm_MitmResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_mitm_MitmResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mitm_MitmResponse_descriptor,
        new java.lang.String[] { "Request", "Headers", "Content", "StatusCode", "MitmproxyId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
