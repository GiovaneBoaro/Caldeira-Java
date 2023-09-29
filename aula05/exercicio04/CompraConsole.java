package aula05.exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class CompraConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Compra> lista = new ArrayList();

        boolean start = true;

        while(start) {
            System.out.println("***************************");
            System.out.println("Programa lista de compras");
            System.out.println("Digite o que você quer fazer: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Ver todas os itens");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 0 -> {
                    System.out.println("Fechando o programa...");
                    start = false;
                } case 1 -> {
                    Compra compra = new Compra();
                    System.out.println("Digite o nome do item: ");
                    compra.setNome(scanner.nextLine());

                    System.out.println("Digite a data de validade do item:");
                    compra.setDataDeValidade(scanner.nextLine());
                    lista.add(new Compra(compra.getNome(), compra.getDataDeValidade()));
                    System.out.println("Item adicionado com sucesso!");
                    System.out.println();
                } case 2 -> {
                    System.out.println("Qual item você deseja excluir? Escolha pelo índice");
                    int i = Integer.parseInt(scanner.nextLine());

                    try {
                        lista.remove(i - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Tarefa inválida!");
                    }
                    System.out.println();
                } case 3 -> {
                    System.out.println("Todas os itens adicionados: ");

                    for (Compra itensAdicionados : lista) {
                        System.out.println("Nome: " + itensAdicionados.getNome() + " | " + " Data de validade: " + itensAdicionados.getDataDeValidade());
                    }
                    System.out.println();
                } default -> {
                    System.out.println("Opção inválida");
                }
            }
        }
    }
}
