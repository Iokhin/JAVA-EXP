package ru.iokhin.tm.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-06-18T17:16:52.011+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://endpoint.tm.iokhin.ru/", name = "ServerInfoEndpointBean")
@XmlSeeAlso({ObjectFactory.class})
public interface ServerInfoEndpointBean {

    @WebMethod
    @Action(input = "http://endpoint.tm.iokhin.ru/ServerInfoEndpointBean/getServerInformationRequest", output = "http://endpoint.tm.iokhin.ru/ServerInfoEndpointBean/getServerInformationResponse")
    @RequestWrapper(localName = "getServerInformation", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.GetServerInformation")
    @ResponseWrapper(localName = "getServerInformationResponse", targetNamespace = "http://endpoint.tm.iokhin.ru/", className = "ru.iokhin.tm.endpoint.GetServerInformationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.iokhin.tm.endpoint.ServerInfo getServerInformation();
}
