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
 * 2019-05-30T19:01:10.235+03:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "TaskEndpointBeanService",
                  wsdlLocation = "http://localhost:8080/TaskEndpointBean?wsdl",
                  targetNamespace = "http://endpoint.tm.iokhin.ru/")
public class TaskEndpointBeanService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://endpoint.tm.iokhin.ru/", "TaskEndpointBeanService");
    public final static QName TaskEndpointBeanPort = new QName("http://endpoint.tm.iokhin.ru/", "TaskEndpointBeanPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/TaskEndpointBean?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TaskEndpointBeanService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/TaskEndpointBean?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TaskEndpointBeanService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TaskEndpointBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TaskEndpointBeanService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TaskEndpointBeanService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TaskEndpointBeanService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TaskEndpointBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TaskEndpointBean
     */
    @WebEndpoint(name = "TaskEndpointBeanPort")
    public TaskEndpointBean getTaskEndpointBeanPort() {
        return super.getPort(TaskEndpointBeanPort, TaskEndpointBean.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TaskEndpointBean
     */
    @WebEndpoint(name = "TaskEndpointBeanPort")
    public TaskEndpointBean getTaskEndpointBeanPort(WebServiceFeature... features) {
        return super.getPort(TaskEndpointBeanPort, TaskEndpointBean.class, features);
    }

}
