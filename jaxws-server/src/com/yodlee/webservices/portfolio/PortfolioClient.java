package com.yodlee.webservices.portfolio;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class PortfolioClient {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8888/portfolio?wsdl");
		 
        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://portfolio.webservices.yodlee.com/", 
        		"EquityPortfolioImplService");
 
        Service service = Service.create(url, qname);
 
        EquityPortfolio portfolio = service.getPort(EquityPortfolio.class);
 
        System.out.println(portfolio.getPortfolioValue("yodleeuser"));
 
	}
}
