package aula01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma temperatura em graus Celcius: ");
        double temperaturaCelcius = scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelcius * 9 / 5) + 32;

        System.out.println("Sua temperatura convertida para Fahrenheit é: " + temperaturaFahrenheit + "ºF.");
    }
}
