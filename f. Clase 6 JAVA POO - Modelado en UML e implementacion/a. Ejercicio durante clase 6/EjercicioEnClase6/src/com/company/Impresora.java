package com.company;

public class Impresora {
    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private int cantidadHojas;

// constructor
    public Impresora (String modelo, String tipoConexion, String fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;

    }

    // metodos

    private boolean tieneHojas() {
        return cantidadHojas>0; // va como privado porque es problema de la impresora corroborar si tine hojas o no, no mio como usuario. Solo la propia impresora puede acceder a su metodo
    }

    public void imprimir(String texto){
        if(tieneHojas()) {// esto solo se ejecuta si tieneHojas es verdadero, asi funciona
            System.out.println(texto);
            cantidadHojas--;
        }
    }

    // otro metodo llamado igual, para llamarlo tengo que darle toda la cantidad de parametros necesaria

    public void imprimir(String texto, int cantCopias) {
        for (int i = cantCopias; i > 0; i--) {// el bucle arranca desde la cant de copias que tiene que hacer, y para cuando no le queda nngua pendent
            imprimir(texto); // llamo a la funcion imprimir y hace lo que tiene que hacer
            }
        }



    public void agregarHojas(int hojas) {
        cantidadHojas += hojas;
    }

    public String toString() {
        return "Cantidad de hojas: " + cantidadHojas;
    }
}
