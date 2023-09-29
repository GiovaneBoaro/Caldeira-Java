package aula05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList lista = new ArrayList<>();

        boolean start = true;
        while(start) {
            System.out.println("***************************");
            System.out.println("Programa lista de tarefas");
            System.out.println("Digite o que você quer fazer: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Ver todas as tarefas");
            int opcao = Integer.parseInt(scanner.nextLine());

            int i;

            switch (opcao) {
                case 0 -> {
                    System.out.println("Obrigado por utilizar o programa!");
                    start = false;
                } case 1 -> {
                    System.out.println("Titulo da tarefa: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();

                    System.out.println("Data da tarefa: ");
                    String data = scanner.nextLine();

                    String tarefa = titulo + " | " + descricao + " | " + data;

                    lista.add(tarefa);
                    System.out.println(" Tarefa adicionada");
                } case 2 -> {
                    System.out.println("Qual tarefa você deseja excluir? Escolha pelo índice");
                    i = Integer.parseInt(scanner.nextLine());

                    try {
                        lista.remove(i - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Tarefa inválida!");
                    }
                } case 3 -> {
                    System.out.println("Todas as tarefas criadas: ");
                    int n = lista.size();
                    for (i = 0; i < n; i++) {
                        System.out.println(lista.get(i));
                    }

                } default -> {
                    System.out.println("Opção inválida");
                }
            }
        }
    }
}
