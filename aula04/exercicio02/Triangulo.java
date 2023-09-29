package Aula04.Exercicio02;

public class Triangulo extends FormaGeometrica{
    private double altura;
    private double base;


    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
