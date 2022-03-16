package paq;

//@author Nigth Crawler

public class Ciudad {
    private String nombre;
    private String indicativo;

    public Ciudad(String nombre, String indicativo) {
        this.nombre = nombre;
        this.indicativo = indicativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(String indicativo) {
        this.indicativo = indicativo;
    }
    
}
