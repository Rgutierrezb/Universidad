package Model;
import java.util.*;

/**
 * 
 */
public class informe {
    
    private Date fecha;
    private String autor;

    public informe(Date fecha, String autor) {
        this.fecha = fecha;
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String generarInforme() {
        return "";
    }

}