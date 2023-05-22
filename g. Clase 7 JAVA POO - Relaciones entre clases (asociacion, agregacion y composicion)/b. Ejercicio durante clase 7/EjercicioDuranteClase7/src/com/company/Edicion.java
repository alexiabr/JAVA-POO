package com.company;

public class Edicion {
    private int numero;
    private String fechaEdicion;
    private Double precio;
    private Articulo articulos[]; // asi se muestra la relacion de composicion, una revista esta compuesta por muchos atributos
    private int numeroArticulo; // para llevar la cuenta de cuantos articulos hay creados

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
    String temp = ""; // temp es de temporal
    for (int i = 0; i<numeroArticulo; i++) {
        temp += articulos[i].toString(); // para poder hacerlo hay que hacer el metodo to String en articulo, estoy usando la funcion toString para mostrar cada articulo,recorriendo un array con los articulos
        // cada vuelta del for, se guarda en la cadena la informacion del aritculo, y ya luego se devuelve todo lo acumulado en esa cadena temp en la linea de abajo del return
    }
        return "Numero: " + numero + "\n fecha de edicion: " + fechaEdicion + "\n precio: " + precio +  "\n cant de articulos: " + numeroArticulo + "\n"  +  temp;


}


}
