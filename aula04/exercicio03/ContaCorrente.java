package Aula04.Exercicio03;

public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calculaTributos() {
        return saldo * 00.1;
    }
}
