public class Gato extends Animal {
    int num_bigotes;
    String  color;
    int vidasDisponibles = 7;

    @Override //Hace referencia a que se sobrescribe el metodo
    public String comer() {
        return "Comiendo atún";
    }

}
