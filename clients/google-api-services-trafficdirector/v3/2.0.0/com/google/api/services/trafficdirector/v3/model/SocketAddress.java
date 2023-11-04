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

package com.google.api.services.trafficdirector.v3.model;

/**
 * [#next-free-field: 7]
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Traffic Director API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SocketAddress extends com.google.api.client.json.GenericJson {

  /**
   * The address for this socket. :ref:`Listeners ` will bind to the address. An empty address is
   * not allowed. Specify ``0.0.0.0`` or ``::`` to bind to any address. [#comment:TODO(zuercher)
   * reinstate when implemented: It is possible to distinguish a Listener address via the
   * prefix/suffix matching in :ref:`FilterChainMatch `.] When used within an upstream
   * :ref:`BindConfig `, the address controls the source address of outbound connections. For
   * :ref:`clusters `, the cluster type determines whether the address must be an IP (``STATIC`` or
   * ``EDS`` clusters) or a hostname resolved by DNS (``STRICT_DNS`` or ``LOGICAL_DNS`` clusters).
   * Address resolution can be customized via :ref:`resolver_name `.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * When binding to an IPv6 address above, this enables `IPv4 compatibility `_. Binding to ``::``
   * will allow both IPv4 and IPv6 connections, with peer IPv4 addresses mapped into IPv6 space as
   * ``::FFFF:``.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ipv4Compat;

  /**
   * This is only valid if :ref:`resolver_name ` is specified below and the named resolver is
   * capable of named port resolution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namedPort;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long portValue;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protocol;

  /**
   * The name of the custom resolver. This must have been registered with Envoy. If this is empty, a
   * context dependent default applies. If the address is a concrete IP address, no resolution will
   * occur. If address is a hostname this should be set for resolution other than DNS. Specifying a
   * custom resolver with ``STRICT_DNS`` or ``LOGICAL_DNS`` will generate an error at runtime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resolverName;

  /**
   * The address for this socket. :ref:`Listeners ` will bind to the address. An empty address is
   * not allowed. Specify ``0.0.0.0`` or ``::`` to bind to any address. [#comment:TODO(zuercher)
   * reinstate when implemented: It is possible to distinguish a Listener address via the
   * prefix/suffix matching in :ref:`FilterChainMatch `.] When used within an upstream
   * :ref:`BindConfig `, the address controls the source address of outbound connections. For
   * :ref:`clusters `, the cluster type determines whether the address must be an IP (``STATIC`` or
   * ``EDS`` clusters) or a hostname resolved by DNS (``STRICT_DNS`` or ``LOGICAL_DNS`` clusters).
   * Address resolution can be customized via :ref:`resolver_name `.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * The address for this socket. :ref:`Listeners ` will bind to the address. An empty address is
   * not allowed. Specify ``0.0.0.0`` or ``::`` to bind to any address. [#comment:TODO(zuercher)
   * reinstate when implemented: It is possible to distinguish a Listener address via the
   * prefix/suffix matching in :ref:`FilterChainMatch `.] When used within an upstream
   * :ref:`BindConfig `, the address controls the source address of outbound connections. For
   * :ref:`clusters `, the cluster type determines whether the address must be an IP (``STATIC`` or
   * ``EDS`` clusters) or a hostname resolved by DNS (``STRICT_DNS`` or ``LOGICAL_DNS`` clusters).
   * Address resolution can be customized via :ref:`resolver_name `.
   * @param address address or {@code null} for none
   */
  public SocketAddress setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * When binding to an IPv6 address above, this enables `IPv4 compatibility `_. Binding to ``::``
   * will allow both IPv4 and IPv6 connections, with peer IPv4 addresses mapped into IPv6 space as
   * ``::FFFF:``.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIpv4Compat() {
    return ipv4Compat;
  }

  /**
   * When binding to an IPv6 address above, this enables `IPv4 compatibility `_. Binding to ``::``
   * will allow both IPv4 and IPv6 connections, with peer IPv4 addresses mapped into IPv6 space as
   * ``::FFFF:``.
   * @param ipv4Compat ipv4Compat or {@code null} for none
   */
  public SocketAddress setIpv4Compat(java.lang.Boolean ipv4Compat) {
    this.ipv4Compat = ipv4Compat;
    return this;
  }

  /**
   * This is only valid if :ref:`resolver_name ` is specified below and the named resolver is
   * capable of named port resolution.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamedPort() {
    return namedPort;
  }

  /**
   * This is only valid if :ref:`resolver_name ` is specified below and the named resolver is
   * capable of named port resolution.
   * @param namedPort namedPort or {@code null} for none
   */
  public SocketAddress setNamedPort(java.lang.String namedPort) {
    this.namedPort = namedPort;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getPortValue() {
    return portValue;
  }

  /**
   * @param portValue portValue or {@code null} for none
   */
  public SocketAddress setPortValue(java.lang.Long portValue) {
    this.portValue = portValue;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProtocol() {
    return protocol;
  }

  /**
   * @param protocol protocol or {@code null} for none
   */
  public SocketAddress setProtocol(java.lang.String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * The name of the custom resolver. This must have been registered with Envoy. If this is empty, a
   * context dependent default applies. If the address is a concrete IP address, no resolution will
   * occur. If address is a hostname this should be set for resolution other than DNS. Specifying a
   * custom resolver with ``STRICT_DNS`` or ``LOGICAL_DNS`` will generate an error at runtime.
   * @return value or {@code null} for none
   */
  public java.lang.String getResolverName() {
    return resolverName;
  }

  /**
   * The name of the custom resolver. This must have been registered with Envoy. If this is empty, a
   * context dependent default applies. If the address is a concrete IP address, no resolution will
   * occur. If address is a hostname this should be set for resolution other than DNS. Specifying a
   * custom resolver with ``STRICT_DNS`` or ``LOGICAL_DNS`` will generate an error at runtime.
   * @param resolverName resolverName or {@code null} for none
   */
  public SocketAddress setResolverName(java.lang.String resolverName) {
    this.resolverName = resolverName;
    return this;
  }

  @Override
  public SocketAddress set(String fieldName, Object value) {
    return (SocketAddress) super.set(fieldName, value);
  }

  @Override
  public SocketAddress clone() {
    return (SocketAddress) super.clone();
  }

}