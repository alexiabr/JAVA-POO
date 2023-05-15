package com.company;

public class Main {
    public static void main(String[] args) {
        // son todas relaciones de composicion porque, en este contexto, un articulo no tiene sentido por fuera de la edicion, y
        //  a su vez, una edicion no tiene sentido si la revista no existe
        // la relacion es de uno a muchos en ambos casos, una revista tiene muchas ediciones y una edicion tiene muchos articulos
    Articulo miArticulo = new Articulo("aaa", "bbb", "LAB", "1/05");
    Revista miRevista = new Revista("Programacion 101", "255", "mensual");
    miRevista.nuevaEdicion(12); // habran doce articulos en la edicion
        Edicion misEdiciones[] = miRevista.getEdiciones(); //
        // expliciacion linea anterior: mi revista cuando me devuleve las ediciones con getEdiciones, me devuelve un array. Y como es una funcion, ese array que devuelve lo tiene que atrapar(contener), entonces creo ese array aux para almacenar el array resultante de miRevista.getEdiciones()
        misEdiciones[1].setPrecio(800.00);
        misEdiciones[1].agregarArticulos(miArticulo);
    }
}