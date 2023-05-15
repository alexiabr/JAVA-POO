package com.company;

public class Pedido {
    private String fecha;
    private int codigo = 1;
    private Cliente cliente;

    public Pedido(String fecha, int codigo, Cliente cliente) {
        this.fecha = fecha;
        this.codigo = codigo;
        codigo++;
        this.cliente = cliente;
    }
}
