package aula01;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**************** Calculador de Fatorial ****************");
        System.out.println("Escreva um número inteiro não negativo: ");
        int fatorial = scanner.nextInt();

        int resultado = fatorial;

        while(fatorial > 1) {
            resultado = resultado * (fatorial - 1);
            fatorial--;
        }

        System.out.println("O resultado fatorial do número digitado é: " + resultado);
    }
}
