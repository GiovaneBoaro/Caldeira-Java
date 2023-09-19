package Aula03;

import java.time.LocalDateTime;

public class ContaBancaria {
    // Criando os atributos

    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    // declarar como String e iniciar com a formatação de hora (hh:mm:ss) e depois executar o formatDate na classe
    private String horarioAtual;

    // Criando os métodos construtores

    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
//        this.horarioAtual = horarioAtual;
    }

    //Criando getters e setters

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getBanco() {
        return banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSaldo(String identificadorConta) {
        return this.saldo;
    }

    public String getHorarioAtual() {
        return horarioAtual;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }


    public void setCpf(String novoCpf) {
        this.cpf = novoCpf;
    }

    public void setIdentificadorConta(String novoIdentificadorConta, String identificadorContaAtual) {
        if(this.identificadorConta == identificadorContaAtual) {
            this.identificadorConta = novoIdentificadorConta;
        } else {
            System.out.println("Senha incorreta!");
        }

    }

    public void setBanco(String novoBanco) {
        this.banco = novoBanco;
    }

    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void setHorarioAtual(String novoHorarioAtual) {
        this.horarioAtual = novoHorarioAtual;
    }

    // Criando o método toString

    public String toString() {
        String texto = "";
        texto = texto + "Nome do titular: " + this.nome + "\n";
        texto = texto + "CPF do titular: " + this.cpf + "\n";
        texto = texto + "Nome do banco: " + this.banco + "\n";
        return texto;
    }

    //Criando métodos especiais

    public void sacar(double valor) {
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void pix(double valor) {
        if(valor <= this.saldo)  {
            this.saldo = this.saldo - valor;
        }
    }

}
