/**
 * IPInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tcy365.externalService.ipas;

public class IPInfo  implements java.io.Serializable {
    private long startIP;

    private long endIP;

    private java.lang.String provinceID;

    private java.lang.String provinceName;

    private java.lang.String cityID;

    private java.lang.String cityName;

    private java.lang.String ispID;

    private java.lang.String ispName;

    private java.lang.String startIPStr;

    private java.lang.String endIPStr;

    private long ipRegion;

    public IPInfo() {
    }

    public IPInfo(
           long startIP,
           long endIP,
           java.lang.String provinceID,
           java.lang.String provinceName,
           java.lang.String cityID,
           java.lang.String cityName,
           java.lang.String ispID,
           java.lang.String ispName,
           java.lang.String startIPStr,
           java.lang.String endIPStr,
           long ipRegion) {
           this.startIP = startIP;
           this.endIP = endIP;
           this.provinceID = provinceID;
           this.provinceName = provinceName;
           this.cityID = cityID;
           this.cityName = cityName;
           this.ispID = ispID;
           this.ispName = ispName;
           this.startIPStr = startIPStr;
           this.endIPStr = endIPStr;
           this.ipRegion = ipRegion;
    }


    /**
     * Gets the startIP value for this IPInfo.
     * 
     * @return startIP
     */
    public long getStartIP() {
        return startIP;
    }


    /**
     * Sets the startIP value for this IPInfo.
     * 
     * @param startIP
     */
    public void setStartIP(long startIP) {
        this.startIP = startIP;
    }


    /**
     * Gets the endIP value for this IPInfo.
     * 
     * @return endIP
     */
    public long getEndIP() {
        return endIP;
    }


    /**
     * Sets the endIP value for this IPInfo.
     * 
     * @param endIP
     */
    public void setEndIP(long endIP) {
        this.endIP = endIP;
    }


    /**
     * Gets the provinceID value for this IPInfo.
     * 
     * @return provinceID
     */
    public java.lang.String getProvinceID() {
        return provinceID;
    }


    /**
     * Sets the provinceID value for this IPInfo.
     * 
     * @param provinceID
     */
    public void setProvinceID(java.lang.String provinceID) {
        this.provinceID = provinceID;
    }


    /**
     * Gets the provinceName value for this IPInfo.
     * 
     * @return provinceName
     */
    public java.lang.String getProvinceName() {
        return provinceName;
    }


    /**
     * Sets the provinceName value for this IPInfo.
     * 
     * @param provinceName
     */
    public void setProvinceName(java.lang.String provinceName) {
        this.provinceName = provinceName;
    }


    /**
     * Gets the cityID value for this IPInfo.
     * 
     * @return cityID
     */
    public java.lang.String getCityID() {
        return cityID;
    }


    /**
     * Sets the cityID value for this IPInfo.
     * 
     * @param cityID
     */
    public void setCityID(java.lang.String cityID) {
        this.cityID = cityID;
    }


    /**
     * Gets the cityName value for this IPInfo.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this IPInfo.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the ispID value for this IPInfo.
     * 
     * @return ispID
     */
    public java.lang.String getIspID() {
        return ispID;
    }


    /**
     * Sets the ispID value for this IPInfo.
     * 
     * @param ispID
     */
    public void setIspID(java.lang.String ispID) {
        this.ispID = ispID;
    }


    /**
     * Gets the ispName value for this IPInfo.
     * 
     * @return ispName
     */
    public java.lang.String getIspName() {
        return ispName;
    }


    /**
     * Sets the ispName value for this IPInfo.
     * 
     * @param ispName
     */
    public void setIspName(java.lang.String ispName) {
        this.ispName = ispName;
    }


    /**
     * Gets the startIPStr value for this IPInfo.
     * 
     * @return startIPStr
     */
    public java.lang.String getStartIPStr() {
        return startIPStr;
    }


    /**
     * Sets the startIPStr value for this IPInfo.
     * 
     * @param startIPStr
     */
    public void setStartIPStr(java.lang.String startIPStr) {
        this.startIPStr = startIPStr;
    }


    /**
     * Gets the endIPStr value for this IPInfo.
     * 
     * @return endIPStr
     */
    public java.lang.String getEndIPStr() {
        return endIPStr;
    }


    /**
     * Sets the endIPStr value for this IPInfo.
     * 
     * @param endIPStr
     */
    public void setEndIPStr(java.lang.String endIPStr) {
        this.endIPStr = endIPStr;
    }


    /**
     * Gets the ipRegion value for this IPInfo.
     * 
     * @return ipRegion
     */
    public long getIpRegion() {
        return ipRegion;
    }


    /**
     * Sets the ipRegion value for this IPInfo.
     * 
     * @param ipRegion
     */
    public void setIpRegion(long ipRegion) {
        this.ipRegion = ipRegion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IPInfo)) return false;
        IPInfo other = (IPInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.startIP == other.getStartIP() &&
            this.endIP == other.getEndIP() &&
            ((this.provinceID==null && other.getProvinceID()==null) || 
             (this.provinceID!=null &&
              this.provinceID.equals(other.getProvinceID()))) &&
            ((this.provinceName==null && other.getProvinceName()==null) || 
             (this.provinceName!=null &&
              this.provinceName.equals(other.getProvinceName()))) &&
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
            ((this.startIPStr==null && other.getStartIPStr()==null) || 
             (this.startIPStr!=null &&
              this.startIPStr.equals(other.getStartIPStr()))) &&
            ((this.endIPStr==null && other.getEndIPStr()==null) || 
             (this.endIPStr!=null &&
              this.endIPStr.equals(other.getEndIPStr()))) &&
            this.ipRegion == other.getIpRegion();
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
        _hashCode += new Long(getStartIP()).hashCode();
        _hashCode += new Long(getEndIP()).hashCode();
        if (getProvinceID() != null) {
            _hashCode += getProvinceID().hashCode();
        }
        if (getProvinceName() != null) {
            _hashCode += getProvinceName().hashCode();
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
        if (getStartIPStr() != null) {
            _hashCode += getStartIPStr().hashCode();
        }
        if (getEndIPStr() != null) {
            _hashCode += getEndIPStr().hashCode();
        }
        _hashCode += new Long(getIpRegion()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IPInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "IPInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StartIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EndIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("startIPStr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StartIPStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endIPStr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EndIPStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IpRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
