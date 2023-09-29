package Aula01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora atual: ");
        int hora = scanner.nextInt();
        System.out.println("Digite o minuto atual: ");
        int minuto = scanner.nextInt();
        System.out.println("Digite o segundo atual: ");
        int segundo = scanner.nextInt();

        int segundosDesdeAMeiaNoite = hora * 3600 + minuto * 60 + segundo;
        int segundosQueFaltamParaAMeiaNoite = 24 * 3600 - segundosDesdeAMeiaNoite;

        System.out.println("Segundos restantes até chegar o próximo horário de meia noite: " + segundosQueFaltamParaAMeiaNoite);
        System.out.println(("Segundos desde o horário da útilma meia noite: " + segundosDesdeAMeiaNoite));

    }
}
