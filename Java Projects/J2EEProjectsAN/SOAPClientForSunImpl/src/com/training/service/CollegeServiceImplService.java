
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
@WebServiceClient(name = "CollegeServiceImplService", targetNamespace = "http://service.training.com/", wsdlLocation = "http://localhost:8080/SOAPServiceSunImpl/cs?wsdl")
public class CollegeServiceImplService
    extends Service
{

    private final static URL COLLEGESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException COLLEGESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName COLLEGESERVICEIMPLSERVICE_QNAME = new QName("http://service.training.com/", "CollegeServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SOAPServiceSunImpl/cs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COLLEGESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        COLLEGESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public CollegeServiceImplService() {
        super(__getWsdlLocation(), COLLEGESERVICEIMPLSERVICE_QNAME);
    }

    public CollegeServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COLLEGESERVICEIMPLSERVICE_QNAME, features);
    }

    public CollegeServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, COLLEGESERVICEIMPLSERVICE_QNAME);
    }

    public CollegeServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COLLEGESERVICEIMPLSERVICE_QNAME, features);
    }

    public CollegeServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CollegeServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CollegeService
     */
    @WebEndpoint(name = "CollegeServiceImplPort")
    public CollegeService getCollegeServiceImplPort() {
        return super.getPort(new QName("http://service.training.com/", "CollegeServiceImplPort"), CollegeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CollegeService
     */
    @WebEndpoint(name = "CollegeServiceImplPort")
    public CollegeService getCollegeServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.training.com/", "CollegeServiceImplPort"), CollegeService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COLLEGESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw COLLEGESERVICEIMPLSERVICE_EXCEPTION;
        }
        return COLLEGESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}