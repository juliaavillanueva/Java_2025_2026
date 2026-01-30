public class Directivo extends Trabajador{

double bonus;



public Directivo(String nombre, String empresa, double salario, double bonus){
    super(nombre, empresa, salario);
    this.bonus = bonus;
}

@Override
public String mostrar_info(){

    String info = super.mostrar_info() + " Bonus: " + bonus;
    return info;
}


public double calcular_sueldo_neto(){


    double sueldo_neto = super.calcular_sueldo_neto() + bonus;
    return sueldo_neto;
}

public double getBonus() {
    return bonus;
}

public void setBonus(double bonus) {
    this.bonus = bonus;
}



}