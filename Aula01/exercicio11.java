package Aula01;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase e o programa irá contar as vogais: ");
        String contagem = scanner.nextLine();

        contagem = contagem.toLowerCase();
        int totalDeVogais = 0;

        for(int cont = 0; cont < contagem.length(); cont++) {
            char vogal = contagem.charAt(cont);
            if(vogal == 'a' || vogal == 'e' || vogal == 'i' ||vogal == 'o' || vogal == 'u'){
                totalDeVogais++;
            }
        }

        System.out.println("O total de vogais na sua palavra ou frase é: " + totalDeVogais);
    }
}
