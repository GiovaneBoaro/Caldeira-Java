package Aula01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioMinimo = 1320;

        System.out.println("Digite o valor do seu salário: ");
        double salarioDigitado = scanner.nextDouble();

        int quantidadeDeSalariosMinimos = (int) (salarioDigitado / salarioMinimo);

        System.out.println("Você ganha " + quantidadeDeSalariosMinimos + " salário(s) mínimo(s).");

    }
}
