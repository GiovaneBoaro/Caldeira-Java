package aula05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList lista = new ArrayList<>();
    int opcao = -1;

        while(opcao != 0) {
            System.out.println("***************************");
            System.out.println("Programa para lista de tarefas");
            System.out.println("Digite o que você quer fazer: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Definir nome para a lista");
            System.out.println("2 - Adicionar tarefa");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Ver todas as tarefas");
            opcao = Integer.parseInt(scanner.nextLine());

            int i;

            switch (opcao) {
                case 0:
                    System.out.println("Obrigado por utilizar o programa!");
                    break;
                case 1:
                    System.out.println("Digite o nome da lista: ");
                    String nomeLista = scanner.nextLine();
                    System.out.println("Lista " + nomeLista + " definido(a) com sucesso!");
                    break;
                case 2:
                    System.out.println("Qual a tarefa?");
                    String tarefa = scanner.nextLine();
                    lista.add(tarefa);
                    System.out.println(tarefa + " adicionado(a)");
                    break;
                case 3:
                    System.out.println("Qual tarefa você deseja excluir?");
                    i = Integer.parseInt(scanner.nextLine());

                    try {
                        lista.remove(i);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Tarefa inválida!");
                    }
                    break;
                case 4:
                    System.out.println("Todas as tarefas criadas: ");
                    int n = lista.size();
                    for(i = 0; i < n; i++) {
                        System.out.println(lista.get(i));
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
