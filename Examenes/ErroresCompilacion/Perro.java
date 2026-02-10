class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre); 
    }
    
    public void sonido() { 
        System.out.println("El perro ladra");
    }
    
    public void moverse() {
        super.moverse();
        System.out.println("El perro corre");
    }

    public String mostrarNombre() {
        return "El nombre del perro es: " + nombre;
    }
}