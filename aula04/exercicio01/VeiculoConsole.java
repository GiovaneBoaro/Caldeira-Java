package aula04.exercicio01;

import aula04.exercicio01.Carro;

public class VeiculoConsole {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.calcularCustoViagem();

        carro.imprimir();

        System.out.println(" ******************************************** ");

        Moto moto = new Moto();
        moto.calcularCustoViagem();

        moto.imprimir();

    }
}
