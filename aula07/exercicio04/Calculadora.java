package aula07.exercicio04;

public class Calculadora implements Calculavel{

    @Override
    public double adicionar(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplicar (double num1, double num2){
        return num1 * num2;
    }

    @Override
    public double dividir(double num1, double num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("Não é possível realizar divisão por zero!");
        }
        return num1 / num2;
    }
}
