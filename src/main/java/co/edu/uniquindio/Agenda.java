package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collection;

public class Agenda {
    private String nombre;
    private Collection<Contacto> listaContactos;

    /**
     * Constructor de la clase Agenda
     * @param nombre
     */
    public Agenda(String nombre) {
        this.nombre = nombre;
        listaContactos = new ArrayList();
    }

    /**
     * Metodo para agregar contactos a la agenda
     * @param contacto
     */
    public void agregarContactos(Contacto contacto){
        listaContactos.add(contacto);
    }
    /**
     * Seccion Getters
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    public Collection<Contacto> getContactosAgenda(){
        return listaContactos;
    }
}
