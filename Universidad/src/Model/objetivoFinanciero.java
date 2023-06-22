package Model;
import java.util.*;

/**
 * 
 */
public class objetivoFinanciero {
    private float dinero;

    public objetivoFinanciero(float dinero){
        this.dinero = dinero;

    }
    
    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public String objetivosFinancieros() {
        return "\nEl objetivo financiero para este semestre es de renovar materiales para los deportistas de nuestra institucion y tenemos el monto de: "+this.dinero+"\n";
    }


}