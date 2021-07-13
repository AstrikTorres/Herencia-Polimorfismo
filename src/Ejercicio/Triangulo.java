package Ejercicio;

public class Triangulo extends FigurasGeometricas{

    float base;
    float altura;

    public float calcularArea() {
        area = (base * altura) / 2;
        return area;
    }

    //Constructor
    Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
}
