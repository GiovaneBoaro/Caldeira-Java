package Aula04.Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class FormaGeometricaConsole {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Circulo(5));
        formas.add(new Retangulo(5,12));
        formas.add(new Triangulo(3,8));
        formas.add(new Quadrado(3));
        formas.add(new Losango(5,7));


        //for-each utilizando a declaração da variavel array
        for(FormaGeometrica forma : formas) {
            System.out.println("Área : " + forma.calcularArea());
        }
    }

}
