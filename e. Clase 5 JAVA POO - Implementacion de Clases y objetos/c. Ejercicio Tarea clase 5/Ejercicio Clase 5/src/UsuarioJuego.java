public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje = 0.0;
    private int nivel = 0;

    // constructor

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }
    // getters

    public Double getPuntaje() {
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    // metodos

    public void aumentarPuntaje() {
        puntaje++;
    }

    public void subirNivel() {
        nivel++;
    }
    public void bonus(int valor) {
        puntaje += valor;
    }

    // funcion to String para mostrar todos los valores juntos
public String toString() {
        return "Nombre: " + nombre + ", nivel: " + nivel + ", puntaje " + puntaje;
}

}
