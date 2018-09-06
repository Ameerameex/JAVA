
package com.training.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.training.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCollegeNameResponse_QNAME = new QName("http://service.training.com/", "getCollegeNameResponse");
    private final static QName _GetCollegeEmailResponse_QNAME = new QName("http://service.training.com/", "getCollegeEmailResponse");
    private final static QName _GetCollegePhoneResponse_QNAME = new QName("http://service.training.com/", "getCollegePhoneResponse");
    private final static QName _GetCollegePhone_QNAME = new QName("http://service.training.com/", "getCollegePhone");
    private final static QName _GetCollegeEmail_QNAME = new QName("http://service.training.com/", "getCollegeEmail");
    private final static QName _GetCollegeName_QNAME = new QName("http://service.training.com/", "getCollegeName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.training.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCollegeEmail }
     * 
     */
    public GetCollegeEmail createGetCollegeEmail() {
        return new GetCollegeEmail();
    }

    /**
     * Create an instance of {@link GetCollegeName }
     * 
     */
    public GetCollegeName createGetCollegeName() {
        return new GetCollegeName();
    }

    /**
     * Create an instance of {@link GetCollegeNameResponse }
     * 
     */
    public GetCollegeNameResponse createGetCollegeNameResponse() {
        return new GetCollegeNameResponse();
    }

    /**
     * Create an instance of {@link GetCollegeEmailResponse }
     * 
     */
    public GetCollegeEmailResponse createGetCollegeEmailResponse() {
        return new GetCollegeEmailResponse();
    }

    /**
     * Create an instance of {@link GetCollegePhoneResponse }
     * 
     */
    public GetCollegePhoneResponse createGetCollegePhoneResponse() {
        return new GetCollegePhoneResponse();
    }

    /**
     * Create an instance of {@link GetCollegePhone }
     * 
     */
    public GetCollegePhone createGetCollegePhone() {
        return new GetCollegePhone();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollegeNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.training.com/", name = "getCollegeNameResponse")
    public JAXBElement<GetCollegeNameResponse> createGetCollegeNameResponse(GetCollegeNameResponse value) {
        return new JAXBElement<GetCollegeNameResponse>(_GetCollegeNameResponse_QNAME, GetCollegeNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollegeEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.training.com/", name = "getCollegeEmailResponse")
    public JAXBElement<GetCollegeEmailResponse> createGetCollegeEmailResponse(GetCollegeEmailResponse value) {
        return new JAXBElement<GetCollegeEmailResponse>(_GetCollegeEmailResponse_QNAME, GetCollegeEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollegePhoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.training.com/", name = "getCollegePhoneResponse")
    public JAXBElement<GetCollegePhoneResponse> createGetCollegePhoneResponse(GetCollegePhoneResponse value) {
        return new JAXBElement<GetCollegePhoneResponse>(_GetCollegePhoneResponse_QNAME, GetCollegePhoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollegePhone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.training.com/", name = "getCollegePhone")
    public JAXBElement<GetCollegePhone> createGetCollegePhone(GetCollegePhone value) {
        return new JAXBElement<GetCollegePhone>(_GetCollegePhone_QNAME, GetCollegePhone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollegeEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.training.com/", name = "getCollegeEmail")
    public JAXBElement<GetCollegeEmail> createGetCollegeEmail(GetCollegeEmail value) {
        return new JAXBElement<GetCollegeEmail>(_GetCollegeEmail_QNAME, GetCollegeEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollegeName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.training.com/", name = "getCollegeName")
    public JAXBElement<GetCollegeName> createGetCollegeName(GetCollegeName value) {
        return new JAXBElement<GetCollegeName>(_GetCollegeName_QNAME, GetCollegeName.class, null, value);
    }

}
