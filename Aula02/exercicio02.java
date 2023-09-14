package Aula02;

import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args) {
        exercicio02Calculadora calc = new exercicio02Calculadora();
        Scanner scanner = new Scanner(System.in);
        char userInput;

        do {
            System.out.println(" ********* Calculadora de dois números ********** ");

            System.out.println("Escolha qual operaçao voce deseja utilizar: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtraçao");
            System.out.println("3 - Multiplicaçao");
            System.out.println("4 - Divisao");
            double contas = scanner.nextDouble();

            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            calc.operacoes(contas, num1, num2);

            System.out.println("Calcular novamente? (s/n)");
            userInput = scanner.next().toLowerCase().charAt(0);

        } while (userInput != 'n');
    }
}
