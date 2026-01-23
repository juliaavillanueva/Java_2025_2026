public class Jugador {

    private String nombre;
    private int dorsal;

    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    @Override
    public String toString() {
        return nombre + " (dorsal " + dorsal + ")";
    }
}
