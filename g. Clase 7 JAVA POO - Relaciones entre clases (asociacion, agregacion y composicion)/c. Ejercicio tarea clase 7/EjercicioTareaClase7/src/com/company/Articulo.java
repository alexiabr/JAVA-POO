package com.company;

public class Articulo {
    private String nombre;
    private Double precio;

    public Articulo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
// getters
    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
// setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
