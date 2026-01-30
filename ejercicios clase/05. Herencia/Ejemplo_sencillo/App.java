public class App{

public static void main (String args[]){



    Trabajador t1 = new Trabajador("Lucas", "ICAI", 10000.2);
    // System.out.println(t1.mostrar_info());

    Directivo d1 = new Directivo("Manolo", "INDRA", 10000.2, 200.6);
    // System.out.println(d1.mostrar_info());

    Directivo d2 = new Directivo("Pepito", "BBVA", 2000000.3, 2004.7);

    Trabajador[] trabajadores = new Trabajador[3];

    trabajadores[0] = t1;
    trabajadores[1] = d1;
    trabajadores[2] = d2;

    for (Trabajador t:trabajadores){
        System.out.println(t.mostrar_info());
    }







}
    
}