package aula05;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lista = new int[5];
        int numeros = 0;
        int soma = 0;
        int media = 0;

        for(int cont = 0; cont < lista.length; cont++) {
            System.out.println("Digite o " + (++numeros) + " número");
            lista[cont] = scanner.nextInt();
        }

        System.out.println("Números digitados: ");

        for (int cont = 0; cont < lista.length; cont++) {
            System.out.println(lista[cont]);
        }

        for (Integer n : lista) {
            soma += n.intValue();
        }

        System.out.println("******************************");
        System.out.println("A soma é : " + soma);
        System.out.println("A média é : " + (soma/lista.length));
    }
}
