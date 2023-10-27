package aula07.exercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Insira a sua idade: ");
            int idade = scanner.nextInt();

            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException("A idade digitada deve ser maior que 0 e menor que 150.");
            } else {
                System.out.println("Você tem: " + idade + " anos.");
            }
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Resposta inválida!");
        }
    }
}
