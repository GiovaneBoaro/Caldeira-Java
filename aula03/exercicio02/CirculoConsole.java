package aula03.exercicio02;

import java.util.Scanner;

public class CirculoConsole {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circulo circulo1 = new Circulo(1);
        System.out.println("Informe o raio do circulo: ");
        circulo1.setRaio(Double.parseDouble(scanner.nextLine()));
        System.out.println(circulo1.toString());

        Circulo circulo2 = new Circulo(2);
        System.out.println("Informe o raio do circulo: ");
        circulo2.setRaio(Double.parseDouble(scanner.nextLine()));
        System.out.println(circulo2.toString());


        System.out.println(circulo1.equals(circulo2));
    }
}
