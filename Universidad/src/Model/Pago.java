package Model;
import java.util.*;

public class Pago {

    /*
    private int horasTrabajadas;
    private float pagoPorHora;
    private String nombre;
    

    public Pago(int horasTrabajadas, float pagoPorHora, String nombre) {
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
        this.nombre = nombre;
    }
    */
    public Pago(){}

    public void generarPagos(Cargo cargo) {
        List<Persona> personas = cargo.getPersonas();
        for (Persona persona : personas) {
            int rut = persona.getRut();
            String nombre = persona.getNombre();
            // Realizar lógica para generar los pagos para cada persona
            System.out.println("Generando pago para: " + nombre +"\nRut: " + rut);
        }
    }

}