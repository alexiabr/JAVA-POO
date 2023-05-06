package com.company;

import java.util.Scanner;

public class Main {
   /* Ejercicio 1
    Hacer que una funcion que dado un numero indica si es un numero primoo no.
    Un numero primo es aquel que solo puede dividirse entre 1 y si mismo.
    Usar esta funcion en un programa que permita el ingreso de un numero
    y luego llame a la funcion desarrollada para comprobar si es primo o no. */

    public static boolean primeNumber(int number) {
       int i, count;
       count = 0;
        for (i =1; i  <= number; i++ ) {
            if(number % i == 0)
                count = count + 1;
        }
        if (count > 2)
            return false;
        else
            return true;
    }

   /* Ejercicio 2
    Escribir una funcion que reciba tres numeros y devuelva l maximo entre
    los tres numeros.

            Integer maximoEntreTres( Integer unNumeroA, Integer unNumeroB, Integer unNumeroC)

    Luego hacer un programa que permita el ingreso de 3 valores y muestre el resultado */

    public static int biggestOfTheThree( int num1, int num2, int num3) {
        if(num1 > num2 && num2 > num3)
            return num1;
        if(num2> num1 && num1> num3)
            return num2;
        else
            return num3;
    }

    /*Ejercicio 3
    Escribir una funcion:
    boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
    que debe tomr dos cadenas de texto y devolver true en caso de que sean distintas o false
    en caso de que coincidan */

    public static boolean cadenasDeTextosDistintas( String unTextoA, String unTextoB) {
        if (unTextoA.equals(unTextoB))
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        /* ejercicio 1 */
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean result;
        System.out.println("Ingrese un numero");
        number = scanner.nextInt();
        result = primeNumber(number);
        System.out.println("Es el numero ingresado primo? " + result);


        /* ejercicio 2 */
        int num1, num2, num3, resultado;
        System.out.println("Ingrese el primer numero");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = scanner.nextInt();
        resultado = biggestOfTheThree(num1,num2,num3);
        System.out.println("El numero mas grande es "+ resultado);

        /*ejercicio 3 */
        String unTextoA, unTextoB;
        boolean cadenas;
        scanner.nextLine(); // como el ultimo scanner ha sido sobre un numero, tengo que poner este para que agarre el enter del anterio y "me limpie el scanner"
        System.out.println("Ingrese el primer texto");
        unTextoA = scanner.nextLine();
        System.out.println("Ingrese el segundo texto");
        unTextoB = scanner.nextLine();
        cadenas = cadenasDeTextosDistintas(unTextoA, unTextoB);
        System.out.println("Son las cadenas distintas? "+ cadenas);
    }
}