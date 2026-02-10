public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public void moverse() {
        System.out.println("El animal se mueve");
    }

class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre);
    }
    
    public void correr() {
        System.out.println("El perro está corriendo");
    }
    
    @Override
    public void hacerSonido() { 
        System.out.println("El perro ladra");
    }
    
    public void moverse() {
        super.moverse();
        System.out.println("El perro corre");
    }

    public String mostrarNombre() {
        return "El nombre del perro es: " + nombre;
    }
    



public class Main {
    public static void main(String[] args) {
        Animal miPerro1 = new Perro("Bobby");
        
        Perro miPerro2 = new Perro("Firulais");
        miPerro1.hacerSonido();
        miPerro2.correr();

    }
}




@Override
public String toString() {
    return "Perro []";
}
}
}