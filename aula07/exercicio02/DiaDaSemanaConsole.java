package aula07.exercicio02;

import java.util.Scanner;

public class DiaDaSemanaConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //entrada usuario
        System.out.println("Escreva o dia da semana: ");
        String entrada = scanner.nextLine();
        //transformar resposta em letra maiuscula
        String diaUp = entrada.toUpperCase();

        //procurar dentro do enum
        for(DiaDaSemana dia : DiaDaSemana.values()) {
            //comparar entrada do usuario com elementos do enum
            if(diaUp.equals(dia.name())) {
                System.out.println(dia.getMensagem());
            }
        }
    }
}
