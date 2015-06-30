package com.yodlee.handler;

import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8999/handler", new AddNumbersImpl());
	}

}
