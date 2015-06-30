
package com.yodlee.webservices.portfolio;

import java.util.List;
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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EquityPortfolio", targetNamespace = "http://portfolio.webservices.yodlee.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EquityPortfolio {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPortfolioValue", targetNamespace = "http://portfolio.webservices.yodlee.com/", className = "com.yodlee.webservices.portfolio.GetPortfolioValue")
    @ResponseWrapper(localName = "getPortfolioValueResponse", targetNamespace = "http://portfolio.webservices.yodlee.com/", className = "com.yodlee.webservices.portfolio.GetPortfolioValueResponse")
    @Action(input = "http://portfolio.webservices.yodlee.com/EquityPortfolio/getPortfolioValueRequest", output = "http://portfolio.webservices.yodlee.com/EquityPortfolio/getPortfolioValueResponse")
    public Double getPortfolioValue(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.yodlee.webservices.portfolio.Equity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPortfolio", targetNamespace = "http://portfolio.webservices.yodlee.com/", className = "com.yodlee.webservices.portfolio.GetPortfolio")
    @ResponseWrapper(localName = "getPortfolioResponse", targetNamespace = "http://portfolio.webservices.yodlee.com/", className = "com.yodlee.webservices.portfolio.GetPortfolioResponse")
    @Action(input = "http://portfolio.webservices.yodlee.com/EquityPortfolio/getPortfolioRequest", output = "http://portfolio.webservices.yodlee.com/EquityPortfolio/getPortfolioResponse")
    public List<Equity> getPortfolio(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}