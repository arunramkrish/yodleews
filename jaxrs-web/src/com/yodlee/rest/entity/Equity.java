package com.yodlee.rest.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Equity {
	private String symbol;
	private Long quantity;
	private Double avgBuyPrice;
	private Double marketPrice;
	
	public Equity(String symbol, Long quantity, Double avgBuyPrice,
			Double marketPrice) {
		super();
		this.symbol = symbol;
		this.quantity = quantity;
		this.avgBuyPrice = avgBuyPrice;
		this.marketPrice = marketPrice;
	}
	
	
	public Equity() {
		super();
	}


	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Double getAvgBuyPrice() {
		return avgBuyPrice;
	}
	public void setAvgBuyPrice(Double avgBuyPrice) {
		this.avgBuyPrice = avgBuyPrice;
	}
	public Double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}
}
