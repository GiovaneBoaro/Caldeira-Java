package aula04.exercicio01;

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
