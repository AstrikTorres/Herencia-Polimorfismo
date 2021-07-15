public class Prinicpal {

    public static void main(String[] args) {

        /*
         Animal animal = new Animal();
         System.out.println(animal.comer());
        */

        Perro canelo = new Perro("Canelo", 3);
        System.out.println(canelo.ladrar());
        System.out.println(canelo.comer());

        System.out.println("**************");

        Gato pulgas = new Gato("Bigotes", 2, "naranja");
        System.out.println(pulgas.comer());
        System.out.println(pulgas.dormir());
    }

}
