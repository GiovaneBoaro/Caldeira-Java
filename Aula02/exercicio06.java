package Aula02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto/palavra: ");
        String entrada = scanner.nextLine();

        // método reverse do StringBuilder retorna a String reversa.
        System.out.println(new StringBuilder(entrada).reverse());
    }
}
