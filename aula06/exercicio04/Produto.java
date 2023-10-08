package aula06.exercicio04;

import aula06.exercicio03.Agenda;

import java.util.LinkedHashMap;
import java.util.Map;

public class Produto {
    public static void main(String[] args) {
        //criar uma instancia do linkedhashmap
        LinkedHashMap<String, Double> produtos = new LinkedHashMap<String, Double>();

        //adicionar elementos no mapa
        produtos.put("escova de dente", 8.50);
        produtos.put("sabonete", 2.90);
        produtos.put("shampoo", 14.90);
        produtos.put("condicionador", 16.90);
        produtos.put("fio dental", 14.50);


        // imprimir elementos na ordem que foram inseridos
        for(Map.Entry<String, Double> entry : produtos.entrySet()) {
            String produtoNome = entry.getKey();
            Double produtoPreco = entry.getValue();
            System.out.println("Nome do produto: " + produtoNome + " | " + "Preço: " + produtoPreco);
        }
    }
}
