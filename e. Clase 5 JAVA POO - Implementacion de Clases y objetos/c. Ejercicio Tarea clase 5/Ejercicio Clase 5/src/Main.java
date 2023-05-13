public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuario1 = new UsuarioJuego("Luciana", "hola123");
        System.out.println(usuario1.toString());

        // probando aumentar nivel
        usuario1.subirNivel();
        System.out.println(usuario1.toString());

        // probando subir puntaje
        usuario1.aumentarPuntaje();
        System.out.println(usuario1.toString());

        // probando agregar un bonus al puntaje
        usuario1.bonus(10);
        System.out.println(usuario1.toString());

        // probando getters
        System.out.println(usuario1.getNivel());
        System.out.println(usuario1.getPuntaje());
    }
}