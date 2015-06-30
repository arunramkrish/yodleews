
package com.yodlee.webservices.portfolio.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPortfolioResponse", namespace = "http://portfolio.webservices.yodlee.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPortfolioResponse", namespace = "http://portfolio.webservices.yodlee.com/")
public class GetPortfolioResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.yodlee.webservices.portfolio.entity.Equity> _return;

    /**
     * 
     * @return
     *     returns List<Equity>
     */
    public List<com.yodlee.webservices.portfolio.entity.Equity> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.yodlee.webservices.portfolio.entity.Equity> _return) {
        this._return = _return;
    }

}
