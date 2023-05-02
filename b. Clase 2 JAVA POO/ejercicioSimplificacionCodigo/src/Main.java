
public class Main {

public static boolean checkEven(int num1) {
        if (num1 < 0) {
        System.out.println("El numero debe ser positivo");
        return false;
        }
        return num1 % 2 == 0;
        }

//  2.	Hacer una función que dado un numero entero divida su valor por 2 si es par.
//  Caso contrario debe multiplicar su valor por tres y sumarle uno.
//  Si el número dado es cero, escribir un mensaje que diga: El número no puede ser cero.

public static int test2 (int num) {
        if (num == 0) {
        System.out.println("El numero no puede ser cero");
        return 0;
        }
        if (num % 2 == 0) {
        return num / 2;
        }
        return num*3 + 1;
        }

//    Dado un número entero, verificar si es mayor que cero. Verificar que sea múltiplo de 3, 5 y 9.
//    Se retornará un valor que sea la suma de las siguientes condiciones:
//            •	Si el número dato es múltiplo de 3, el valor parcial será el número dato por 4.
//            •	Si el número dato es múltiplo de 3 y 5, el valor parcial será el número dato dividido 5.
//            •	Si el número dato es múltiplo de 3, 5 y 9, el valor parcial será el número dato más 5.
//    Si cumple estas condiciones, retornar la suma de los valores parciales.En caso contrario devolver el mismo número.

public static int test3 (int number) {
        int result;
        result = 0;
        if (number <= 0) {
        return number;
        }
        if (number % 3 == 0) {
        result += number*4;
        if (number % 5 == 0) {
        result += number/5;
        if (number % 9 == 0) {
        result += number + 5;
        return result;
        }
        }
        }
        return number;
        }

public static int test4 (int number) {

        if (number <= 0 ||  number % 105 != 0)
        return number;

        return number*4 + number/5 + number + 5;
        }



public static void main (String[]args){

//            System.out.println(checkEven(4));
//            System.out.println(checkEven(-4));
//            System.out.println(checkEven(5));

//            System.out.println(test2(0));
//            System.out.println(test2(16));
//            System.out.println(test2(33));


//            System.out.println(test3(3));
//            System.out.println(test3(15));
//            System.out.println(test3(45));

        System.out.println(test4(210));
        System.out.println(test4(3));
/*
        if(n < 0) {
            System.out.println("El numero debe ser positivo");
        }
        else
            System.out.println(n % 2 == 0);

    }*/
        }
        }