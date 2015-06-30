package com.yodlee.async;

import javax.jws.WebService;

@WebService (serviceName = "AddNumbersService", targetNamespace = "http://duke.example.org")
public class AddNumbersImpl {
    
    public int addNumbers (int number1, int number2) {
        System.out.println ("Received Request!");
        System.out.println("Sleeping for 5 seconds");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return number1 + number2;
    }
}
