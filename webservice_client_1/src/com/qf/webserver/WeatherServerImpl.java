
package com.qf.webserver;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherServerImpl", targetNamespace = "http://webserver.qf.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherServerImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "query", targetNamespace = "http://webserver.qf.com/", className = "com.qf.webserver.Query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "http://webserver.qf.com/", className = "com.qf.webserver.QueryResponse")
    @Action(input = "http://webserver.qf.com/WeatherServerImpl/queryRequest", output = "http://webserver.qf.com/WeatherServerImpl/queryResponse")
    public String query(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "other", targetNamespace = "http://webserver.qf.com/", className = "com.qf.webserver.Other")
    @ResponseWrapper(localName = "otherResponse", targetNamespace = "http://webserver.qf.com/", className = "com.qf.webserver.OtherResponse")
    @Action(input = "http://webserver.qf.com/WeatherServerImpl/otherRequest", output = "http://webserver.qf.com/WeatherServerImpl/otherResponse")
    public String other();

}
