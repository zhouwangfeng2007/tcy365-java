package com.tcy365.externalService.Helper;

import com.tcy365.common.BizParam;
import com.tcy365.entity.dto.AreaInfo;
import com.tcy365.externalService.ipas.GetAllProvinceResponseGetAllProvinceResult;
import com.tcy365.externalService.ipas.GetCityByProvinceIDResponseGetCityByProvinceIDResult;
import com.tcy365.externalService.ipas.GetDistrictByCityIDResponseGetDistrictByCityIDResult;
import com.tcy365.externalService.ipas.IPAreaServiceLocator;
import lombok.var;
import org.apache.axis.message.MessageElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class IPASHelper {
     static IPAreaServiceLocator getIPAreaServiceLocator() {
        var locator = new IPAreaServiceLocator();
        String url = BizParam.getIPASUrl();
        locator.setIPAreaServiceSoapEndpointAddress(url);
        return locator;
    }

     static NodeList getResponseNodeList(org.apache.axis.encoding.AnyContentType result) throws ParserConfigurationException, IOException, SAXException {
        MessageElement[] meArray = result.get_any();
        String xmlStr = meArray[1].toString();
        StringReader sr = new StringReader(xmlStr);
        InputSource is = new InputSource(sr);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(is);
        NodeList nList = doc.getElementsByTagName("Table");
        return nList;
    }

    /**
     * 获取区县
     *
     * @param cityID
     */
    public static List<AreaInfo> getDistrictByCityID(String cityID) throws Exception {
        var locator = getIPAreaServiceLocator();
        GetDistrictByCityIDResponseGetDistrictByCityIDResult result = locator.getIPAreaServiceSoap().getDistrictByCityID(cityID);
        NodeList nList = getResponseNodeList(result);
        List<AreaInfo> listArea = new ArrayList<>();
        if (nList.getLength() <= 0) {
            return listArea;
        }
        for (int i = 0; i < nList.getLength(); i++) {
            Element ele = (Element) nList.item(i);
            String districtId = ele.getElementsByTagName("DistrictID").item(0).getTextContent();
            String districtName = ele.getElementsByTagName("DistrictName").item(0).getTextContent();
            listArea.add(new AreaInfo(districtId, districtName));
        }
        return listArea;
    }

    /**
     * 获取地级市
     *
     * @param provinceId
     * @return
     * @throws Exception
     */
    public static List<AreaInfo> getCityByProvinceID(String provinceId) throws Exception {
        var locator = getIPAreaServiceLocator();
        GetCityByProvinceIDResponseGetCityByProvinceIDResult result = locator.getIPAreaServiceSoap().getCityByProvinceID(provinceId);
        NodeList nList = getResponseNodeList(result);
        List<AreaInfo> listArea = new ArrayList<>();
        if (nList.getLength() <= 0) {
            return listArea;
        }
        for (int i = 0; i < nList.getLength(); i++) {
            Element ele = (Element) nList.item(i);
            String cityID = ele.getElementsByTagName("CityID").item(0).getTextContent();
            String cityName = ele.getElementsByTagName("CityName").item(0).getTextContent();
            listArea.add(new AreaInfo(cityID, cityName));
        }
        return listArea;
    }

    /**
     * 获取所有的省
     *
     * @return
     * @throws Exception
     */
    public static List<AreaInfo> getAllProvince() throws Exception {
        var locator = getIPAreaServiceLocator();
        GetAllProvinceResponseGetAllProvinceResult result = locator.getIPAreaServiceSoap().getAllProvince();
        NodeList nList = getResponseNodeList(result);
        List<AreaInfo> listArea = new ArrayList<>();
        if (nList.getLength() <= 0) {
            return listArea;
        }
        for (int i = 0; i < nList.getLength(); i++) {
            Element ele = (Element) nList.item(i);
            String provinceID = ele.getElementsByTagName("ProvinceID").item(0).getTextContent();
            String provinceName = ele.getElementsByTagName("ProvinceName").item(0).getTextContent();
            listArea.add(new AreaInfo(provinceID, provinceName));
        }
        return listArea;
    }
}
