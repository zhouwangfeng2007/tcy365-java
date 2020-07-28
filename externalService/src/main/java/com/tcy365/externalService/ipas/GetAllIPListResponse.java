/**
 * GetAllIPListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tcy365.externalService.ipas;

public class GetAllIPListResponse  implements java.io.Serializable {
    private com.tcy365.externalService.ipas.GetAllIPListResponseGetAllIPListResult getAllIPListResult;

    public GetAllIPListResponse() {
    }

    public GetAllIPListResponse(
           com.tcy365.externalService.ipas.GetAllIPListResponseGetAllIPListResult getAllIPListResult) {
           this.getAllIPListResult = getAllIPListResult;
    }


    /**
     * Gets the getAllIPListResult value for this GetAllIPListResponse.
     * 
     * @return getAllIPListResult
     */
    public com.tcy365.externalService.ipas.GetAllIPListResponseGetAllIPListResult getGetAllIPListResult() {
        return getAllIPListResult;
    }


    /**
     * Sets the getAllIPListResult value for this GetAllIPListResponse.
     * 
     * @param getAllIPListResult
     */
    public void setGetAllIPListResult(com.tcy365.externalService.ipas.GetAllIPListResponseGetAllIPListResult getAllIPListResult) {
        this.getAllIPListResult = getAllIPListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllIPListResponse)) return false;
        GetAllIPListResponse other = (GetAllIPListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllIPListResult==null && other.getGetAllIPListResult()==null) || 
             (this.getAllIPListResult!=null &&
              this.getAllIPListResult.equals(other.getGetAllIPListResult())));
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
        if (getGetAllIPListResult() != null) {
            _hashCode += getGetAllIPListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllIPListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllIPListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllIPListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllIPListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllIPListResponse>GetAllIPListResult"));
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
