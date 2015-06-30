package com.yodlee.webservices.portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.yodlee.webservices.portfolio.entity.Equity;

@WebService(endpointInterface = "com.yodlee.webservices.portfolio.EquityPortfolio")
public class EquityPortfolioImpl implements EquityPortfolio {
	@Resource
	private WebServiceContext webServiceContext;

	@Override
	public List<Equity> getPortfolio(String userId) {
		if (authenticate()) {
			System.out.println("Authentication successful");
			return getEquities();
		} else {
			System.out.println("Authentication failure");
			return null;
		}
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

	private boolean authenticate() {
		MessageContext messageContext = webServiceContext.getMessageContext();

		// get request headers
		Map<?, ?> requestHeaders = (Map<?, ?>) messageContext
				.get(MessageContext.HTTP_REQUEST_HEADERS);
		List<?> usernameList = (List<?>) requestHeaders.get("username");
		List<?> passwordList = (List<?>) requestHeaders.get("password");

		String username = "";
		String password = "";

		if (usernameList != null) {
			username = usernameList.get(0).toString();
		}

		if (passwordList != null) {
			password = passwordList.get(0).toString();
		}

		// of course this is not real validation
		// you should validate your users from stored databases credentials
		if (username.equals("yodleeuser") && password.equals("yodlee")) {
			return true;
		} else {
			return false;
		}
	}
}
