package Aula04.Exercicio01;

import Aula04.Exercicio01.Carro;

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
