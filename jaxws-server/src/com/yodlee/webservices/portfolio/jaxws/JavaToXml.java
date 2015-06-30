package com.yodlee.webservices.portfolio.jaxws;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaToXml {
	public static void main(String[] args) {
		GetPortfolio getPortfolio = new GetPortfolio();
		getPortfolio.setArg0("yodleeUser");
		
		try {
			JAXBContext context = 
					JAXBContext.newInstance(GetPortfolio.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter writer = new StringWriter();
			marshaller.marshal(getPortfolio, writer);
			
			System.out.println(writer.toString());
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
}
