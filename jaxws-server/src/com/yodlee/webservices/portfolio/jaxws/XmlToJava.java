package com.yodlee.webservices.portfolio.jaxws;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToJava {

	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(GetPortfolio.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Object o = unmarshaller.unmarshal(new File("f:/getPortfolio.xml"));
			
			System.out.println(((GetPortfolio)o).getArg0());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	

}
