package com.company;

public class Main {
    public static void main(String[] args) {
        // son todas relaciones de composicion porque, en este contexto, un articulo no tiene sentido por fuera de la edicion, y
        //  a su vez, una edicion no tiene sentido si la revista no existe
        // la relacion es de uno a muchos en ambos casos, una revista tiene muchas ediciones y una edicion tiene muchos articulos

        Articulo miArticulo = new Articulo("art1", "bbb", "Luciana Briones", "1/05");
        Articulo miArticulo2 = new Articulo("art2", "ccc", "Luciana Briones", "2/05");
        Revista miRevista = new Revista("Programacion 101", "255", "mensual");
        miRevista.nuevaEdicion(12); // habran doce articulos en la edicion, pero on otra edicion tranquilamente podrian haber mas
        Edicion misEdiciones[] = miRevista.getEdiciones();
        // expliciacion linea anterior: mi revista cuando me devuleve las ediciones con getEdiciones, me devuelve un array. Y como es una funcion, ese array que devuelve lo tiene que atrapar(contener), entonces creo ese array aux para almacenar el array resultante de miRevista.getEdiciones()

        misEdiciones[1].setPrecio(800.00);
        misEdiciones[1].agregarArticulos(miArticulo); // agrego el articulo a edicion 1
        misEdiciones[1].agregarArticulos(miArticulo2);
        misEdiciones[1].setFechaEdicion("14/05");
        System.out.println(misEdiciones[1].toString());

    }
}