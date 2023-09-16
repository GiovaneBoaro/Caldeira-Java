package Aula02;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************** Adivinhação de guerra **********************");
        System.out.println("Olá meus bravos soldados! Me chamo Leônidas e quero que tentem adivinhar quantos inimigos iremos enfrentar!");

        int opcao = 0;

        while (opcao < 3){
            System.out.println("Alguém tem algum palpite?");
            double inimigos = scanner.nextDouble();

            if (inimigos > 300000) {
                System.out.println("Um pouco menos!");
            } else if (inimigos < 300000) {
                System.out.println("Um pouco mais!");
            } else {
                System.out.println("Você acertou soldado!");
                break;
            }
            opcao++;
        }
    }
}
