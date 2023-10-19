package aula07.exercicio03;
import java.util.Scanner;

public class TratamentoDeErros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean start = true;

        while (start) {
            try {
                System.out.println("Digite o primeiro número inteiro:");
                num1 = scanner.nextInt();

                System.out.println("Digite o segundo número inteiro:");
                num2 = scanner.nextInt();
                start = false;
            } catch (Exception e) {
                scanner.next();
                System.out.println("Número não inteiro inserido, digite apenas números inteiros!");
                System.out.println();
            }

            if(!start) {
                System.out.println("Os números inteiros digitados foram: "
                        + num1 + " e " + num2 + ".");
            }
        }
    }
}
