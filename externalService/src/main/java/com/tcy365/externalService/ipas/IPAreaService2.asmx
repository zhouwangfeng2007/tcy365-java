<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="GetAllProvince">
        <s:complexType />
      </s:element>
      <s:element name="GetAllProvinceResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllProvinceResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCityByProvinceID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="provinceID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCityByProvinceIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCityByProvinceIDResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDistrictByCityID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cityID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDistrictByCityIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDistrictByCityIDResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllAreaData">
        <s:complexType />
      </s:element>
      <s:element name="GetAllAreaDataResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllAreaDataResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllDistrictArea">
        <s:complexType />
      </s:element>
      <s:element name="GetAllDistrictAreaResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllDistrictAreaResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SeekCityByIP">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ip" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SeekCityByIPResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SeekCityByIPResult" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="cityID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cityName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ispID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ispName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="provinceID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="provinceName" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SeekCityByListIP">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="listIP" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="SeekCityByListIPResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SeekCityByListIPResult" type="tns:ArrayOfIPAresInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfIPAresInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="IPAresInfo" nillable="true" type="tns:IPAresInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="IPAresInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="IP" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CityID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CityName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="IspID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="IspName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ProvinceID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ProvinceName" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="SeekCityByIps">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="listIP" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SeekCityByIpsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SeekCityByIpsResult" type="tns:ArrayOfIPAresInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SeekCityByPhone">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="phone" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SeekCityByPhoneResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SeekCityByPhoneResult" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="cityID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cityName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="provinceID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="provinceName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="cardP" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllIPList">
        <s:complexType />
      </s:element>
      <s:element name="GetAllIPListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllIPListResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetIPInfoByIP">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ip" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetIPInfoByIPResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetIPInfoByIPResult" type="tns:IPInfo" />
            <s:element minOccurs="0" maxOccurs="1" name="msg" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="IPInfo">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="StartIP" type="s:long" />
          <s:element minOccurs="1" maxOccurs="1" name="EndIP" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="ProvinceID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ProvinceName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CityID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CityName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="IspID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="IspName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="StartIPStr" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EndIPStr" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="IpRegion" type="s:long" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetAllProvinceSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllProvince" />
  </wsdl:message>
  <wsdl:message name="GetAllProvinceSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllProvinceResponse" />
  </wsdl:message>
  <wsdl:message name="GetCityByProvinceIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetCityByProvinceID" />
  </wsdl:message>
  <wsdl:message name="GetCityByProvinceIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetCityByProvinceIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetDistrictByCityIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetDistrictByCityID" />
  </wsdl:message>
  <wsdl:message name="GetDistrictByCityIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetDistrictByCityIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllAreaDataSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllAreaData" />
  </wsdl:message>
  <wsdl:message name="GetAllAreaDataSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllAreaDataResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllDistrictAreaSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllDistrictArea" />
  </wsdl:message>
  <wsdl:message name="GetAllDistrictAreaSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllDistrictAreaResponse" />
  </wsdl:message>
  <wsdl:message name="SeekCityByIPSoapIn">
    <wsdl:part name="parameters" element="tns:SeekCityByIP" />
  </wsdl:message>
  <wsdl:message name="SeekCityByIPSoapOut">
    <wsdl:part name="parameters" element="tns:SeekCityByIPResponse" />
  </wsdl:message>
  <wsdl:message name="SeekCityByListIPSoapIn">
    <wsdl:part name="parameters" element="tns:SeekCityByListIP" />
  </wsdl:message>
  <wsdl:message name="SeekCityByListIPSoapOut">
    <wsdl:part name="parameters" element="tns:SeekCityByListIPResponse" />
  </wsdl:message>
  <wsdl:message name="SeekCityByIpsSoapIn">
    <wsdl:part name="parameters" element="tns:SeekCityByIps" />
  </wsdl:message>
  <wsdl:message name="SeekCityByIpsSoapOut">
    <wsdl:part name="parameters" element="tns:SeekCityByIpsResponse" />
  </wsdl:message>
  <wsdl:message name="SeekCityByPhoneSoapIn">
    <wsdl:part name="parameters" element="tns:SeekCityByPhone" />
  </wsdl:message>
  <wsdl:message name="SeekCityByPhoneSoapOut">
    <wsdl:part name="parameters" element="tns:SeekCityByPhoneResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllIPListSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllIPList" />
  </wsdl:message>
  <wsdl:message name="GetAllIPListSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllIPListResponse" />
  </wsdl:message>
  <wsdl:message name="GetIPInfoByIPSoapIn">
    <wsdl:part name="parameters" element="tns:GetIPInfoByIP" />
  </wsdl:message>
  <wsdl:message name="GetIPInfoByIPSoapOut">
    <wsdl:part name="parameters" element="tns:GetIPInfoByIPResponse" />
  </wsdl:message>
  <wsdl:portType name="IPAreaServiceSoap">
    <wsdl:operation name="GetAllProvince">
      <wsdl:input message="tns:GetAllProvinceSoapIn" />
      <wsdl:output message="tns:GetAllProvinceSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCityByProvinceID">
      <wsdl:input message="tns:GetCityByProvinceIDSoapIn" />
      <wsdl:output message="tns:GetCityByProvinceIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDistrictByCityID">
      <wsdl:input message="tns:GetDistrictByCityIDSoapIn" />
      <wsdl:output message="tns:GetDistrictByCityIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllAreaData">
      <wsdl:input message="tns:GetAllAreaDataSoapIn" />
      <wsdl:output message="tns:GetAllAreaDataSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllDistrictArea">
      <wsdl:input message="tns:GetAllDistrictAreaSoapIn" />
      <wsdl:output message="tns:GetAllDistrictAreaSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SeekCityByIP">
      <wsdl:input message="tns:SeekCityByIPSoapIn" />
      <wsdl:output message="tns:SeekCityByIPSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SeekCityByListIP">
      <wsdl:input message="tns:SeekCityByListIPSoapIn" />
      <wsdl:output message="tns:SeekCityByListIPSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SeekCityByIps">
      <wsdl:input message="tns:SeekCityByIpsSoapIn" />
      <wsdl:output message="tns:SeekCityByIpsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SeekCityByPhone">
      <wsdl:input message="tns:SeekCityByPhoneSoapIn" />
      <wsdl:output message="tns:SeekCityByPhoneSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllIPList">
      <wsdl:input message="tns:GetAllIPListSoapIn" />
      <wsdl:output message="tns:GetAllIPListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetIPInfoByIP">
      <wsdl:input message="tns:GetIPInfoByIPSoapIn" />
      <wsdl:output message="tns:GetIPInfoByIPSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="IPAreaServiceSoap" type="tns:IPAreaServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetAllProvince">
      <soap:operation soapAction="http://tempuri.org/GetAllProvince" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCityByProvinceID">
      <soap:operation soapAction="http://tempuri.org/GetCityByProvinceID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDistrictByCityID">
      <soap:operation soapAction="http://tempuri.org/GetDistrictByCityID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllAreaData">
      <soap:operation soapAction="http://tempuri.org/GetAllAreaData" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllDistrictArea">
      <soap:operation soapAction="http://tempuri.org/GetAllDistrictArea" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SeekCityByIP">
      <soap:operation soapAction="http://tempuri.org/SeekCityByIP" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SeekCityByListIP">
      <soap:operation soapAction="http://tempuri.org/SeekCityByListIP" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SeekCityByIps">
      <soap:operation soapAction="http://tempuri.org/SeekCityByIps" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SeekCityByPhone">
      <soap:operation soapAction="http://tempuri.org/SeekCityByPhone" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllIPList">
      <soap:operation soapAction="http://tempuri.org/GetAllIPList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetIPInfoByIP">
      <soap:operation soapAction="http://tempuri.org/GetIPInfoByIP" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="IPAreaServiceSoap12" type="tns:IPAreaServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetAllProvince">
      <soap12:operation soapAction="http://tempuri.org/GetAllProvince" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCityByProvinceID">
      <soap12:operation soapAction="http://tempuri.org/GetCityByProvinceID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDistrictByCityID">
      <soap12:operation soapAction="http://tempuri.org/GetDistrictByCityID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllAreaData">
      <soap12:operation soapAction="http://tempuri.org/GetAllAreaData" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllDistrictArea">
      <soap12:operation soapAction="http://tempuri.org/GetAllDistrictArea" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SeekCityByIP">
      <soap12:operation soapAction="http://tempuri.org/SeekCityByIP" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SeekCityByListIP">
      <soap12:operation soapAction="http://tempuri.org/SeekCityByListIP" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SeekCityByIps">
      <soap12:operation soapAction="http://tempuri.org/SeekCityByIps" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SeekCityByPhone">
      <soap12:operation soapAction="http://tempuri.org/SeekCityByPhone" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllIPList">
      <soap12:operation soapAction="http://tempuri.org/GetAllIPList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetIPInfoByIP">
      <soap12:operation soapAction="http://tempuri.org/GetIPInfoByIP" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="IPAreaService">
    <wsdl:port name="IPAreaServiceSoap" binding="tns:IPAreaServiceSoap">
      <soap:address location="http://ipas.uc108.org:1507/IPAreaService.asmx" />
    </wsdl:port>
    <wsdl:port name="IPAreaServiceSoap12" binding="tns:IPAreaServiceSoap12">
      <soap12:address location="http://ipas.uc108.org:1507/IPAreaService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>