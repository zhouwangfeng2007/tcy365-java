/**
 * IPAreaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tcy365.externalService.ipas;

public interface IPAreaService extends javax.xml.rpc.Service {
    public java.lang.String getIPAreaServiceSoapAddress();

    public com.tcy365.externalService.ipas.IPAreaServiceSoap_PortType getIPAreaServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.tcy365.externalService.ipas.IPAreaServiceSoap_PortType getIPAreaServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getIPAreaServiceSoap12Address();

    public com.tcy365.externalService.ipas.IPAreaServiceSoap_PortType getIPAreaServiceSoap12() throws javax.xml.rpc.ServiceException;

    public com.tcy365.externalService.ipas.IPAreaServiceSoap_PortType getIPAreaServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
