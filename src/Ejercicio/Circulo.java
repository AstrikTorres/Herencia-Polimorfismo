package Ejercicio;

public class Circulo  extends FigurasGeometricas{

    float radio;
    float pi = 3.1416f;

    public float calcularArea() {
        area = pi * (radio*radio);
        return area;
    }

    //Constructor
    Circulo(float radio) {
        this.radio = radio;
    }
}
