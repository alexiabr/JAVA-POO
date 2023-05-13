package com.company;

public class Articulo {
    private String descripcion;
    private double precioVenta;
    private int stock;

    public Articulo(String descripcion, double precio, int stock) {

        this.descripcion = descripcion;
        precioVenta = precio;
        this.stock = stock;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion; // me permite pasar por parametro un nuevo valor para descripcion
    }

    public String getDescripicion() {
        return descripcion;
    }

    public boolean hayStock() {
        return stock>0; // devuelve true si hay algun articulo
    }

    public double consultarPrecio() {
        return precioVenta; // muestra el precio a quien consulte el precio del articulo
    }

    // hay que agregar los sets y ls gets segun se necesite
}
