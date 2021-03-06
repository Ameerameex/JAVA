
package com.training.service;

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
@WebServiceClient(name = "CalcImplService", targetNamespace = "http://service.training.com", wsdlLocation = "file:/C:/WebService%20Temp/CalcImpl.wsdl")
public class CalcImplService
    extends Service
{

    private final static URL CALCIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCIMPLSERVICE_EXCEPTION;
    private final static QName CALCIMPLSERVICE_QNAME = new QName("http://service.training.com", "CalcImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/WebService%20Temp/CalcImpl.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCIMPLSERVICE_WSDL_LOCATION = url;
        CALCIMPLSERVICE_EXCEPTION = e;
    }

    public CalcImplService() {
        super(__getWsdlLocation(), CALCIMPLSERVICE_QNAME);
    }

    public CalcImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCIMPLSERVICE_QNAME, features);
    }

    public CalcImplService(URL wsdlLocation) {
        super(wsdlLocation, CALCIMPLSERVICE_QNAME);
    }

    public CalcImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCIMPLSERVICE_QNAME, features);
    }

    public CalcImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalcImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalcImpl
     */
    @WebEndpoint(name = "CalcImpl")
    public CalcImpl getCalcImpl() {
        return super.getPort(new QName("http://service.training.com", "CalcImpl"), CalcImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalcImpl
     */
    @WebEndpoint(name = "CalcImpl")
    public CalcImpl getCalcImpl(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.training.com", "CalcImpl"), CalcImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCIMPLSERVICE_EXCEPTION!= null) {
            throw CALCIMPLSERVICE_EXCEPTION;
        }
        return CALCIMPLSERVICE_WSDL_LOCATION;
    }

}
