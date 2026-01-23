public class Equipo {

    private Jugador[] jugadores;
    private int numJugadores;

    public Equipo(int capacidad) {
        jugadores = new Jugador[capacidad];
        numJugadores = 0;
    }

    // Inserta un jugador en la siguiente posición libre
    public boolean insertarJugador(Jugador jugador) {

        if (numJugadores == jugadores.length) {
            return false; // equipo completo
        }

        jugadores[numJugadores] = jugador;
        numJugadores++;
        return true;
    }

    // Muestra solo los jugadores válidos
    public void mostrarEquipo() {
        for (int i = 0; i < numJugadores; i++) {
            System.out.println(jugadores[i]);
        }
    }

    public boolean estaCompleto() {
        return numJugadores == jugadores.length;
    }

    public int getNumJugadores() {
        return numJugadores;
    }
}
