package aula02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto/palavra: ");
        String entrada = scanner.nextLine();

        // método reverse do StringBuilder retorna a String reversa.
        System.out.println(new StringBuilder(entrada).reverse());
    }
}
