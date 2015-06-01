/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.grupo6ti;

import cl.uc.integracion.banco.servicios.CrearTransaccion;
import cl.uc.integracion.banco.servicios.TransaccionArray;
import cl.uc.integracion.banco.servicios.Trx;
import cl.uc.integracion.banco.servicios.Trx_Service;
import cl.uc.integracion.banco.servicios.Transaccion;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
 
import javax.net.ssl.HttpsURLConnection;
import javax.ws.rs.DELETE;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
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
    return "[\"Test\", \"Funcionando Bien\"]";
  }
    
  /////SERVICIOS ORDEN DE COMPRA
  
  
    @PUT
  @Produces("application/json")
  @Path("/nuevaOc/{canal}/{cant}/{sku}/{proveedor}/{cliente}/{precio}/{fechae}")
  public String hacerOrdenCompra(@PathParam("canal") String canal,
                                @PathParam("cant") String cant,
                                @PathParam("sku") String sku,
                                @PathParam("proveedor") String proveedor,
                                @PathParam("cliente") String cliente,
                                @PathParam("precio") String precio,
                                @PathParam("fechae") String fechae)
                            throws MalformedURLException, IOException
                                  {
     try {
         URL url = new URL("http://chiri.ing.puc.cl/atenea/crear");
        
       
         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
         InputStream is;
         conn.setRequestProperty("Accept-Charset", "UTF-8");
         conn.setRequestProperty("Content-Type", "application/json");
         conn.setUseCaches(true);
         //conn.setRequestProperty("User-Agent","Mozilla/5.0 ( compatible ) ");
        // conn.setRequestProperty("Accept","*/*");
         conn.setRequestMethod("PUT");
         conn.setDoOutput(true);
        // conn.setRequestProperty("User-Agent", "Mozilla/5.0");
         conn.setDoInput(true);
         
         
           String ss = "{\n" +
           "  \"__v\": 0,\n" +
           "  \"created_at\": \"2015-05-30T21:41:52.435Z\",\n" +
           "  \"updated_at\": \"2015-05-30T21:41:52.435Z\",\n" +
           "  \"cliente\": \"123\",\n" +
           "  \"proveedor\": \"asd\",\n" +
           "  \"sku\": \"123\",\n" +
           "  \"_id\": \"556a2ea0ddb5bd0300215729\",\n" +
           "  \"estado\": \"creada\",\n" +
           "  \"fechaDespachos\": [],\n" +
           "  \"fechaEntrega\": \"2072-07-02T11:10:55.222Z\",\n" +
           "  \"precioUnitario\": 32,\n" +
           "  \"cantidadDespachada\": 0,\n" +
           "  \"cantidad\": 123,\n" +
           "  \"canal\": \"b2b\"\n" +
           "}";


           /*String s = "{" +
           "  \"cliente\": "+cliente+"," +
           "  \"proveedor\": "+proveedor+"," +
           "  \"sku\": "+sku+"," +
           "  \"cantidad\": "+cant+"," +
           "  \"precioUnitario\": "+precio+"," +
           "  \"canal\": "+canal+"," +
           "  \"fechaEntrega\": "+fechae+
           "}";*/
           
        OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
        out.write(ss);
        out.flush();
        out.close();
        
        
               
       /*
         conn.setRequestProperty("Content-Type", "application/j");
         conn.setRequestMethod("GET");
        // conn.setRequestProperty("User-Agent", "Mozilla/5.0");
         String result2 = "";
         conn.setDoInput(true);
         if (conn.getResponseCode() >= 400) {
             result2 = "problema \n";
            is = conn.getErrorStream();
            } else {
             is = conn.getInputStream();
         }
        */
        //conn.setRequestMethod("GET");
        if (conn.getResponseCode() >= 400) {
             is = conn.getErrorStream();
            } else {
             is = conn.getInputStream();
        }
         String result2 = "";
         BufferedReader rd = new BufferedReader(new InputStreamReader(is));
         String line;
         while ((line = rd.readLine()) != null) {
            result2 += line;
         }
         rd.close();
         return result2;
         
                                   
    //return httpCon.getResponseMessage();
         
      } catch (IOException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      }
       
    
    
    
    //HOLA hola = new HOLA();
        return ("[\"Test\", \"Funcionando Bien\"]");
   
          
  }
  
  
  
  @POST
  @Produces("application/json")
  @Path("/recepcionarOc/{id}")
  public String recepcionarOc(@PathParam("id") String id)
                                  {
      
    return "[\"Test\", \"Funcionando Bien\"]";
  }
  
    @POST
  @Produces("application/json")
  @Path("/rechazarOc/{id}/{rechazo}")
  public String rechazarOc(@PathParam("id") String id, 
                            @PathParam("rechazo") String rechazo)
                                  {
      
    return "[\"Test\", \"Funcionando Bien\"]";
  }
  
    @DELETE
  @Produces("application/json")
  @Path("/anularOc/{id}/{motivo}")
  public String anularOc(@PathParam("id") String id, 
                            @PathParam("motivo") String motivo)
                                  {
      
    return "[\"Test\", \"Funcionando Bien\"]";
  }
  
  @GET
  @Produces("application/json")
  @Path("/obtenerOc/{id}")
  public String obtenerOc(@PathParam("id") String id) throws MalformedURLException, IOException
                                  {
         String result = " ";
       try {
        String line;
        
         URL url = new URL("http://chiri.ing.puc.cl/atenea/obtener/" + id);
         
   
         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
         InputStream is;
         conn.setRequestProperty("Content-Type", "application/json");
         conn.setRequestMethod("GET");
        // conn.setRequestProperty("User-Agent", "Mozilla/5.0");
         conn.setDoInput(true);
         if (conn.getResponseCode() >= 400) {
             //result = "problema \n";
            is = conn.getErrorStream();
            } else {
             is = conn.getInputStream();
             //result = "no:problema \n";
         }
        
           BufferedReader rd = new BufferedReader(new InputStreamReader(is)); 
            
               
                  while ((line = rd.readLine()) != null) {
                   result += line;
                  }
                  
        // System.out.print(result);
      } catch (IOException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      }
       
       return result;
    
     }
  
  @POST //?
  @Produces("application/json")
  @Path("/despacharProducto/{id}")
  public String despacharOc(@PathParam("id") String id)
                            
                                  {
      
    return "[\"Test\", \"Funcionando Bien\"]";
  }
  
  
  
  
  /////Servicios Banco:
    @GET
  @Produces("application/json")
  @Path("/cuenta/{id}")
  public CuentaBancoArray getCuenta(@PathParam("id") String id) throws BadParametersException, ErrorException {
      
    Cuenta_Service sc = new Cuenta_Service();
    
    Cuenta c = sc.getCuentaPort();
    
    return c.getCuenta(id);
  }
  
  
    //Metodo que permite ver las transferencias desde una fecha de inicio a una de termino
    @GET
    @Produces("application/json")
    @Path("/cartola/{id}/{inicio}/{fin}/{limite}")
    public Cartola getCartola(  @PathParam("id") String id,
                                @PathParam("inicio") String inicio,
                                @PathParam("fin") String fin,
                                @PathParam("limite") String limite) throws BadParametersException, ErrorException {

        
      Cuenta_Service sc = new Cuenta_Service();

      Cuenta c = sc.getCuentaPort();
      
      GetCartola gc = new GetCartola();
      
      
      //Estos valores deberian ser pasados mediante parametros
      gc.setId(id);
      gc.setFin(Float.parseFloat(fin));
      gc.setLimit(Integer.parseInt(limite));
      gc.setInicio(Float.parseFloat(inicio));
     
      return c.getCartola(gc);
      
    }
  
    //Metodo que permite ver una transaccion segun su id
    @GET
    @Produces("application/json")
    @Path("/transaccion/{id}")
    public TransaccionArray getTransaccion(@PathParam("id") String id) throws cl.uc.integracion.banco.servicios.BadParametersException, cl.uc.integracion.banco.servicios.ErrorException {

      Trx_Service ts = new Trx_Service();

      Trx t = ts.getTrxPort();
      
      return t.getTransaccion(id);
      
    }
  
    //Hacer transaccion
    
    @POST
    @Produces("application/json")
    //@Produces("application/text")
    @Path("/transaccion/{origen}/{destino}/{monto}/")
    public Transaccion hacerTransaccion(
            @PathParam("origen") String origen,
            @PathParam("destino") String destino,
            @PathParam("monto") String monto) throws cl.uc.integracion.banco.servicios.BadParametersException, cl.uc.integracion.banco.servicios.ErrorException {

        Trx_Service ts = new Trx_Service();

        Trx t = ts.getTrxPort();
        
        CrearTransaccion ct = new CrearTransaccion();
        
        ct.setDestino(destino);
        ct.setMonto(Integer.parseInt(monto));
        ct.setOrigen(origen);
        
      // ejecutar logica de negocio
        return t.crearTransaccion(ct);
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
    
    //SISTEMA FACTURAS-----------------------------------------------------
    @PUT
    @Produces("application/json")
    @Path("/")
    public void emitirFactura(){
        
    }
    
    @GET
    @Produces("application/json")
    @Path("/obtenerFactura/{id}")
    public String obtenerFactura(@PathParam("id") String id){
         String result = " ";
       try {
          
    
        String line;
        
         URL url = new URL("http://chiri.ing.puc.cl/zeuz/" + id);
         
   
         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
         InputStream is;
         conn.setRequestProperty("Content-Type", "application/json");
         conn.setRequestMethod("GET");
        // conn.setRequestProperty("User-Agent", "Mozilla/5.0");
         conn.setDoInput(true);
         if (conn.getResponseCode() >= 400) {
             //result = "problema \n";
            is = conn.getErrorStream();
            } else {
             is = conn.getInputStream();
             //result = "no:problema \n";
         }
        
           BufferedReader rd = new BufferedReader(new InputStreamReader(is)); 
            
               
                  while ((line = rd.readLine()) != null) {
                   result += line;
                  }
                  
        // System.out.print(result);
      } catch (IOException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      }
       
   
       return result;
    }
    }
    /*
    @POST
    @Produces("application/json")
    //@Produces("application/text")
    @Path("/pay")
    public void pagarFactura(){
        
    }
    
    @POST
    @Produces("application/json")
    //@Produces("application/text")
    @Path("/reject")
    public void rechazarFactura(){
        
    }
    
    @POST
    @Produces("application/json")
    //@Produces("application/text")
    @Path("/cancel")
    public void anularFactura(){
        
    }*/

