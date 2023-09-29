package Aula03.Exercicio01;

import Aula03.Exercicio01.ContaBancaria;

import java.util.Scanner;
import java.util.Date;
public class ContaBancariaConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date dataHoraAtual = new Date();
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
            System.out.println("5 - Transferência: ");
            System.out.println("6 - Verificar saldo");
            System.out.println("7 - Verificar dados da conta");
            System.out.println("8 - verificar horário");
            System.out.println("9 - Alterar titular");
            System.out.println("10 - Alterar endereço");
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
                String horarioAtual = String.valueOf(dataHoraAtual);
                cb = new ContaBancaria(nome,cpf,identificadorConta,banco,endereco, horarioAtual);
                System.out.println("Conta criada com sucesso!");
            } else if(opcao == 2 && cb != null) {
                System.out.println("Digite o valor a ser depositado: ");
                double valor = Double.parseDouble(scanner.nextLine());
                cb.depositar(valor);
            } else if(opcao == 3 && cb != null) {
                System.out.println("Digite o valor a ser sacado: ");
                double valor = Double.parseDouble(scanner.nextLine());
                cb.sacar(valor);
            } else if(opcao == 4 && cb != null) {
                System.out.println("Digite o valor a ser transferido via PIX: ");
                double valor = Double.parseDouble(scanner.nextLine());
                cb.pix(valor);
            } else if (opcao == 5 && cb != null) {
                System.out.println("Informe o identificador da Conta Bancária de destino: ");
                String conta = scanner.nextLine();
                System.out.println("Informe o valor a ser transferido: ");
                double valor = Double.parseDouble(scanner.nextLine());
                cb.transferencia(valor);
                System.out.println("Transferencia de " + valor + "para a conta " + conta);
            } else if(opcao == 6 && cb != null) {
                System.out.println("Por favor, confirme o seu identificador de conta:");
                String identificadorConta = scanner.nextLine();
                System.out.println("Saldo da conta: " + cb.getSaldo(identificadorConta));
            } else if(opcao == 7) {
                System.out.println(cb.toString());
            } else if( opcao == 8) {
                System.out.println("horário e data atual: " + dataHoraAtual);
            } else if(opcao == 9 && cb != null) {
                System.out.println("Digite o nome do novo titular: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o CPF do novo titular: ");
                String cpf = scanner.nextLine();
                cb.setNome(nome);
                cb.setCpf(cpf);
                cb.toString();
            } else if(opcao == 10 && cb != null) {
                System.out.println("Digite o novo endereço: ");
                String endereco = scanner.nextLine();
                cb.setEndereco(endereco);
                cb.toString();
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
 }
