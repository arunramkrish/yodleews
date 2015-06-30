
package com.yodlee.webservices.portfolio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yodlee.webservices.portfolio package. 
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

    private final static QName _GetPortfolioValue_QNAME = new QName("http://portfolio.webservices.yodlee.com/", "getPortfolioValue");
    private final static QName _GetPortfolio_QNAME = new QName("http://portfolio.webservices.yodlee.com/", "getPortfolio");
    private final static QName _GetPortfolioValueResponse_QNAME = new QName("http://portfolio.webservices.yodlee.com/", "getPortfolioValueResponse");
    private final static QName _Equity_QNAME = new QName("http://portfolio.webservices.yodlee.com/", "equity");
    private final static QName _GetPortfolioResponse_QNAME = new QName("http://portfolio.webservices.yodlee.com/", "getPortfolioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yodlee.webservices.portfolio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPortfolioResponse }
     * 
     */
    public GetPortfolioResponse createGetPortfolioResponse() {
        return new GetPortfolioResponse();
    }

    /**
     * Create an instance of {@link Equity }
     * 
     */
    public Equity createEquity() {
        return new Equity();
    }

    /**
     * Create an instance of {@link GetPortfolioValueResponse }
     * 
     */
    public GetPortfolioValueResponse createGetPortfolioValueResponse() {
        return new GetPortfolioValueResponse();
    }

    /**
     * Create an instance of {@link GetPortfolio }
     * 
     */
    public GetPortfolio createGetPortfolio() {
        return new GetPortfolio();
    }

    /**
     * Create an instance of {@link GetPortfolioValue }
     * 
     */
    public GetPortfolioValue createGetPortfolioValue() {
        return new GetPortfolioValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortfolioValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://portfolio.webservices.yodlee.com/", name = "getPortfolioValue")
    public JAXBElement<GetPortfolioValue> createGetPortfolioValue(GetPortfolioValue value) {
        return new JAXBElement<GetPortfolioValue>(_GetPortfolioValue_QNAME, GetPortfolioValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortfolio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://portfolio.webservices.yodlee.com/", name = "getPortfolio")
    public JAXBElement<GetPortfolio> createGetPortfolio(GetPortfolio value) {
        return new JAXBElement<GetPortfolio>(_GetPortfolio_QNAME, GetPortfolio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortfolioValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://portfolio.webservices.yodlee.com/", name = "getPortfolioValueResponse")
    public JAXBElement<GetPortfolioValueResponse> createGetPortfolioValueResponse(GetPortfolioValueResponse value) {
        return new JAXBElement<GetPortfolioValueResponse>(_GetPortfolioValueResponse_QNAME, GetPortfolioValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Equity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://portfolio.webservices.yodlee.com/", name = "equity")
    public JAXBElement<Equity> createEquity(Equity value) {
        return new JAXBElement<Equity>(_Equity_QNAME, Equity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortfolioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://portfolio.webservices.yodlee.com/", name = "getPortfolioResponse")
    public JAXBElement<GetPortfolioResponse> createGetPortfolioResponse(GetPortfolioResponse value) {
        return new JAXBElement<GetPortfolioResponse>(_GetPortfolioResponse_QNAME, GetPortfolioResponse.class, null, value);
    }

}
