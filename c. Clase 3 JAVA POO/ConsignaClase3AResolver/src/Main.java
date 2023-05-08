import java.util.Scanner;

public class Main {
    /*desafio 1 */
    public static void quienGana () {
        Scanner scanner = new Scanner(System.in);
            String player1, player2, eleccionPlayer1, eleccionPlayer2;
            System.out.println("Ingrese su nombre jugador 1");
            player1 = scanner.nextLine();
            System.out.println("Ingrese su nombre jugador 2");
            player2 = scanner.nextLine();
            do {
            System.out.println("Eliga su jugada jugador 1:" +
                    "Piedra" +
                    "Papel" +
                    "Tijera");
            eleccionPlayer1 = scanner.nextLine();
            System.out.println("Eliga su jugada jugador 2:" +
                    "Piedra" +
                    "Papel" +
                    "Tijera");
            eleccionPlayer2 = scanner.nextLine();
            // empate
                if (eleccionPlayer1.equals(eleccionPlayer2) && !eleccionPlayer1.equals("*") && !eleccionPlayer2.equals("*"))
                    System.out.println("0");
                    // casos que gane el segundo jugador
                else if (eleccionPlayer1.equals("Piedra") && eleccionPlayer2.equals("Papel"))
                    System.out.println("2");
                else if (eleccionPlayer1.equals("Papel") && eleccionPlayer2.equals("Tijera"))
                    System.out.println("2");
                else if (eleccionPlayer1.equals("Tijera") && eleccionPlayer2.equals("Piedra"))
                    System.out.println("2");

                    // casos en que gana el primer jugador
                else if (eleccionPlayer1.equals("Papel") && eleccionPlayer2.equals("Piedra"))
                    System.out.println("1");
                else if (eleccionPlayer1.equals("Tijera") && eleccionPlayer2.equals("Papel"))
                    System.out.println("1");
                else if (eleccionPlayer1.equals("Piedra") && eleccionPlayer2.equals("Tijera"))
                    System.out.println("1");
        } while (!eleccionPlayer1.equals("*") || !eleccionPlayer2.equals("*"));

    }

// desafio 2 //
    public static void quienGanaConSpock () {
        Scanner scanner = new Scanner(System.in);
        String player1, player2, eleccionPlayer1, eleccionPlayer2;
        System.out.println("Ingrese su nombre jugador 1");
        player1 = scanner.nextLine();
        System.out.println("Ingrese su nombre jugador 2");
        player2 = scanner.nextLine();
        do {
            System.out.println("Eliga su jugada jugador 1:" +
                    " Piedra, " +
                    " Papel, " +
                    " Tijera," +
                    " Spock ");
            eleccionPlayer1 = scanner.nextLine();
            System.out.println("Eliga su jugada jugador 2:" +
                    " Piedra, " +
                    " Papel,  " +
                    " Tijera, o " +
                    " Spock ");
            eleccionPlayer2 = scanner.nextLine();
            // empate
            if (eleccionPlayer1.equals(eleccionPlayer2) && !eleccionPlayer1.equals("*") && !eleccionPlayer2.equals("*"))
                System.out.println("0");
                // casos que gane el segundo jugador
            else if (eleccionPlayer1.equals("Piedra") && eleccionPlayer2.equals("Papel"))
                System.out.println("2");
            else if (eleccionPlayer1.equals("Papel") && eleccionPlayer2.equals("Tijera"))
                System.out.println("2");
            else if (eleccionPlayer1.equals("Tijera") && eleccionPlayer2.equals("Piedra"))
                System.out.println("2");
            else if (eleccionPlayer1.equals("Spock") && eleccionPlayer2.equals("Papel"))
                System.out.println("2");
            else if (eleccionPlayer1.equals("Tijera") && eleccionPlayer2.equals("Spock"))
                System.out.println("2");
            else if (eleccionPlayer1.equals("Piedra") && eleccionPlayer2.equals("Spock"))
                System.out.println("2");

                // casos en que gana el primer jugador
            else if (eleccionPlayer1.equals("Papel") && eleccionPlayer2.equals("Piedra"))
                System.out.println("1");
            else if (eleccionPlayer1.equals("Tijera") && eleccionPlayer2.equals("Papel"))
                System.out.println("1");
            else if (eleccionPlayer1.equals("Piedra") && eleccionPlayer2.equals("Tijera"))
                System.out.println("1");
            else if (eleccionPlayer2.equals("Spock") && eleccionPlayer1.equals("Papel"))
                System.out.println("1");
            else if (eleccionPlayer2.equals("Tijera") && eleccionPlayer1.equals("Spock"))
                System.out.println("1");
            else if (eleccionPlayer2.equals("Piedra") && eleccionPlayer1.equals("Spock"))
                System.out.println("1");
        } while (!eleccionPlayer1.equals("*") || !eleccionPlayer2.equals("*"));

    }

    // desafio 3

    public static void nNumerosPrimos() {
        Scanner scanner = new Scanner(System.in);
        int numero, contadorPrimo, i;
        boolean esPrimo;
        System.out.println("Ingrese un numero");
        numero = scanner.nextInt();
        contadorPrimo = 0;
        i = 1;
        while (contadorPrimo < numero) {
            esPrimo = checkPrime(i);
            if (esPrimo == true) {
                System.out.println(i);
                contadorPrimo++;
            }
            i++;
        }
    }

    public static boolean checkPrime(int i) {
        int j, contadorDivisores;
        contadorDivisores = 0;
        for (j = 1; j <= i; j++) {
            if (i % j == 0) {
                contadorDivisores++;
            }
        }
        if (contadorDivisores <= 2) {
            return true;
        } else
            return false;
    }


    /*
    public static void nNumerosPrimos() {
        int numero,i, j, contadorDivisores, contadorPrimos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = scanner.nextInt();
        contadorDivisores = 0;
        contadorPrimos = 0;
        i = 1;
        while (contadorPrimos <= numero) {

            for(j = 1; j <= i; j++){
            if(i % j == 0) {
                contadorDivisores++;
            }
        }
        if (contadorDivisores <= 2) {
            System.out.println(i);
            contadorPrimos++;
        }
        i++;
        }
    }



    */

    // desafio 4

    public static double calcularSalario(int horas) {
        double salario;
        int horasExtras;
        if (horas <= 40) {
            salario = 875 * horas;
        } else {
            horasExtras = horas - 40;
            salario = 875 * 40 + (875*1.5)*horasExtras;
        }
        return salario;
    }

    public static void main(String[] args) {

        // quienGana();
        // quienGanaConSpock();
        //nNumerosPrimos();
        Scanner scanner = new Scanner(System.in);
        int horas;
        double resultado;
        System.out.println("Ingrese cuantas horas trabajo: ");
        horas = scanner.nextInt();
        resultado = calcularSalario(horas);
        System.out.println(" A julieta hay que pagarle " + resultado);
    }
}

