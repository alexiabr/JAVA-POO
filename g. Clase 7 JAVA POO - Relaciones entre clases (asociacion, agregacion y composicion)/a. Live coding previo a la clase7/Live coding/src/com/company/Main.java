package com.company;

public class Main {
    public static void main(String[] args) {
        // aca creo el auto al momento de crear el chofer, ya se lo asigne
        Chofer nuevoChofer = new Chofer("Luciana", "Briones", new Auto("abc123", "Fiat", "500"));
        Auto auto2 = new Auto("ddd", "Marca", "3");
        Chofer choder2  = new Chofer("Maria", "Marta", auto2);
        // si yo necesito acceder a algo del auto, deberia tener un metodo como un get patente por ejemplo
        // el chofer necesita saber la patente del auto que tiene asignado y tiene un metodo verPatente,  pero ese metodo solo accede a el metodo en la clase auto que le va a permitir ver la patente.
        // tenemos el acceso desde la clase chofer pero la responsabilidad de mostrar la patente sigue siendo de auto
        System.out.println("La patente es " + nuevoChofer.verPatente());


    }
}