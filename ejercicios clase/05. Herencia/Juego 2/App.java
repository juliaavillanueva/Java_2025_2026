

public class App {
    public static void main(String args[]){


        Arma a1 = new Arma(200, 20, 1);
        Personaje p1 = new Personaje_Hackeado("Lucas", a1 ,100, true);


        Arma a2 = new Arma(200, 30, 0.5);
        Personaje p2 = new Personaje("Dani", a2,200);

        p1.disparar(p2);

        p1.disparar(p2);

        p1.mostrar_info();
        p2.mostrar_info();







    }
    
}
