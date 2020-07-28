/**
 * SeekCityByPhoneResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tcy365.externalService.ipas;

public class SeekCityByPhoneResponse  implements java.io.Serializable {
    private boolean seekCityByPhoneResult;

    private java.lang.String cityID;

    private java.lang.String cityName;

    private java.lang.String provinceID;

    private java.lang.String provinceName;

    private java.lang.String cardP;

    public SeekCityByPhoneResponse() {
    }

    public SeekCityByPhoneResponse(
           boolean seekCityByPhoneResult,
           java.lang.String cityID,
           java.lang.String cityName,
           java.lang.String provinceID,
           java.lang.String provinceName,
           java.lang.String cardP) {
           this.seekCityByPhoneResult = seekCityByPhoneResult;
           this.cityID = cityID;
           this.cityName = cityName;
           this.provinceID = provinceID;
           this.provinceName = provinceName;
           this.cardP = cardP;
    }


    /**
     * Gets the seekCityByPhoneResult value for this SeekCityByPhoneResponse.
     * 
     * @return seekCityByPhoneResult
     */
    public boolean isSeekCityByPhoneResult() {
        return seekCityByPhoneResult;
    }


    /**
     * Sets the seekCityByPhoneResult value for this SeekCityByPhoneResponse.
     * 
     * @param seekCityByPhoneResult
     */
    public void setSeekCityByPhoneResult(boolean seekCityByPhoneResult) {
        this.seekCityByPhoneResult = seekCityByPhoneResult;
    }


    /**
     * Gets the cityID value for this SeekCityByPhoneResponse.
     * 
     * @return cityID
     */
    public java.lang.String getCityID() {
        return cityID;
    }


    /**
     * Sets the cityID value for this SeekCityByPhoneResponse.
     * 
     * @param cityID
     */
    public void setCityID(java.lang.String cityID) {
        this.cityID = cityID;
    }


    /**
     * Gets the cityName value for this SeekCityByPhoneResponse.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this SeekCityByPhoneResponse.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the provinceID value for this SeekCityByPhoneResponse.
     * 
     * @return provinceID
     */
    public java.lang.String getProvinceID() {
        return provinceID;
    }


    /**
     * Sets the provinceID value for this SeekCityByPhoneResponse.
     * 
     * @param provinceID
     */
    public void setProvinceID(java.lang.String provinceID) {
        this.provinceID = provinceID;
    }


    /**
     * Gets the provinceName value for this SeekCityByPhoneResponse.
     * 
     * @return provinceName
     */
    public java.lang.String getProvinceName() {
        return provinceName;
    }


    /**
     * Sets the provinceName value for this SeekCityByPhoneResponse.
     * 
     * @param provinceName
     */
    public void setProvinceName(java.lang.String provinceName) {
        this.provinceName = provinceName;
    }


    /**
     * Gets the cardP value for this SeekCityByPhoneResponse.
     * 
     * @return cardP
     */
    public java.lang.String getCardP() {
        return cardP;
    }


    /**
     * Sets the cardP value for this SeekCityByPhoneResponse.
     * 
     * @param cardP
     */
    public void setCardP(java.lang.String cardP) {
        this.cardP = cardP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeekCityByPhoneResponse)) return false;
        SeekCityByPhoneResponse other = (SeekCityByPhoneResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.seekCityByPhoneResult == other.isSeekCityByPhoneResult() &&
            ((this.cityID==null && other.getCityID()==null) || 
             (this.cityID!=null &&
              this.cityID.equals(other.getCityID()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.provinceID==null && other.getProvinceID()==null) || 
             (this.provinceID!=null &&
              this.provinceID.equals(other.getProvinceID()))) &&
            ((this.provinceName==null && other.getProvinceName()==null) || 
             (this.provinceName!=null &&
              this.provinceName.equals(other.getProvinceName()))) &&
            ((this.cardP==null && other.getCardP()==null) || 
             (this.cardP!=null &&
              this.cardP.equals(other.getCardP())));
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
        _hashCode += (isSeekCityByPhoneResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCityID() != null) {
            _hashCode += getCityID().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getProvinceID() != null) {
            _hashCode += getProvinceID().hashCode();
        }
        if (getProvinceName() != null) {
            _hashCode += getProvinceName().hashCode();
        }
        if (getCardP() != null) {
            _hashCode += getCardP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeekCityByPhoneResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SeekCityByPhoneResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seekCityByPhoneResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SeekCityByPhoneResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "cityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "cityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "provinceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "provinceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "cardP"));
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
