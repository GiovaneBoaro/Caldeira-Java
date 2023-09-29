package aula05;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lista[] = new int[10];

        System.out.println("Tente acertar um dos 10 números sorteados! Digite um número de 1 a 100:");
        int entrada = scanner.nextInt();

        for(int cont = 0; cont < lista.length; cont++ ) {
            lista[cont] = 1 + random.nextInt(100); // Gera números aleatórios com limite de 100.
        }

        // forEach para procurar dentro do array comparando com a entrada do usuario no if.
        for(Integer n : lista) {
            if (entrada == n) {
                System.out.println("O número " +  entrada + " foi encontrado!");
                break;
            } else {
                System.out.println("Não foi dessa vez...");
            }
        }
    }
}
