
package com.yodlee.webservices.portfolio.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPortfolioValueResponse", namespace = "http://portfolio.webservices.yodlee.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPortfolioValueResponse", namespace = "http://portfolio.webservices.yodlee.com/")
public class GetPortfolioValueResponse {

    @XmlElement(name = "return", namespace = "")
    private Double _return;

    /**
     * 
     * @return
     *     returns Double
     */
    public Double getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Double _return) {
        this._return = _return;
    }

}
