
package com.yodlee.handler;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yodlee.handler package. 
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

    private final static QName _AddNumbersException_QNAME = new QName("http://handler.yodlee.com/", "AddNumbersException");
    private final static QName _AddNumbers_QNAME = new QName("http://handler.yodlee.com/", "addNumbers");
    private final static QName _AddNumbersResponse_QNAME = new QName("http://handler.yodlee.com/", "addNumbersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yodlee.handler
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNumbersResponse }
     * 
     */
    public AddNumbersResponse createAddNumbersResponse() {
        return new AddNumbersResponse();
    }

    /**
     * Create an instance of {@link AddNumbers }
     * 
     */
    public AddNumbers createAddNumbers() {
        return new AddNumbers();
    }

    /**
     * Create an instance of {@link AddNumbersException }
     * 
     */
    public AddNumbersException createAddNumbersException() {
        return new AddNumbersException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://handler.yodlee.com/", name = "AddNumbersException")
    public JAXBElement<AddNumbersException> createAddNumbersException(AddNumbersException value) {
        return new JAXBElement<AddNumbersException>(_AddNumbersException_QNAME, AddNumbersException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://handler.yodlee.com/", name = "addNumbers")
    public JAXBElement<AddNumbers> createAddNumbers(AddNumbers value) {
        return new JAXBElement<AddNumbers>(_AddNumbers_QNAME, AddNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://handler.yodlee.com/", name = "addNumbersResponse")
    public JAXBElement<AddNumbersResponse> createAddNumbersResponse(AddNumbersResponse value) {
        return new JAXBElement<AddNumbersResponse>(_AddNumbersResponse_QNAME, AddNumbersResponse.class, null, value);
    }

}
