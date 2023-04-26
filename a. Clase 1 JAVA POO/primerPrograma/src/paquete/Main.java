package paquete;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mi primer programa");
        // el nombre de la clase, en este caso Main debe coincidir con el nombre del archivo


        //Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
        //Informar el resultado obtenido.
//        Integer valor1 = 10;
//        Integer valor2 = 9;
//        int comparacion;
//
//        if (valor1.equals(valor2))
//            System.out.println("Son iguales");
//        else {
//            comparacion = valor1.compareTo(valor2);
//            if (comparacion > 0)
//                System.out.println("Valor 1 es mayor a Valor2");
//            else // aca no pongo condicion porque si ya da cualquier cosa que no sea un numero positivo va a ser -1, ego el valor 2 ayor al valor al1, se sobrenetiende
//                  System.out.println("Valor 2 es mayor a Valor 1");
//        }

//Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
//mensaje.

        String texto1 = "hola";
        String texto2 = "hola";

        if (texto2.equals(texto1))
            System.out.println("Son iguales");
        else {
            System.out.println("No son iguales");

        }
    }
}