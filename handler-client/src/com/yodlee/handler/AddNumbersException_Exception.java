
package com.yodlee.handler;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AddNumbersException", targetNamespace = "http://handler.yodlee.com/")
public class AddNumbersException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AddNumbersException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public AddNumbersException_Exception(String message, AddNumbersException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public AddNumbersException_Exception(String message, AddNumbersException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.yodlee.handler.AddNumbersException
     */
    public AddNumbersException getFaultInfo() {
        return faultInfo;
    }

}
