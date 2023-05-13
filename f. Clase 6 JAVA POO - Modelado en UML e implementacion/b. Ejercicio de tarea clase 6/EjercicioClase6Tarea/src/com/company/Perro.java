package com.company;

public class Perro {
    private String nombrePila;
    private String raza;
    private boolean adopcion;
    private int anioAproxNacimiento;
    private double peso;
    private boolean chip;
    private boolean estaSaludable;

    // constructor 1

    public Perro (String nombre, String raza, double peso) {
        nombrePila = nombre;
        this.raza = raza;
        this.peso = peso;
    }

    // constructor 2
    public Perro (String nombrePila, String raza, int anioAproxNacimiento, double peso, boolean chip, boolean estaSaludable) {
        this.nombrePila = nombrePila;
        this.raza = raza;
        this.anioAproxNacimiento = anioAproxNacimiento;
        this.peso = peso;
        this.chip = chip;
        this.estaSaludable = estaSaludable;
        this.adopcion = false;
    }
    // setter

    public void setEstaSaludable() {
        estaSaludable = true;
    }

    // metodos

    public int edadPerro() {
        return 2023 - anioAproxNacimiento;
    }
    public boolean puedePerderse() {
        if (chip == true)
            return false;
        else
            return true;
    }

    public boolean puedeAdoptarse() {
        if(estaSaludable == true && peso > 5.0)
            adopcion = true;

        return adopcion;
    }

    public String toString() {
        return "Nombre: " + nombrePila + ", edad: " + edadPerro() + ", raza: " + raza + ", puede perderse?: " + puedePerderse() + ", esta en adopcion? " + puedeAdoptarse();
    }
}
