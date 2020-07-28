/**
 * IPAresInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tcy365.externalService.ipas;

public class IPAresInfo  implements java.io.Serializable {
    private java.lang.String IP;

    private java.lang.String cityID;

    private java.lang.String cityName;

    private java.lang.String ispID;

    private java.lang.String ispName;

    private java.lang.String provinceID;

    private java.lang.String provinceName;

    public IPAresInfo() {
    }

    public IPAresInfo(
           java.lang.String IP,
           java.lang.String cityID,
           java.lang.String cityName,
           java.lang.String ispID,
           java.lang.String ispName,
           java.lang.String provinceID,
           java.lang.String provinceName) {
           this.IP = IP;
           this.cityID = cityID;
           this.cityName = cityName;
           this.ispID = ispID;
           this.ispName = ispName;
           this.provinceID = provinceID;
           this.provinceName = provinceName;
    }


    /**
     * Gets the IP value for this IPAresInfo.
     * 
     * @return IP
     */
    public java.lang.String getIP() {
        return IP;
    }


    /**
     * Sets the IP value for this IPAresInfo.
     * 
     * @param IP
     */
    public void setIP(java.lang.String IP) {
        this.IP = IP;
    }


    /**
     * Gets the cityID value for this IPAresInfo.
     * 
     * @return cityID
     */
    public java.lang.String getCityID() {
        return cityID;
    }


    /**
     * Sets the cityID value for this IPAresInfo.
     * 
     * @param cityID
     */
    public void setCityID(java.lang.String cityID) {
        this.cityID = cityID;
    }


    /**
     * Gets the cityName value for this IPAresInfo.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this IPAresInfo.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the ispID value for this IPAresInfo.
     * 
     * @return ispID
     */
    public java.lang.String getIspID() {
        return ispID;
    }


    /**
     * Sets the ispID value for this IPAresInfo.
     * 
     * @param ispID
     */
    public void setIspID(java.lang.String ispID) {
        this.ispID = ispID;
    }


    /**
     * Gets the ispName value for this IPAresInfo.
     * 
     * @return ispName
     */
    public java.lang.String getIspName() {
        return ispName;
    }


    /**
     * Sets the ispName value for this IPAresInfo.
     * 
     * @param ispName
     */
    public void setIspName(java.lang.String ispName) {
        this.ispName = ispName;
    }


    /**
     * Gets the provinceID value for this IPAresInfo.
     * 
     * @return provinceID
     */
    public java.lang.String getProvinceID() {
        return provinceID;
    }


    /**
     * Sets the provinceID value for this IPAresInfo.
     * 
     * @param provinceID
     */
    public void setProvinceID(java.lang.String provinceID) {
        this.provinceID = provinceID;
    }


    /**
     * Gets the provinceName value for this IPAresInfo.
     * 
     * @return provinceName
     */
    public java.lang.String getProvinceName() {
        return provinceName;
    }


    /**
     * Sets the provinceName value for this IPAresInfo.
     * 
     * @param provinceName
     */
    public void setProvinceName(java.lang.String provinceName) {
        this.provinceName = provinceName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IPAresInfo)) return false;
        IPAresInfo other = (IPAresInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IP==null && other.getIP()==null) || 
             (this.IP!=null &&
              this.IP.equals(other.getIP()))) &&
            ((this.cityID==null && other.getCityID()==null) || 
             (this.cityID!=null &&
              this.cityID.equals(other.getCityID()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.ispID==null && other.getIspID()==null) || 
             (this.ispID!=null &&
              this.ispID.equals(other.getIspID()))) &&
            ((this.ispName==null && other.getIspName()==null) || 
             (this.ispName!=null &&
              this.ispName.equals(other.getIspName()))) &&
            ((this.provinceID==null && other.getProvinceID()==null) || 
             (this.provinceID!=null &&
              this.provinceID.equals(other.getProvinceID()))) &&
            ((this.provinceName==null && other.getProvinceName()==null) || 
             (this.provinceName!=null &&
              this.provinceName.equals(other.getProvinceName())));
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
        if (getIP() != null) {
            _hashCode += getIP().hashCode();
        }
        if (getCityID() != null) {
            _hashCode += getCityID().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getIspID() != null) {
            _hashCode += getIspID().hashCode();
        }
        if (getIspName() != null) {
            _hashCode += getIspName().hashCode();
        }
        if (getProvinceID() != null) {
            _hashCode += getProvinceID().hashCode();
        }
        if (getProvinceName() != null) {
            _hashCode += getProvinceName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IPAresInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "IPAresInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ispID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IspID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ispName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IspName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProvinceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProvinceName"));
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
