package aula02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int num = scanner.nextInt();

        for(int cont1 = 2; cont1 <= num; cont1++) {
            boolean numeroPrimo = true;
            for(int cont2 = 2; cont2 < cont1; cont2++) {
                if(cont1 % cont2 == 0) {
                    numeroPrimo = false;
                }
            }
            if(numeroPrimo) {
                System.out.println(cont1);
            }
        }
    }
}
