package Ejercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Crea una clase padre FigurasGeometricas con un método calcular área.
        Escribir 3 clases hijos que hereden de figuras geométricas,
        definir los atributos y métodos necesarios para calcular el área,
        y al final crear objetos de esas 3 clases que sean capaces
        de calcular las respectivas areas
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el tamaño de los lados de tu cuadrado");
        float lado = leer.nextFloat();
        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println(cuadrado.calcularArea());

        System.out.println("Ingresa el radio de circulo");
        float radio = leer.nextFloat() ;
        Circulo circulo = new Circulo(radio);
        System.out.println(circulo.calcularArea());

        System.out.println("Ingresa la base y altura");
        float base = leer.nextFloat();
        float altura = leer.nextFloat();
        Triangulo triangulo = new Triangulo(base, altura);
        System.out.println(triangulo.calcularArea());
        leer.close();
    }

}
