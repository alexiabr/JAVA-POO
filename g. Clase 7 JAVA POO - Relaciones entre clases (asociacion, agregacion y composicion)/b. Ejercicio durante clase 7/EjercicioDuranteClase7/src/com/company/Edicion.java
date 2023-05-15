package com.company;

public class Edicion {
    private int numero;
    private String fechaEdicion;
    private Double precio;
    private Articulo articulos[];
    private int numeroArticulo;

    public Edicion(int numero, int cantArticulos) {
        this.numero = numero;
        articulos = new Articulo[cantArticulos]; // array para almacenar articulos
        numeroArticulo=0;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void agregarArticulos(Articulo articulo) { // tu parametro es el articulo que ya esta creado
        articulos[numeroArticulo] = articulo;
        numeroArticulo++;

    }

public String toString() {
        String temp = "";
        for (int i = 0; i<numeroArticulo; i++) {
            
        }
}


}
