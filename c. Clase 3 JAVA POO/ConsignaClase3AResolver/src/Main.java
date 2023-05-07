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
    public static void main(String[] args) {

        quienGana();

    }
}

