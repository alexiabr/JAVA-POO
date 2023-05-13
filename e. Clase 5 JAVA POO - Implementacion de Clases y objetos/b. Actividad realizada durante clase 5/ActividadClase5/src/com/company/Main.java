package com.company;

public class Main {
    public static void main(String[] args) {
        Cliente miCliente;
        miCliente = new Cliente(11, "Luciana"); // llamo al constructor para inicializar
        Cliente miCliente2 = new Cliente(22, "Alexia");
        miCliente.incrementarDeuda(1000.0);
        System.out.println(miCliente.toString());
        System.out.println(miCliente2.toString());

        // cliente 1 va  a pagar la deuda
        miCliente.pagarDeuda();
        System.out.println("Cliente luego de pagar deuda");
        System.out.println(miCliente.toString());
    }
}