package paq;

//@author Nigth Crawler

import java.util.ArrayList;


public class Pais {
    private String nombre;
    private ArrayList<Ciudad> listadoCiudades;
    
    public Pais(String nombre) {
        this.nombre = nombre;       
        this.listadoCiudades = new ArrayList<>();
    }
    
    public String infoCiudad(String ciudadBuscada){
        for (Ciudad ciudad : this.listadoCiudades){
            if (ciudad.getNombre().equalsIgnoreCase(ciudadBuscada)){
                //return true;
                return ciudad.getNombre()+": "+ ciudad.getIndicativo();
            }
        }
        //return false;
        return "Ciudad no encontrada";
    }
    public boolean existeCiudad(String ciudadBuscada){
        for (Ciudad ciudad : this.listadoCiudades){
            if (ciudad.getNombre().equalsIgnoreCase(ciudadBuscada)){
                return true;
                //return ciudad.getNombre();
            }
        }
        return false;
        //return "Ciudad no encontrada";
    }
    
    public String getInformacion(){
        String m="";
        m += "\nInformación de "+ this.nombre+ ":";
        m += "\nCiudades: ";
        
        for (Ciudad ciudad : this.listadoCiudades) {
            m += "\n\t" + ciudad.getNombre();
        }
        
        return m;
    }
    
    public void agregarCiudad (Ciudad ciudad){
        this.listadoCiudades.add(ciudad);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
