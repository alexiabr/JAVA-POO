
/* Crear una funcion que indique si un numero es divisible por el otro */

import java.util.Scanner;

public class Main {
    public static boolean esDivisible (int num1, int num2) {
        return num1%num2==0;  // esto ya me devuelve un resultado booleano, no hace falta un if statement
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        boolean resultado;
        System.out.println("Ingrese un numero");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese un numero");
        numero2 = scanner.nextInt();
        resultado = esDivisible(numero1, numero2);
        if (resultado == true)
            System.out.println("El numero " + numero1 + " es divisible por el numero " + numero2);
        else
            System.out.println("El numero " + numero1 + " NO es divisible por el numero " + numero2);
    }
}