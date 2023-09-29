package aula01;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] arg) {
        Calendar calendar = GregorianCalendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento: ");
        int anoDeNascimento = scanner.nextInt();

        int idade = anoAtual - anoDeNascimento;

        System.out.println("Sua idade é: " + idade + " anos.");
    }
}
