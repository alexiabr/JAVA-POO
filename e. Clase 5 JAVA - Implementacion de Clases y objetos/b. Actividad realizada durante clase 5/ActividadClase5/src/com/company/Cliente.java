package com.company;

public class Cliente {
    private String nombre;
    private Integer numeroCuenta;
    private Double saldo;

    //constructor: sirve para crear una instancia y asignar valores iniciales a los atributos
    // determino el estado inicial del cliente
    public Cliente(Integer numero, String nombre) {
        numeroCuenta = numero;
        this.nombre = nombre;
        this.saldo = 0.0; // en el constructor inicializo en cero porque quiero que todos los clientes arranquen con saldo = 0
    }
    // getters y setters

    public String getNombre() {
        return nombre;
    }
    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }
    public Double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

// metodos de la clase

    public void incrementarDeuda(Double valor) {
        saldo +=valor;
    }

    public void pagarDeuda() {
        saldo = 0.0;
    }
// es una forma de representar el Objeto como string
public String toString() {
        return "Nombre: "+ nombre + " numero de cuenta: "+numeroCuenta + " Saldo: " + saldo;
}


}
