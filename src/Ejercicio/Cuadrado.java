package Ejercicio;

public class Cuadrado extends FigurasGeometricas{

    float lado;

    public float calcularArea() {
        area = lado*lado;
        return area;
    }

    //Constructor
    Cuadrado(float lado) {
        this.lado = lado;
    }
}
