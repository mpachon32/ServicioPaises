/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package paq;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Nigth Crawler
 */
@WebService(serviceName = "Calculos")
public class ConsultasPaises {
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello() {
        return "Hola mundo !";
    }
    
    @WebMethod(operationName = "verPaises")
    public String mostrarPaises() {
        Ciudad c1= new Ciudad("Soacha", "601");
        Ciudad c2= new Ciudad ("Cali", "602");
        Ciudad c3= new Ciudad ("Envigado", "604");    
        
        Ciudad c4= new Ciudad ("New York", "212");
        Ciudad c5= new Ciudad ("Miami", "786");
        Ciudad c6= new Ciudad ("Chicago", "872");
        
        Ciudad c7= new Ciudad ("Roma", "06");
        Ciudad c8= new Ciudad ("Bolonia", "051");
        Ciudad c9= new Ciudad ("Cagliari", "070");
        
        Ciudad c10= new Ciudad ("Veracruz", "229");
        Ciudad c11= new Ciudad ("Morelia", "443");
        Ciudad c12= new Ciudad ("Tijuana", "664");
        
        Ciudad c13= new Ciudad ("Niza", "493");
        Ciudad c14= new Ciudad ("Lyon", "334");
        Ciudad c15= new Ciudad ("Lille", "320");
        
        Pais colombia = new Pais("Colombia");
        Pais usa = new Pais("USA");
        Pais italia = new Pais("Italia");
        Pais mexico = new Pais("Mexico");
        Pais francia = new Pais("Francia");
       
        colombia.agregarCiudad(c1);
        colombia.agregarCiudad(c2);
        colombia.agregarCiudad(c3);
        
        usa.agregarCiudad(c4);
        usa.agregarCiudad(c5);
        usa.agregarCiudad(c6);
        
        italia.agregarCiudad(c7);
        italia.agregarCiudad(c8);
        italia.agregarCiudad(c9);
        
        mexico.agregarCiudad(c10);
        mexico.agregarCiudad(c11);
        mexico.agregarCiudad(c12);
        
        francia.agregarCiudad(c13);
        francia.agregarCiudad(c14);
        francia.agregarCiudad(c15);
        
        Mundo mundo = new Mundo();
        mundo.agregarPais(colombia);
        mundo.agregarPais(usa);
        mundo.agregarPais(italia);
        mundo.agregarPais(mexico);
        mundo.agregarPais(francia);
        
        return mundo.listarPaises();   
    }

    /**
     * Web service operation
     */
//    @WebMethod(operationName = "ver_indicativo")
//    public String informacionCiudad(@WebParam(name = "ciudad") String ciudad) {
//        
//    }
    @WebMethod(operationName = "ver_ciudades")
    public String informacionPais(@WebParam(name = "pais") String pais) {
        //TODO write your implementation code here:
        Ciudad c1= new Ciudad("Soacha", "601");
        Ciudad c2= new Ciudad ("Cali", "602");
        Ciudad c3= new Ciudad ("Envigado", "604");    
        
        Ciudad c4= new Ciudad ("New York", "212");
        Ciudad c5= new Ciudad ("Miami", "786");
        Ciudad c6= new Ciudad ("Chicago", "872");
        
        Ciudad c7= new Ciudad ("Roma", "06");
        Ciudad c8= new Ciudad ("Bolonia", "051");
        Ciudad c9= new Ciudad ("Cagliari", "070");
        
        Ciudad c10= new Ciudad ("Veracruz", "229");
        Ciudad c11= new Ciudad ("Morelia", "443");
        Ciudad c12= new Ciudad ("Tijuana", "664");
        
        Ciudad c13= new Ciudad ("Niza", "493");
        Ciudad c14= new Ciudad ("Lyon", "334");
        Ciudad c15= new Ciudad ("Lille", "320");
        
        Pais colombia = new Pais("Colombia");
        Pais usa = new Pais("USA");
        Pais italia = new Pais("Italia");
        Pais mexico = new Pais("Mexico");
        Pais francia = new Pais("Francia");
       
        colombia.agregarCiudad(c1);
        colombia.agregarCiudad(c2);
        colombia.agregarCiudad(c3);
        
        usa.agregarCiudad(c4);
        usa.agregarCiudad(c5);
        usa.agregarCiudad(c6);
        
        italia.agregarCiudad(c7);
        italia.agregarCiudad(c8);
        italia.agregarCiudad(c9);
        
        mexico.agregarCiudad(c10);
        mexico.agregarCiudad(c11);
        mexico.agregarCiudad(c12);
        
        francia.agregarCiudad(c13);
        francia.agregarCiudad(c14);
        francia.agregarCiudad(c15);
        
        Mundo mundo = new Mundo();
        mundo.agregarPais(colombia);
        mundo.agregarPais(usa);
        mundo.agregarPais(italia);
        mundo.agregarPais(mexico);
        mundo.agregarPais(francia);
        
        
        return mundo.buscarInformacionPais(pais);
    }
    
    @WebMethod(operationName = "ver_indicativo")
    public String informacionCiudad(@WebParam(name = "ciudad") String ciudad) {
        //TODO write your implementation code here:
        Ciudad c1= new Ciudad("Soacha", "601");
        Ciudad c2= new Ciudad ("Cali", "602");
        Ciudad c3= new Ciudad ("Envigado", "604");    
        
        Ciudad c4= new Ciudad ("New York", "212");
        Ciudad c5= new Ciudad ("Miami", "786");
        Ciudad c6= new Ciudad ("Chicago", "872");
        
        Ciudad c7= new Ciudad ("Roma", "06");
        Ciudad c8= new Ciudad ("Bolonia", "051");
        Ciudad c9= new Ciudad ("Cagliari", "070");
        
        Ciudad c10= new Ciudad ("Veracruz", "229");
        Ciudad c11= new Ciudad ("Morelia", "443");
        Ciudad c12= new Ciudad ("Tijuana", "664");
        
        Ciudad c13= new Ciudad ("Niza", "493");
        Ciudad c14= new Ciudad ("Lyon", "334");
        Ciudad c15= new Ciudad ("Lille", "320");
        
        Pais colombia = new Pais("Colombia");
        Pais usa = new Pais("USA");
        Pais italia = new Pais("Italia");
        Pais mexico = new Pais("Mexico");
        Pais francia = new Pais("Francia");
       
        colombia.agregarCiudad(c1);
        colombia.agregarCiudad(c2);
        colombia.agregarCiudad(c3);
        
        usa.agregarCiudad(c4);
        usa.agregarCiudad(c5);
        usa.agregarCiudad(c6);
        
        italia.agregarCiudad(c7);
        italia.agregarCiudad(c8);
        italia.agregarCiudad(c9);
        
        mexico.agregarCiudad(c10);
        mexico.agregarCiudad(c11);
        mexico.agregarCiudad(c12);
        
        francia.agregarCiudad(c13);
        francia.agregarCiudad(c14);
        francia.agregarCiudad(c15);
        
        Mundo mundo = new Mundo();
        mundo.agregarPais(colombia);
        mundo.agregarPais(usa);
        mundo.agregarPais(italia);
        mundo.agregarPais(mexico);
        mundo.agregarPais(francia);
        
        return mundo.buscarCiudad(ciudad);
    }
    @GetMapping (path = "{ingresarCantidad}/{de}/{a}")
    
    
    public String convertirMoneda(@PathVariable String ingresarCantidad, @PathVariable String de, @PathVariable String a){
        
        double cantidad = Double.parseDouble(ingresarCantidad);
        
        OperacionesConversor operacionesConversor = new OperacionesConversor();
        operacionesConversor.convertirMoneda(cantidad, de, a);
        String result = ingresarCantidad+ " "+ de +" Son: "+ operacionesConversor.convertirMoneda(cantidad, de, a)+" "+a;
        return result;
        
    }
    
}
