package Aula03;

import java.util.Scanner;

public class ContaBancariaConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria cb = null;


        int opcao = -1;

        while(opcao != 0) {
            System.out.println("*********************************************************");
            System.out.println("O que você deseja fazer?");
            System.out.println("0 - Sair");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depósito via Pix");
            System.out.println("5 - Verificar saldo");
            System.out.println("6 - Verificar dados da conta");
            System.out.println("7 - Alterar titular");
            System.out.println("*********************************************************\n");
            opcao = Integer.parseInt(scanner.nextLine());


            if(opcao == 0) {
                System.out.println("Obrigado por utilizar o nosso sistema!");
            }else if(opcao == 1) {
                System.out.println("Digite o nome do titular:");
                String nome = scanner.nextLine();
                System.out.println("Digite o CPF do titular da conta:");
                String cpf = scanner.nextLine();
                System.out.println("Crie um código de 3 digitos como identificador da conta:");
                String identificadorConta = scanner.nextLine();
                System.out.println("Digite o nome do seu banco: ");
                String banco = scanner.nextLine();
                System.out.println("Digite o seu endereço: ");
                String endereco = scanner.nextLine();
                cb = new ContaBancaria(nome,cpf,identificadorConta,banco,endereco);
                System.out.println("Conta criada com sucesso!");
            } else if(opcao == 2) {
                System.out.println("Digite o valor a ser depositado: ");
                double valor = Double.parseDouble(scanner.nextLine());
                cb.depositar(valor);
            } else if(opcao == 3) {
                System.out.println("Digite o valor a ser sacado: ");
                double valor = Double.parseDouble(scanner.nextLine());
                cb.sacar(valor);
            } else if(opcao == 4) {
                System.out.println("Digite o horário atual: ");
//                String valorHora = scanner.nextLine();
//                cb.getHorarioAtual(valorHora);
                System.out.println("Digite o valor a ser transferido via PIX: ");
                double valor = Double.parseDouble(scanner.nextLine());
                cb.pix(valor);
            } else if (opcao == 5) {
                System.out.println("Por favor, confirme o seu identificador de conta:");
                String identificadorConta = scanner.nextLine();
                System.out.println("Saldo da conta: " + cb.getSaldo(identificadorConta));
            } else if(opcao == 6) {
                System.out.println(cb.toString());
            } else if(opcao == 7) {
                System.out.println("Digite o nome do novo titular: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o CPF do novo titular: ");
                String cpf = scanner.nextLine();
                cb.setNome(nome);
                cb.setCpf(cpf);
                cb.toString();
            } else {
                System.out.println("Opção inválida!");
            }

        }
    }
 }
