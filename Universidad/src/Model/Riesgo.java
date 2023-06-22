package Model;
import java.util.*;

/**
 * 
 */
public class Riesgo {

    private float imprevisto;

    public Riesgo(float ingresoFloat) {
        this.imprevisto= ingresoFloat * 0.05f;
	}
    
    
    public float getImprevisto() {
        return imprevisto;
    }



    public void setImprevisto(float imprevisto) {
        this.imprevisto = imprevisto;
    }


    public String hayRiesgo(Long dinero){
        if(dinero<=0){
            return "Recurrimos a ocupar el dinero para imprevistos, con la cantidad de: "+this.imprevisto;
        }
        else{
            return "Hasta el momento hay dinero";
        }
    }


}
