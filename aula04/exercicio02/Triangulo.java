package aula04.exercicio02;

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
