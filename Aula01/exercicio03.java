package Aula01;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int media;

        System.out.println("Digite três números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if((num1 < num2) && (num1 < num3)) {
            menor = num1;
        } else if ((num2 < num1) && (num2 < num3)) {
            menor = num2;
        } else if ((num3 < num1) && (num3 < num2)) {
            menor = num3;
        }

        if((num1 > num2) && (num1 > num3)) {
            maior = num1;
        } else if ((num2 > num1) && (num2 > num3)) {
            maior = num2;
        } else if ((num3 > num1) && (num3 > num2)) {
            maior = num3;
        }

        media = (num1 + num2 + num3) / 3;

        System.out.println("Maior número: " + maior  + ", menor número: " + menor + ", média : " + media);
    }
}
