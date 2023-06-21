package Model;

import java.util.ArrayList;
import java.util.List;

public class Cargo {
    private String nombre;
    private List<Persona> personas;

    public Cargo(String nombre) {
        this.nombre = nombre;
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public List<Persona> getPersonas() {
        return personas;
    }
}


   





