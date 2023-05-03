import java.util.Scanner;

public class Main {

    public static String ingresarFechaNacimiento() {
        int dia, mes, anio;
        Scanner scanner = new Scanner(System.in); // al scanner hay que definirlo cada vez que lo vayamos a usar
        System.out.println("Ingrese su dia de nacimiento");
        dia = scanner.nextInt(); // los parentesis me indican que es un metodo de scaner para ingresar enteros
        System.out.println("Ingrese su mes de naciminto");
        mes = scanner.nextInt();
        System.out.println("Ingrese su anio de naciminto");
        anio = scanner.nextInt();
        return dia + "/" + mes + "/" + anio;

    }

    // puedo generar funciones que no retornen nada
    public static void mostrarResultado(String iniciales, String fecha) {
        System.out.println(iniciales + " fecha de naciminto: " + fecha); // es un proceso/ procedimiento
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // la clase es scaneer, pero lo que yo uso es un objeto de la clase scanner, que sabe hacer todo lo que le dicta la clase
        String nombre, apellido, fecha;
        String iniciales;
        int valor;
        System.out.println("Ingrese valor");
        valor= scanner.nextInt(); // si pongo que se ingrese un valor, pongo un numero y le doy enter. Ese enter  no es un numero, entonces lo agarra la variable nombre y se imprime vacio
        scanner.nextLine(); // si yo quiero evitar que se guarde ese enter en nombre, lo que hago con esta linea es limpiar, hago una lectura de ese caracter para que no lo agarre nombre
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = scanner.nextLine();
        // dos formas de obtener las iniciales y que se almacenen en una sola variable
       //  iniciales = ""+ nombre.charAt(0) + apellido.charAt(0); // da error sin las comillas porque java es un lenguaje fuertemente tipado. Cuando uso el metodo de string para seleccionar un caracer, empiezo a trabajar con char, y por eso no tolera que hayan dos char juntos. Al poner las comillas lo que estamos haciendo es forzozamente convertir los char que le siguen en cadena, el que hace la magia de la conversion es el +
       /* aca directamente obtengo strings en vez de char */
        iniciales = nombre.substring(0, 1) + apellido.substring(0, 1);
        fecha = ingresarFechaNacimiento();

        mostrarResultado(iniciales, fecha);
// si yo quiero que cualquier dato se convierta a texto con concatenarlo con corchetes vacios y el +, ya hago la magia




    }
}