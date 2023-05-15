package com.company;

public class Chofer {
    private String nombre;
    private String apellido;
    private Auto auto;

    public Chofer(String nombre, String apellido, Auto auto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }

    // el chofer tiene un auto, y ese auto es el que va a poder acceder a los metodos de auto
    // de esta forma mantengo la responsabilidad en la clase que corresponde.
    // con ver patente lo puedo hacer desde chofer
    public String verPatente() {
        return auto.getPatente();
    }
}
