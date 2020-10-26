/**
 * DBInteractionTotalServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dao;

public class DBInteractionTotalServiceLocator extends org.apache.axis.client.Service implements com.dao.DBInteractionTotalService {

    public DBInteractionTotalServiceLocator() {
    }


    public DBInteractionTotalServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DBInteractionTotalServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DBInteractionTotalPort
    private java.lang.String DBInteractionTotalPort_address = "http://localhost:1952/DBinteractionTotale";

    public java.lang.String getDBInteractionTotalPortAddress() {
        return DBInteractionTotalPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DBInteractionTotalPortWSDDServiceName = "DBInteractionTotalPort";

    public java.lang.String getDBInteractionTotalPortWSDDServiceName() {
        return DBInteractionTotalPortWSDDServiceName;
    }

    public void setDBInteractionTotalPortWSDDServiceName(java.lang.String name) {
        DBInteractionTotalPortWSDDServiceName = name;
    }

    public com.dao.DBInteractionTotal getDBInteractionTotalPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DBInteractionTotalPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDBInteractionTotalPort(endpoint);
    }

    public com.dao.DBInteractionTotal getDBInteractionTotalPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.dao.DBInteractionTotalPortBindingStub _stub = new com.dao.DBInteractionTotalPortBindingStub(portAddress, this);
            _stub.setPortName(getDBInteractionTotalPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDBInteractionTotalPortEndpointAddress(java.lang.String address) {
        DBInteractionTotalPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.dao.DBInteractionTotal.class.isAssignableFrom(serviceEndpointInterface)) {
                com.dao.DBInteractionTotalPortBindingStub _stub = new com.dao.DBInteractionTotalPortBindingStub(new java.net.URL(DBInteractionTotalPort_address), this);
                _stub.setPortName(getDBInteractionTotalPortWSDDServiceName());
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
        if ("DBInteractionTotalPort".equals(inputPortName)) {
            return getDBInteractionTotalPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dao.com/", "DBInteractionTotalService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dao.com/", "DBInteractionTotalPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DBInteractionTotalPort".equals(portName)) {
            setDBInteractionTotalPortEndpointAddress(address);
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
