/**
 * GetCityByProvinceIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tcy365.externalService.ipas;

public class GetCityByProvinceIDResponse  implements java.io.Serializable {
    private com.tcy365.externalService.ipas.GetCityByProvinceIDResponseGetCityByProvinceIDResult getCityByProvinceIDResult;

    public GetCityByProvinceIDResponse() {
    }

    public GetCityByProvinceIDResponse(
           com.tcy365.externalService.ipas.GetCityByProvinceIDResponseGetCityByProvinceIDResult getCityByProvinceIDResult) {
           this.getCityByProvinceIDResult = getCityByProvinceIDResult;
    }


    /**
     * Gets the getCityByProvinceIDResult value for this GetCityByProvinceIDResponse.
     * 
     * @return getCityByProvinceIDResult
     */
    public com.tcy365.externalService.ipas.GetCityByProvinceIDResponseGetCityByProvinceIDResult getGetCityByProvinceIDResult() {
        return getCityByProvinceIDResult;
    }


    /**
     * Sets the getCityByProvinceIDResult value for this GetCityByProvinceIDResponse.
     * 
     * @param getCityByProvinceIDResult
     */
    public void setGetCityByProvinceIDResult(com.tcy365.externalService.ipas.GetCityByProvinceIDResponseGetCityByProvinceIDResult getCityByProvinceIDResult) {
        this.getCityByProvinceIDResult = getCityByProvinceIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCityByProvinceIDResponse)) return false;
        GetCityByProvinceIDResponse other = (GetCityByProvinceIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCityByProvinceIDResult==null && other.getGetCityByProvinceIDResult()==null) || 
             (this.getCityByProvinceIDResult!=null &&
              this.getCityByProvinceIDResult.equals(other.getGetCityByProvinceIDResult())));
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
        if (getGetCityByProvinceIDResult() != null) {
            _hashCode += getGetCityByProvinceIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCityByProvinceIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCityByProvinceIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCityByProvinceIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCityByProvinceIDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCityByProvinceIDResponse>GetCityByProvinceIDResult"));
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
