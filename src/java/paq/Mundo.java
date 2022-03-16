package paq;

//@author Nigth Crawler

import java.util.ArrayList;


public class Mundo {
    private ArrayList<Pais> listadoPaises;
    
    public String cargarDatos(String pais){
        
        String nombrePaisBuscado = pais;
        System.out.println(pais);
        Ciudad c1= new Ciudad("Bogotá", "601");
        Ciudad c2= new Ciudad ("Cali", "602");
        Ciudad c3= new Ciudad ("Medellín", "604");    
        
        Ciudad c4= new Ciudad ("New York", "212");
        Ciudad c5= new Ciudad ("Miami", "786");
        Ciudad c6= new Ciudad ("Chicago", "872");
        
        Ciudad c7= new Ciudad ("Madrid", "91");
        Ciudad c8= new Ciudad ("Valencia", "96");
        Ciudad c9= new Ciudad ("Bilbao", "94");
        
        Pais colombia = new Pais("Colombia");
        Pais usa = new Pais("USA");
        Pais españa = new Pais("España");
       
        colombia.agregarCiudad(c1);
        colombia.agregarCiudad(c2);
        colombia.agregarCiudad(c3);
        
        usa.agregarCiudad(c4);
        usa.agregarCiudad(c5);
        usa.agregarCiudad(c6);
        
        españa.agregarCiudad(c7);
        españa.agregarCiudad(c8);
        españa.agregarCiudad(c9);
        
        Mundo mundo = new Mundo();
        mundo.agregarPais(colombia);
        mundo.agregarPais(usa);
        mundo.agregarPais(españa);
        
        return buscarInformacionPais(nombrePaisBuscado);
        
    }
    public  Mundo () {
    this.listadoPaises = new ArrayList<>();            
    }
    
    public void agregarPais (Pais pais){
        this.listadoPaises.add (pais);        
    }
    
    public  String buscarCiudad(String ciudadBuscada){
        for (Pais pais : this.listadoPaises) {
            if (pais.existeCiudad(ciudadBuscada)){
                pais.infoCiudad(ciudadBuscada);
                
                return pais.infoCiudad(ciudadBuscada);
            }            
        }
        return "Ciudad no existe";
    }
    
    public  String buscarInformacionPais(String nombrePaisBuscado){
        
        for (Pais pais : this.listadoPaises) {
            if (pais.getNombre().equalsIgnoreCase(nombrePaisBuscado)){
                return pais.getInformacion();
            }
            
        }
        return "Pais no encontrado";
    }
    public  String listarPaises(){
        String m="";
        m += "\nListado de países disponibles: ";
        
        for (Pais pais : this.listadoPaises) {
            m += "\n\t" + pais.getNombre();
        }
        
        return m;
    }
    
}
