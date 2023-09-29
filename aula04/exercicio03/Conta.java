package aula04.exercicio03;

public class Conta {
    protected double saldo;

    public void getSaldo() {
        System.out.println("saldo: " + saldo);
    }

    public  double sacar(double valor) {
        return this.saldo = this.saldo - valor;
    }

    public double depositar(double valor) {
        return this.saldo = this.saldo + valor;
    }
}
