/**
 * IPAreaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tcy365.externalService.ipas;

public class IPAreaServiceLocator extends org.apache.axis.client.Service implements com.tcy365.externalService.ipas.IPAreaService {

    public IPAreaServiceLocator() {
    }


    public IPAreaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IPAreaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IPAreaServiceSoap
    private java.lang.String IPAreaServiceSoap_address = "http://ipas.uc108.org:1507/IPAreaService.asmx";

    public java.lang.String getIPAreaServiceSoapAddress() {
        return IPAreaServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IPAreaServiceSoapWSDDServiceName = "IPAreaServiceSoap";

    public java.lang.String getIPAreaServiceSoapWSDDServiceName() {
        return IPAreaServiceSoapWSDDServiceName;
    }

    public void setIPAreaServiceSoapWSDDServiceName(java.lang.String name) {
        IPAreaServiceSoapWSDDServiceName = name;
    }

    public com.tcy365.externalService.ipas.IPAreaServiceSoap_PortType getIPAreaServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IPAreaServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIPAreaServiceSoap(endpoint);
    }

    public com.tcy365.externalService.ipas.IPAreaServiceSoap_PortType getIPAreaServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tcy365.externalService.ipas.IPAreaServiceSoap_BindingStub _stub = new com.tcy365.externalService.ipas.IPAreaServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getIPAreaServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIPAreaServiceSoapEndpointAddress(java.lang.String address) {
        IPAreaServiceSoap_address = address;
    }


    // Use to get a proxy class for IPAreaServiceSoap12
    private java.lang.String IPAreaServiceSoap12_address = "http://ipas.uc108.org:1507/IPAreaService.asmx";

    public java.lang.String getIPAreaServiceSoap12Address() {
        return IPAreaServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IPAreaServiceSoap12WSDDServiceName = "IPAreaServiceSoap12";

    public java.lang.String getIPAreaServiceSoap12WSDDServiceName() {
        return IPAreaServiceSoap12WSDDServiceName;
    }

    public void setIPAreaServiceSoap12WSDDServiceName(java.lang.String name) {
        IPAreaServiceSoap12WSDDServiceName = name;
    }

    public com.tcy365.externalService.ipas.IPAreaServiceSoap_PortType getIPAreaServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IPAreaServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIPAreaServiceSoap12(endpoint);
    }

    public com.tcy365.externalService.ipas.IPAreaServiceSoap_PortType getIPAreaServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tcy365.externalService.ipas.IPAreaServiceSoap12Stub _stub = new com.tcy365.externalService.ipas.IPAreaServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getIPAreaServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIPAreaServiceSoap12EndpointAddress(java.lang.String address) {
        IPAreaServiceSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.tcy365.externalService.ipas.IPAreaServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.tcy365.externalService.ipas.IPAreaServiceSoap_BindingStub _stub = new com.tcy365.externalService.ipas.IPAreaServiceSoap_BindingStub(new java.net.URL(IPAreaServiceSoap_address), this);
                _stub.setPortName(getIPAreaServiceSoapWSDDServiceName());
                return _stub;
            }
            if (com.tcy365.externalService.ipas.IPAreaServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.tcy365.externalService.ipas.IPAreaServiceSoap12Stub _stub = new com.tcy365.externalService.ipas.IPAreaServiceSoap12Stub(new java.net.URL(IPAreaServiceSoap12_address), this);
                _stub.setPortName(getIPAreaServiceSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IPAreaServiceSoap".equals(inputPortName)) {
            return getIPAreaServiceSoap();
        }
        else if ("IPAreaServiceSoap12".equals(inputPortName)) {
            return getIPAreaServiceSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "IPAreaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "IPAreaServiceSoap"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "IPAreaServiceSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IPAreaServiceSoap".equals(portName)) {
            setIPAreaServiceSoapEndpointAddress(address);
        }
        else 
if ("IPAreaServiceSoap12".equals(portName)) {
            setIPAreaServiceSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
