package com.yodlee.webservices.portfolio;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.yodlee.webservices.portfolio.entity.Equity;

@WebService
public interface EquityPortfolio {
	@WebMethod
	List<Equity> getPortfolio(String userId);
	
	@WebMethod
	Double getPortfolioValue(String userId);
}
