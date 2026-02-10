import java.util.Scanner;

// Clase base (superclase)
abstract class Animal {
    protected String nombre;  
    
    // Constructor added
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    // Método mal definido (debe ser abstract)
    public abstract void hacerSonido();
    
    public void moverse() {
        System.out.println("El animal se está moviendo");
    }
}

// Subclase
class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre); // Se pasa el parámetro nombre al constructor de la superclase
    }
    
    @Override
    public void hacerSonido() { 
        System.out.println("El perro ladra");
    }
    
    public void moverse() {
        super.moverse();
        System.out.println("El perro corre");
    }

    public void mostrarNombre() {
        System.out.println("El nombre del perro es: " + nombre); // Error: nombre es privado en la superclase
    }
    
// Falta cerrar la llave de la clase

// Clase principal con errores
public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro("Bobby"); // Se utiliza la subclase Perro para instanciar
        
        Perro miPerro = new Perro("Firulais");
        miPerro.hacerSonido();

        Scanner scanner = new Scanner(System.in); 
        System.out.println("Introduce un nombre para el perro"); 
        String nuevoNombre = scanner.nextLine();
        miPerro.mostrarNombre(); 
    }
}
}

