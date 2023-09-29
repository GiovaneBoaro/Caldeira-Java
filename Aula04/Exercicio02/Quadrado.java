package Aula04.Exercicio02;

public class Quadrado extends FormaGeometrica{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
