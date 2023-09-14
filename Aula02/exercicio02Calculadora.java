package Aula02;

public class exercicio02Calculadora {
    public double operacoes(double contas, double num1, double num2) {
        if (contas == 1) {
            double soma = num1 + num2;
            System.out.println("O resultado da soma é: " + soma);
        } else if( contas == 2) {
            double subtracao = num1 - num2;
            System.out.println("O resultado da soma é: " + subtracao);
        } else if (contas == 3) {
            double multiplicacao = num1 * num2;
            System.out.println("O resultado da soma é: " + multiplicacao);
        } else if( contas == 4) {
            double divisao = num1 / num2;
            System.out.println("O resultado da soma é: " + divisao);
        } else {
            System.out.println("Digite uma opçao válida!");
        }
        return contas;
    }


}
