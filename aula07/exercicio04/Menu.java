package aula07.exercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        boolean start = true;

        while (start) {
            try {
                System.out.println();
                System.out.println("****************** Operações matemáticas ******************");
                System.out.println("Digite a operação desejada:");
                System.out.println("1 - " + Operacoes.ADICAO);
                System.out.println("2 - " + Operacoes.SUBTRACAO);
                System.out.println("3 - " + Operacoes.MULTIPLICACAO);
                System.out.println("4 - " + Operacoes.DIVISAO);
                System.out.println("0 - Sair");
                int opcao = scanner.nextInt();

                if (opcao == 0) {
                    System.out.println("Fechando o programa...");
                    start = false;
                } else {
                    System.out.println("Digite o primeiro número: ");
                    int num1 = scanner.nextInt();

                    System.out.println("Digite o segundo número: ");
                    int num2 = scanner.nextInt();

                    switch (opcao) {
                        case 1 -> System.out.println("Resultado da soma: " + calculadora.adicionar(num1, num2));
                        case 2 -> System.out.println("Resultado da subtração: " + calculadora.subtrair(num1, num2));
                        case 3 -> System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(num1, num2));
                        case 4 -> System.out.println("Resultado da divisão: " + calculadora.dividir(num1, num2));
                        default -> System.out.println("Operação inválida!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Apenas números inteiros.");
            }
        }
    }
}
