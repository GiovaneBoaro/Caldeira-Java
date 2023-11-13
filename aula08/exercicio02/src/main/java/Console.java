package aula08.exercicio02.src.main.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Console {
    public static void main(String[] args) {
        //Lista de produtos
        List<Produto> produtos = Arrays.asList(
                new Produto("Camiseta", 59, 11),
                new Produto("Calça", 100,5),
                new Produto("Boné", 25, 1),
                new Produto("Tênis", 250, 2),
                new Produto("Pulseira", 3, 15)
        );

        //Encontrar o produto mais caro da lista
        Produto maisCaro = produtos.stream().max(Comparator.comparing(Produto::getPreco)).orElse(null);
        System.out.println("Produto mais caro: " + maisCaro);


        //Calcular o preço total de todos os produtos na lista
        double precoTotal = produtos.stream().mapToDouble(Produto::getPreco).sum();
        System.out.println("Preço total dos produtos: " + precoTotal);

        System.out.println();

        //Filtrar os produtos com quantidade superior a 10 e criar uma nova lista com eles
        List<Produto> maiorQueDez = produtos.stream().filter(produto -> produto.getQuantidade() > 10).collect(Collectors.toList());
        System.out.println("Produtos com quantidade maior que 10: " + maiorQueDez);
    }
}
