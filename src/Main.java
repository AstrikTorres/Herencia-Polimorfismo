public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        // System.out.println(animal.comer());

        Perro canelo = new Perro();
        System.out.println(canelo.ladrar());
        System.out.println(canelo.comer());

        System.out.println("**************");

        Gato pulgas = new Gato();
        System.out.println(pulgas.comer());
    }

}
