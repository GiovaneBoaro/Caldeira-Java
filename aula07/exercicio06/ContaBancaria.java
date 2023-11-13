package aula07.exercicio06;

public class ContaBancaria {
    //Criando atributo
    private double saldo;

    // Criando método construtor
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //Criando método de saque
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque!");
        }
    }
}
