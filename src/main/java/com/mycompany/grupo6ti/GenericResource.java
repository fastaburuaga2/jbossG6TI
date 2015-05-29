/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.grupo6ti;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author Francisco
 */
@Path("grupo6")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

  @GET
  @Produces("application/json")
  @Path("/algo")
  public String getTest() {
    return "[\"Test\", \"nuevoo\"]";
  }
    
    @GET
  @Produces("application/json")
  @Path("/cuenta")
  public CuentaBancoArray getCuenta() throws BadParametersException, ErrorException {
      
    Cuenta_Service sc = new Cuenta_Service();
    
    Cuenta c = sc.getCuentaPort();
    
    return c.getCuenta("556489daefb3d7030091bab4");
  }
  
    /**
     * Retrieves representation of an instance of com.mycompany.grupo6ti.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/xml")
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
