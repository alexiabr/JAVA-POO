package com.company;

public class Articulo {
    private String titulo;
    private String tema;
    private String autor;
    private String fechaArticulo;
    private int numeroArticulo;

    public Articulo(String titulo, String tema, String autor, String fechaArticulo) {
        this.titulo = titulo;
        this.tema = tema;
        this.autor = autor;
        this.fechaArticulo = fechaArticulo;

    }
    public String toString()
    {
        return "\n titulo: "+ titulo +"\n tema: " + tema + "\n autor: " + autor + "\n fecha: "+ fechaArticulo  + "\n";
    }
}
