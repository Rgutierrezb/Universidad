package Model;
import java.util.*;

/**
 * 
 */
public class presupuestoSemestral {
    
    private long ingreso;

    public presupuestoSemestral(long ingreso) {
        this.ingreso = ingreso;
    }

    public long getIngreso() {
        return ingreso;
    }

    public void setIngreso(long ingreso) {
        this.ingreso = ingreso;
    }
    
    public String crearPresupuesto(long dinero) {
        if(dinero>this.ingreso){
            return "El dinero no alcanza";
        }
        else{ 
            this.ingreso = this.ingreso -  dinero;
            return "Dado nuestro presupuesto pudimos concretar la compra de los siguientes materiales:"+
            "espalderas, mástiles, canastas,banco sueco, barra fija, colchonetas, vallas,red baloncesto, red voleibol, cinta métrica"+
            "cronómetro, báscula, flexómetro,pantalones, shorts,balones, canilleras, entre otros, con la suma total de $"+dinero+" Quedando con la suma de: "+this.ingreso;
        }
    
    }

}