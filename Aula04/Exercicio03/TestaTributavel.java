package Aula04.Exercicio03;

public class TestaTributavel{
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        GerenciadorDeImpostoDeRenda gerenciadorDeImpostoDeRenda = new GerenciadorDeImpostoDeRenda();

        System.out.println("*************************************");
        System.out.println("Conta Poupança");
        System.out.println("Sem tributos");
        contaPoupanca.depositar(5000);
        contaPoupanca.sacar(2000);
        contaPoupanca.calculaTributos();
        contaPoupanca.getSaldo();

        System.out.println("*************************************");
        System.out.println("Conta Corrente");
        System.out.println("Tributo de 1% sobre o saldo da conta.");
        contaCorrente.depositar(7000);
        contaCorrente.sacar(6000);
        contaCorrente.calculaTributos();
        contaCorrente.getSaldo();

        System.out.println("*************************************");
        System.out.println("Seguro de vida");
        System.out.println("Tributo fixo de R$42,00");
        seguroDeVida.calculaTributos();

        System.out.println("*************************************");
        System.out.println("Gerenciador de seguros");
        gerenciadorDeImpostoDeRenda.adicionar(contaCorrente);
        gerenciadorDeImpostoDeRenda.adicionar(contaPoupanca);
        gerenciadorDeImpostoDeRenda.adicionar(seguroDeVida);
        gerenciadorDeImpostoDeRenda.getSomaTotalDosTributos();

    }
}
