package aula04.exercicio03;

public class GerenciadorDeImpostoDeRenda {
    private double somaTotalDosTributos = 0;

    public void getSomaTotalDosTributos() {
        System.out.println("Soma dos tributos: " + somaTotalDosTributos);
    }

    public void adicionar(Tributavel tributavel) {
        this.somaTotalDosTributos = this.somaTotalDosTributos + tributavel.calculaTributos();
    }

}
