/**
 * GetIPInfoByIPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tcy365.externalService.ipas;

public class GetIPInfoByIPResponse  implements java.io.Serializable {
    private com.tcy365.externalService.ipas.IPInfo getIPInfoByIPResult;

    private java.lang.String msg;

    public GetIPInfoByIPResponse() {
    }

    public GetIPInfoByIPResponse(
           com.tcy365.externalService.ipas.IPInfo getIPInfoByIPResult,
           java.lang.String msg) {
           this.getIPInfoByIPResult = getIPInfoByIPResult;
           this.msg = msg;
    }


    /**
     * Gets the getIPInfoByIPResult value for this GetIPInfoByIPResponse.
     * 
     * @return getIPInfoByIPResult
     */
    public com.tcy365.externalService.ipas.IPInfo getGetIPInfoByIPResult() {
        return getIPInfoByIPResult;
    }


    /**
     * Sets the getIPInfoByIPResult value for this GetIPInfoByIPResponse.
     * 
     * @param getIPInfoByIPResult
     */
    public void setGetIPInfoByIPResult(com.tcy365.externalService.ipas.IPInfo getIPInfoByIPResult) {
        this.getIPInfoByIPResult = getIPInfoByIPResult;
    }


    /**
     * Gets the msg value for this GetIPInfoByIPResponse.
     * 
     * @return msg
     */
    public java.lang.String getMsg() {
        return msg;
    }


    /**
     * Sets the msg value for this GetIPInfoByIPResponse.
     * 
     * @param msg
     */
    public void setMsg(java.lang.String msg) {
        this.msg = msg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetIPInfoByIPResponse)) return false;
        GetIPInfoByIPResponse other = (GetIPInfoByIPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getIPInfoByIPResult==null && other.getGetIPInfoByIPResult()==null) || 
             (this.getIPInfoByIPResult!=null &&
              this.getIPInfoByIPResult.equals(other.getGetIPInfoByIPResult()))) &&
            ((this.msg==null && other.getMsg()==null) || 
             (this.msg!=null &&
              this.msg.equals(other.getMsg())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetIPInfoByIPResult() != null) {
            _hashCode += getGetIPInfoByIPResult().hashCode();
        }
        if (getMsg() != null) {
            _hashCode += getMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetIPInfoByIPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetIPInfoByIPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getIPInfoByIPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetIPInfoByIPResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "IPInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
