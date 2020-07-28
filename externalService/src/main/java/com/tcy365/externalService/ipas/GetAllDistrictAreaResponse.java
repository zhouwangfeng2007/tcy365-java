/**
 * GetAllDistrictAreaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tcy365.externalService.ipas;

public class GetAllDistrictAreaResponse  implements java.io.Serializable {
    private com.tcy365.externalService.ipas.GetAllDistrictAreaResponseGetAllDistrictAreaResult getAllDistrictAreaResult;

    public GetAllDistrictAreaResponse() {
    }

    public GetAllDistrictAreaResponse(
           com.tcy365.externalService.ipas.GetAllDistrictAreaResponseGetAllDistrictAreaResult getAllDistrictAreaResult) {
           this.getAllDistrictAreaResult = getAllDistrictAreaResult;
    }


    /**
     * Gets the getAllDistrictAreaResult value for this GetAllDistrictAreaResponse.
     * 
     * @return getAllDistrictAreaResult
     */
    public com.tcy365.externalService.ipas.GetAllDistrictAreaResponseGetAllDistrictAreaResult getGetAllDistrictAreaResult() {
        return getAllDistrictAreaResult;
    }


    /**
     * Sets the getAllDistrictAreaResult value for this GetAllDistrictAreaResponse.
     * 
     * @param getAllDistrictAreaResult
     */
    public void setGetAllDistrictAreaResult(com.tcy365.externalService.ipas.GetAllDistrictAreaResponseGetAllDistrictAreaResult getAllDistrictAreaResult) {
        this.getAllDistrictAreaResult = getAllDistrictAreaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllDistrictAreaResponse)) return false;
        GetAllDistrictAreaResponse other = (GetAllDistrictAreaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllDistrictAreaResult==null && other.getGetAllDistrictAreaResult()==null) || 
             (this.getAllDistrictAreaResult!=null &&
              this.getAllDistrictAreaResult.equals(other.getGetAllDistrictAreaResult())));
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
        if (getGetAllDistrictAreaResult() != null) {
            _hashCode += getGetAllDistrictAreaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllDistrictAreaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllDistrictAreaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllDistrictAreaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllDistrictAreaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllDistrictAreaResponse>GetAllDistrictAreaResult"));
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
