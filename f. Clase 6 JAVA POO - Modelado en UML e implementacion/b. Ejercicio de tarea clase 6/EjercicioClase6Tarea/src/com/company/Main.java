package com.company;

public class Main {
    public static void main(String[] args) {
        // probando dos constructores diferentes
        Perro miPerro1 = new Perro("Luna", "Boxer", 3.0);
        Perro miPerro2 = new Perro("Prim", "Caniche", 2013, 6.0, true, false);

        // probando metodo para calcular edad
        System.out.println(miPerro2.edadPerro());

        // probando metodo para ver si se puede adoptar (tiene que dar false porque esta lastimado)
        System.out.println(miPerro2.puedeAdoptarse());

        // probar curar al perro con el setter, ahora se deberia poder adoptar
        miPerro2.setEstaSaludable();
        System.out.println(miPerro2.puedeAdoptarse());

        // probar si puede perderse, tiene que dar falso
        System.out.println(miPerro2.puedePerderse());

        // probando el metodo ToString
        System.out.println(miPerro2.toString());
    }
}