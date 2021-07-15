public class Gato extends Animal implements Mascota, Cuidados {
    int num_bigotes;
    String  color;
    int vidasDisponibles = 7;

    // Constructor
    public Gato(String nombre, int edad, String color) {
        super(nombre, edad); //Se hace referencia al constructor padre
        this.color = color;
    }

    @Override //Hace referencia a que se sobrescribe el metodo
    public String comer() {
        return "Comiendo atún";
    }

    @Override
    public String trucos() {
        return "Caer de pie";
    }

    @Override
    public String premios() {
        return "Caja";
    }

    @Override
    public String jugar() {
        return "Jugar con el laser";
    }

    @Override
    public String irAlVeterinario() {
        return "Gato limpio";
    }

    @Override
    public String paseo() {
        return "Paseo en la azotea";
    }

    @Override
    public String banarse() {
        return "Gato molesto";
    }
}
