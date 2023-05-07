import java.util.Scanner;

public class Main {
    public static int calcularPaquetes(int cant) {
        // hay que agregar un scanner en cada lugar que se necesite
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double pesoPaquetesAcumulado;
        double pesoPaquetendividual;
        System.out.println("Ingrese peso paquete");
        pesoPaquetendividual = scanner.nextDouble();
        pesoPaquetesAcumulado = pesoPaquetendividual;
        contador++;
        while(pesoPaquetesAcumulado < cant) {
            System.out.println("Ingrese peso paquete");
            pesoPaquetendividual = scanner.nextDouble();
            pesoPaquetesAcumulado += pesoPaquetendividual;
            contador++;
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int cantidad;
        int cantidadPaquetes;
        System.out.println("Ingrese el nombre del perro");
        nombre = scanner.nextLine();
        System.out.println("peso diario de alimento");
        cantidad = scanner.nextInt();
        cantidadPaquetes = calcularPaquetes(cantidad);
        System.out.println("Se necesitan " + cantidadPaquetes + " paquetes para alimentar a " + nombre);
    }
}