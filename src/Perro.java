public class Perro extends Animal implements Cuidados {

    String raza = "";
    String color = "";
    float peso = 0;

    //Constructor
    public Perro (String nombre, int edad) {
        super(nombre, edad);
    }

    public String ladrar() {
        return "Woof";
    }

    @Override
    public String comer() {
        return "Comiendo croquetas";
    }

    @Override
    public String irAlVeterinario() {
        return "Perro saludable";
    }

    @Override
    public String paseo() {
        return "Paseo en el parque";
    }

    @Override
    public String banarse() {
        return "Perro limpio";
    }
}
