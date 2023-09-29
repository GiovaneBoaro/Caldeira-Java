package Aula01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar!");
        } else if (idade == 16 || idade == 17 || idade > 65) {
            System.out.println("Seu voto é facultativo!");
        } else {
            System.out.println("Seu voto é obrigatório!");
        }
    }
}
