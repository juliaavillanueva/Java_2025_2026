import java.util.Random;

public class Arma {
    
    int municion;
    int daño;
    double probabilidad; 

    Arma(int municion, int daño, double probabilidad){

        this.municion = municion;
        this.daño = daño;
        this.probabilidad = probabilidad;
    }

    public boolean acertar_disparo(){

        Random rd = new Random();
        double aleatorio = rd.nextDouble();
        if (aleatorio < probabilidad){
            return true;
        }
        else{
            return false;
        }

    }
    public void herir(Personaje p){
        p.restar_vida(daño);
        municion = municion - 1;
    }
}
