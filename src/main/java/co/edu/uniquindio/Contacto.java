package co.edu.uniquindio;

public class Contacto {
    private String nombre;
    private String apellido;

    /**
     * Constructor de la calse Contactos
     * @param nombre
     * @param apellido
     */
    public Contacto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Seccion Getters
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
}
