package com.company;

public class Main {
    public static void main(String[] args) {
        Impresora impresora = new Impresora("HP", "USB", "2023");
        impresora.agregarHojas(100);
        impresora.imprimir(("Hola"));
        System.out.println(impresora.toString());
        impresora.imprimir("Hasta luego", 10);
        System.out.println(impresora.toString());
    }
}