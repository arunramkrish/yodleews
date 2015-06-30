package com.yodlee.webservices.portfolio;

import javax.xml.ws.Endpoint;

public class PortfolioServer {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/portfolio", 
				new EquityPortfolioImpl());
	}

}
