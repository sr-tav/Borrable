package co.edu.uniquindio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda("Agenda Ejemplo");
        Contacto contacto1 = new Contacto("Pepe", "pepe@");
        Contacto contacto2 = new Contacto("pepa ", "pepa@");

        agenda.agregarContactos(contacto1);
        agenda.agregarContactos(contacto2);

        for (Contacto contacto: agenda.getContactosAgenda()){
            JOptionPane.showMessageDialog(null, contacto.getNombre());
        }
    }
}