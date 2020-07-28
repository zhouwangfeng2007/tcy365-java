/**
 * GetDistrictByCityIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tcy365.externalService.ipas;

public class GetDistrictByCityIDResponse  implements java.io.Serializable {
    private com.tcy365.externalService.ipas.GetDistrictByCityIDResponseGetDistrictByCityIDResult getDistrictByCityIDResult;

    public GetDistrictByCityIDResponse() {
    }

    public GetDistrictByCityIDResponse(
           com.tcy365.externalService.ipas.GetDistrictByCityIDResponseGetDistrictByCityIDResult getDistrictByCityIDResult) {
           this.getDistrictByCityIDResult = getDistrictByCityIDResult;
    }


    /**
     * Gets the getDistrictByCityIDResult value for this GetDistrictByCityIDResponse.
     * 
     * @return getDistrictByCityIDResult
     */
    public com.tcy365.externalService.ipas.GetDistrictByCityIDResponseGetDistrictByCityIDResult getGetDistrictByCityIDResult() {
        return getDistrictByCityIDResult;
    }


    /**
     * Sets the getDistrictByCityIDResult value for this GetDistrictByCityIDResponse.
     * 
     * @param getDistrictByCityIDResult
     */
    public void setGetDistrictByCityIDResult(com.tcy365.externalService.ipas.GetDistrictByCityIDResponseGetDistrictByCityIDResult getDistrictByCityIDResult) {
        this.getDistrictByCityIDResult = getDistrictByCityIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDistrictByCityIDResponse)) return false;
        GetDistrictByCityIDResponse other = (GetDistrictByCityIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDistrictByCityIDResult==null && other.getGetDistrictByCityIDResult()==null) || 
             (this.getDistrictByCityIDResult!=null &&
              this.getDistrictByCityIDResult.equals(other.getGetDistrictByCityIDResult())));
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
        if (getGetDistrictByCityIDResult() != null) {
            _hashCode += getGetDistrictByCityIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDistrictByCityIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDistrictByCityIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDistrictByCityIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDistrictByCityIDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDistrictByCityIDResponse>GetDistrictByCityIDResult"));
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
