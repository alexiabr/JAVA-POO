import java.util.Scanner;

//Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
//        función debe comprobar si el primer número es divisible por el segundo.
public class Main {
    public static boolean esDivisible(int num1,int num2)
    {
        boolean divisible = true;
        if (num1%num2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = scanner.nextInt();
        System.out.println("Es el numero 1 divisible por el numero 2? " + esDivisible(numero1, numero2));

    }


    }

