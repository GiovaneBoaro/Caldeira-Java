package Aula01;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*********** Conversor de Dólar para Real ***********");
        System.out.println("Digite a quantia de dólares para ser convertida: ");
        double dolares = scanner.nextDouble();
        System.out.println("Digite a taxa de câmbio atual do dólar para o real: ");
        double taxaDeCambioDolar = scanner.nextDouble();

        double valorConvertido = dolares * taxaDeCambioDolar;

        System.out.println("O valor da conversão é:" + valorConvertido);

    }

}
