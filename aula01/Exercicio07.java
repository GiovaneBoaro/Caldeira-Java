package aula01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************Empresa de consórcio*************");
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        if (idade < 18 || salario < 2000) {
            System.out.println("Você só pode comprar um automóvel se for de maior e ganhar uma renda mensal maior" +
                    " que R$2.000 reais.");
        } else {
            System.out.println("Compra autorizada.");
        }

    }

}
