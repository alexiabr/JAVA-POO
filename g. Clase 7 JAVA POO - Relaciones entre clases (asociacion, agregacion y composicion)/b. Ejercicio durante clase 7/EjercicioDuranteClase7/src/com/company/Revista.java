package com.company;

public class Revista {
    private int numero; //
    private String nombre;
    private String codigo;
    private String periodicidad;
    private Edicion ediciones[]; // array


    public Revista(String nombre, String codigo, String periodicidad)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.periodicidad = periodicidad;
        ediciones = new Edicion[100]; // le doy un largo al array
        numero = 1; //
    }
    public void nuevaEdicion(int cantidad) { // decido cuantos articulo quiero que tenga, lo paso por parametro, luego se crea un array en edicion con largo igual a la cantidad que va a tener de articulos
        Edicion nueva=new Edicion(numero, cantidad ); // creo una nueva edicion y le paso por parametro que numro le corresponde. La revista almacena que numero de edicion es
        ediciones[numero]=nueva; //
        numero++;
    }

    public Edicion[] getEdiciones() { // funcion getter, en este caso tiene que devolver un array de ediciones porque son muchas
        return ediciones;
    }
}
