package aula07.exercicio06;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria(1500);

        try {
            cb.sacar(2000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Resposta inválida!");
        }

    }
}
