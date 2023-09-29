package Aula01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while(opcao !=0) {
            System.out.println("*********************FILAS PRIORITÁRIAS*********************");
            System.out.println("Digite o número correspondente a sua classificação: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Gestante");
            System.out.println("2 - Idoso(a)");
            System.out.println("3 - PCD (Pessoa com deficiência)");
            System.out.println("4 - Nenhuma das alternativas");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 0:
                    System.out.println("Até mais e obrigado por utilizar o programa!");
                    break;
                case 1:
                    System.out.println("Você tem direito de entrar na fila prioritária!");
                    break;
                case 2:
                    System.out.println("Você tem direito de entrar na fila prioritária!");
                    break;
                case 3:
                    System.out.println("Você tem direito de entrar na fila prioritária!");
                    break;
                case 4:
                    System.out.println("Você não tem direito de entrar na fila prioritária.");
                    break;
                default:
                    break;
            }
            break;
        }
    }
}

