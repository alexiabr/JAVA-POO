package com.company;

public class Main {
    public static void main(String[] args) {
        Articulo articulo = new Articulo("articulo1", 2000, 100); // creando el primer objeto
        // ahora puedo usar todos los metodos definidos
        System.out.println("Precio articulo " + articulo.consultarPrecio());

    }
}