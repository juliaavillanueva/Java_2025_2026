public class Main {

    public static void main(String[] args) {

        Equipo equipo = new Equipo(3);

        equipo.insertarJugador(new Jugador("Lucas", 10));
        equipo.insertarJugador(new Jugador("Carlos", 7));
        equipo.insertarJugador(new Jugador("Mario", 1));

        if (!equipo.insertarJugador(new Jugador("Pepe", 5))) {
            System.out.println("No se puede insertar: equipo completo");
        }

        System.out.println("Jugadores del equipo:");
        equipo.mostrarEquipo();
    }
}
