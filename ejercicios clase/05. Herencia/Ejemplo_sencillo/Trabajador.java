public class Trabajador{

String nombre;
String empresa;
double salario;

public Trabajador(String nombre, String empresa, double salario){
    this.nombre = nombre; 
    this.empresa = empresa;
    this.salario = salario;
}









public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getEmpresa() {
    return empresa;
}

public void setEmpresa(String empresa) {
    this.empresa = empresa;
}

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}


public String mostrar_info(){

    String info = "Nombre: " + nombre + " Empresa: " + empresa + " Salario: " + salario;
    
    return info;


}


public double calcular_sueldo_neto(){
    double sueldo_neto = salario - salario * 0.2;
    return sueldo_neto;


}









}