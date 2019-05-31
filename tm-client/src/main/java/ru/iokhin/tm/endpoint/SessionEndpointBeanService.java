package ru.iokhin.tm.endpoint;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-05-31T11:32:36.143+03:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "SessionEndpointBeanService",
                  wsdlLocation = "http://localhost:8080/SessionEndpointBean?wsdl",
                  targetNamespace = "http://endpoint.tm.iokhin.ru/")
public class SessionEndpointBeanService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://endpoint.tm.iokhin.ru/", "SessionEndpointBeanService");
    public final static QName SessionEndpointBeanPort = new QName("http://endpoint.tm.iokhin.ru/", "SessionEndpointBeanPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/SessionEndpointBean?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SessionEndpointBeanService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/SessionEndpointBean?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SessionEndpointBeanService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SessionEndpointBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SessionEndpointBeanService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SessionEndpointBeanService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SessionEndpointBeanService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SessionEndpointBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SessionEndpointBean
     */
    @WebEndpoint(name = "SessionEndpointBeanPort")
    public SessionEndpointBean getSessionEndpointBeanPort() {
        return super.getPort(SessionEndpointBeanPort, SessionEndpointBean.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SessionEndpointBean
     */
    @WebEndpoint(name = "SessionEndpointBeanPort")
    public SessionEndpointBean getSessionEndpointBeanPort(WebServiceFeature... features) {
        return super.getPort(SessionEndpointBeanPort, SessionEndpointBean.class, features);
    }

}
