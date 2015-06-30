package com.yodlee.webservices.portfolio;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.yodlee.webservices.portfolio.entity.Equity;

@WebService(endpointInterface="com.yodlee.webservices.portfolio.EquityPortfolio")
public class EquityPortfolioImpl implements EquityPortfolio {

	@Override
	public List<Equity> getPortfolio(String userId) {
		return getEquities();
	}

	@Override
	public Double getPortfolioValue(String userId) {
		return 200000089.0;
	}
	
	private List<Equity> getEquities() {
		List<Equity> stocks = new ArrayList<Equity>();
		stocks.add(new Equity("YDLEE", 1250L, 500.0, 700.0));
		stocks.add(new Equity("INFY", 200L, 1559.0, 2890.0));
		stocks.add(new Equity("WIPRO", 1000L, 2500.0, 1999.0));
		stocks.add(new Equity("LARTURBO", 20000L, 1500.0, 1700.0));
		
		return stocks;
	}

}
