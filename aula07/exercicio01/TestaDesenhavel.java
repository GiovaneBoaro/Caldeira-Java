package aula07.exercicio01;

public class TestaDesenhavel {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        System.out.println(circulo.desenhar());
        System.out.println();
        System.out.println(quadrado.desenhar());
    }

}
