package aula05.exercicio06;

import java.util.LinkedList;
import java.util.Scanner;

public class ReservaConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Reserva> lista = new LinkedList<>();
        boolean start = true;

        while(start) {
            System.out.println("********* Reserva de passagens de avião *********");
            System.out.println("Digite o que você quer fazer:");
            System.out.println("0 - Sair");
            System.out.println("1 - Reservar passagem");
            System.out.println("2 - Cancelar reserva");
            System.out.println("3 - Ver lista de reservas");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch(opcao) {
                case 0 -> {
                    System.out.println("Fechando o programa...");
                    start = false;
                } case 1 -> {
                    Reserva reserva = new Reserva();
                    System.out.println("Digite o nome da reserva:");
                    reserva.setNome(scanner.nextLine());

                    System.out.println("Digite o local de destino: ");
                    reserva.setLocal(scanner.nextLine());

                    System.out.println("Digite o seu cpf: ");
                    reserva.setCpf(scanner.nextLine());

                    System.out.println("Qual a data de entrada?");
                    reserva.setDataDeEntrada(scanner.nextLine());

                    System.out.println("Qual a data de saída?");
                    reserva.setDataDeSaida(scanner.nextLine());

                    lista.add(reserva);
                    System.out.println("Reserva efetuada com sucesso!");
                    System.out.println();
                } case 2 -> {
                    System.out.println("Reservas efetuadas até o momento: ");

                    for(Reserva reservasFeitas : lista) {
                        System.out.println("Nome: " + reservasFeitas.getNome() + " | " + "Local de destino: " + reservasFeitas.getLocal() + " | " +
                                "Início: " + reservasFeitas.getDataDeEntrada() + " - " + "Saída: " + reservasFeitas.getDataDeSaida());
                    }

                    System.out.println();
                    System.out.println("Qual você deseja cancelar? Escolha pelo índice");
                    int i = Integer.parseInt(scanner.nextLine());

                    try {
                        lista.remove(i - 1);
                        System.out.println("Reserva cancelada com sucesso!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Tarefa inválida!");
                    }

                    System.out.println();
                } case 3 -> {
                    for(Reserva reservasFeitas2 : lista) {
                        System.out.println("Nome: " + reservasFeitas2.getNome() + " | " + "Local de destino: " + reservasFeitas2.getLocal() + " | " +
                                "Entrada: " + reservasFeitas2.getDataDeEntrada() + " - " + "Saída: " + reservasFeitas2.getDataDeSaida());
                        System.out.println();
                    }
                }default ->
                        System.out.println("Opção inválida!");
            }
        }
    }
}
