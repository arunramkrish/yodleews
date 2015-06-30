package com.yodlee.handler;

public class Client {

	public static void main(String[] args) {
		AddNumbersImpl add = new AddNumbersImplService().getAddNumbersImplPort();
		try {
			System.out.println(add.addNumbers(-5, -10));
		} catch (AddNumbersException_Exception e) {
			e.printStackTrace();
		}
	}

}
