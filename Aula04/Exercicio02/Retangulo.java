package Aula04.Exercicio02;

public class Retangulo extends FormaGeometrica{
    private double altura;
    private double base;

    public Retangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

}
