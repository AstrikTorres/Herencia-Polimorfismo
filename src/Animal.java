public abstract class Animal {

    String nombre;
    int edad;

    // Constructor Padre
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract String comer();

    public String dormir() {
        return "Zzzzzzz";
    }
}
