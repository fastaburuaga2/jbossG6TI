
package com.mycompany.grupo6ti;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "BadParameters", targetNamespace = "http://servicios.banco.integracion.uc.cl/")
public class BadParametersException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BadParameters faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public BadParametersException(String message, BadParameters faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public BadParametersException(String message, BadParameters faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.mycompany.grupo6ti.BadParameters
     */
    public BadParameters getFaultInfo() {
        return faultInfo;
    }

}
