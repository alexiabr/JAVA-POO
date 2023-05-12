// Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
//una tercera tus iniciales.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String nombre, apellido;
       char inicialNombre, inicialApellido;
       Scanner scanner;
       scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = scanner.nextLine();
        inicialNombre = nombre.charAt(0);
        inicialApellido = apellido.charAt(0);
        System.out.println("Su iniciales son: " + inicialNombre + inicialApellido);
    }
}