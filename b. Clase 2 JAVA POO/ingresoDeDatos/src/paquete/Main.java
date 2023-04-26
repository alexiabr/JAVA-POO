package paquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner; // java por defecto no la reconoce a scanner, por ende hay que importar lo que le hace falta
        scanner = new Scanner(System.in);  // system.in es toda la informacion que se ingresa por teclado, de esa forma voy a poder levantar todos los datos que se van a ir ingresando por teclado
        int edad;
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();
        // hay que usar el metodo asociado al tipo de dato
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
    }
}