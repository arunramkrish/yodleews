package com.yodlee.webservices.portfolio;

import java.util.List;

public class PortfolioClient {

	public static void main(String[] args) {
		EquityPortfolio eq = 
				new EquityPortfolioImplService().getEquityPortfolioImplPort();
		List<Equity> stocks = eq.getPortfolio("ydleuser");
		for (Equity e : stocks) {
			System.out.println(e.getSymbol() + ":" + 
					(e.getMarketPrice() * e.getQuantity()));
		}

	}

}
