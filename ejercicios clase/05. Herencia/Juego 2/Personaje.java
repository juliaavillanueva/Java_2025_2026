

public class Personaje {
    
    int vida;
    Arma arma;
    String nombre;
    
    Personaje(String nombre, Arma arma, int vida){
        this.nombre = nombre;
        this.vida = vida;
        this.arma = arma;
    }

    public void disparar(Personaje p){

        if (arma.acertar_disparo()){
            System.out.println("Disparanado!!!!");
            arma.herir(p);
        }
        
    }


    public void restar_vida(int daño)
    {
        vida -= daño;
    }
   

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    

    public void mostrar_info(){

        System.out.println("Nombre: "+ nombre + " Vida: " + vida);


    }
}
