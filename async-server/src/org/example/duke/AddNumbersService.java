
package org.example.duke;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AddNumbersService", targetNamespace = "http://duke.example.org", wsdlLocation = "http://localhost:8999/async?wsdl")
public class AddNumbersService
    extends Service
{

    private final static URL ADDNUMBERSSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADDNUMBERSSERVICE_EXCEPTION;
    private final static QName ADDNUMBERSSERVICE_QNAME = new QName("http://duke.example.org", "AddNumbersService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8999/async?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADDNUMBERSSERVICE_WSDL_LOCATION = url;
        ADDNUMBERSSERVICE_EXCEPTION = e;
    }

    public AddNumbersService() {
        super(__getWsdlLocation(), ADDNUMBERSSERVICE_QNAME);
    }

    public AddNumbersService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDNUMBERSSERVICE_QNAME, features);
    }

    public AddNumbersService(URL wsdlLocation) {
        super(wsdlLocation, ADDNUMBERSSERVICE_QNAME);
    }

    public AddNumbersService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDNUMBERSSERVICE_QNAME, features);
    }

    public AddNumbersService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddNumbersService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AddNumbersImpl
     */
    @WebEndpoint(name = "AddNumbersImplPort")
    public AddNumbersImpl getAddNumbersImplPort() {
        return super.getPort(new QName("http://duke.example.org", "AddNumbersImplPort"), AddNumbersImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddNumbersImpl
     */
    @WebEndpoint(name = "AddNumbersImplPort")
    public AddNumbersImpl getAddNumbersImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://duke.example.org", "AddNumbersImplPort"), AddNumbersImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDNUMBERSSERVICE_EXCEPTION!= null) {
            throw ADDNUMBERSSERVICE_EXCEPTION;
        }
        return ADDNUMBERSSERVICE_WSDL_LOCATION;
    }

}
