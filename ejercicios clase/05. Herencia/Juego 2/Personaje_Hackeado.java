public class Personaje_Hackeado extends Personaje {


    boolean trucos;
    Personaje_Hackeado(String nombre, Arma arma, int vida, boolean trucos){
        super(nombre, arma, vida);
        this.trucos = trucos;

    }




    @Override
    public void disparar(Personaje p){
        super.disparar(p);
        if (trucos){
       recuperar_vida();
        }

    }

    public void recuperar_vida(){
        vida += 10;
    }





    
}
