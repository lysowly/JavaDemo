
package com.qf.webserver;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WeatherServerImplService", targetNamespace = "http://webserver.qf.com/", wsdlLocation = "http://localhost:8080/weatherService?wsdl")
public class WeatherServerImplService
    extends Service
{

    private final static URL WEATHERSERVERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEATHERSERVERIMPLSERVICE_EXCEPTION;
    private final static QName WEATHERSERVERIMPLSERVICE_QNAME = new QName("http://webserver.qf.com/", "WeatherServerImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/weatherService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEATHERSERVERIMPLSERVICE_WSDL_LOCATION = url;
        WEATHERSERVERIMPLSERVICE_EXCEPTION = e;
    }

    public WeatherServerImplService() {
        super(__getWsdlLocation(), WEATHERSERVERIMPLSERVICE_QNAME);
    }

    public WeatherServerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERSERVERIMPLSERVICE_QNAME, features);
    }

    public WeatherServerImplService(URL wsdlLocation) {
        super(wsdlLocation, WEATHERSERVERIMPLSERVICE_QNAME);
    }

    public WeatherServerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERSERVERIMPLSERVICE_QNAME, features);
    }

    public WeatherServerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherServerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WeatherServerImpl
     */
    @WebEndpoint(name = "WeatherServerImplPort")
    public WeatherServerImpl getWeatherServerImplPort() {
        return super.getPort(new QName("http://webserver.qf.com/", "WeatherServerImplPort"), WeatherServerImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherServerImpl
     */
    @WebEndpoint(name = "WeatherServerImplPort")
    public WeatherServerImpl getWeatherServerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webserver.qf.com/", "WeatherServerImplPort"), WeatherServerImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERSERVERIMPLSERVICE_EXCEPTION!= null) {
            throw WEATHERSERVERIMPLSERVICE_EXCEPTION;
        }
        return WEATHERSERVERIMPLSERVICE_WSDL_LOCATION;
    }

}
