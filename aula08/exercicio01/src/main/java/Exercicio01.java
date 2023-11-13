package aula08.exercicio01.src.main.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio01 {
    public static void main(String[] args) {
        //Lista com os nomes
        List<String> nomes = Arrays.asList("Fulano", "Ciclana", "Beltraninho", "Fulano", "Ciclana", "Deltrano",
                "Deltrano", "Fulano", "Zezé", "Beltraninho", "Deltrano", "Fulano", "Fulano","Ciclana", "Zezé", "Juca");

        // Contar o número total de strings na lista
        System.out.println("Número de nomes na lista:" + nomes.stream().count());
        System.out.println();

        // Encontrar a string mais longa da lista
        System.out.println("Nome mais longo: " + nomes.stream().max(Comparator.comparing(String::length)).orElse(null));
        System.out.println();

        // Contar quantas vezes cada String aparece na lista
        Map<String, Long> frequencia = nomes.stream().collect(Collectors.groupingBy(String::toString, Collectors.counting()));

        //exibir contagem para as 5 Strings mais frequentes
        System.out.println("5 nomes mais frequentes: ");
        frequencia.entrySet().stream().sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .limit(5).forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " vezes."));
    }
}
