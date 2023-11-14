package aula08.exercicio03.src.main.java;

public class Calculadora {

    public double adicao(double n1, double n2) {
        return n1 + n2;
    }

    public double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    public double divisao(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Divisor não pode ser o número 0!");
        }
        return n1 / n2;
    }

    public double potencia(double n1, double n2){
        return Math.pow(n1, n2);
    }

    public double raizQuadrada(double n1) {
        if (n1 < 0) {
            System.out.println("Só é possível realizar o cálculo se o radicando for maior que 0.");
        }
        return Math.sqrt(n1);
    }

}
