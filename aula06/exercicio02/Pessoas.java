package aula06.exercicio02;

import java.util.HashMap;
import java.util.Map;

public class Pessoas {
    public static void main(String[] args) {
        Map<String, Integer> pessoas = new HashMap<>();

        //inserindo entradas no mapa
        pessoas.put(new String("Mario"), 32);
        pessoas.put(new String("Luiza"), 20);
        pessoas.put(new String("Maria"), 65);
        pessoas.put(new String("Luiz"), 78);
        pessoas.put(new String("Marcio"), 35);
        pessoas.put(new String("João"), 28);
        pessoas.put(new String("Cleber"), 86);



        //Imprimindo entradas do mapa
        // O método "keySet()" retorna um Set com todas as chaves do HashMap.
        for(String chave : pessoas.keySet()) {
            //capturando o valor a partir da chave
            String valor  = String.valueOf(pessoas.get(chave));
            System.out.println(chave + " - " + valor + " anos.");
        }

        System.out.println();

        //Imprimindo por nome especifico
        String nomeEspecifico = "João";
        if(pessoas.containsKey(nomeEspecifico)) {
            System.out.println("Nome especifico: " + nomeEspecifico + " - " + pessoas.get(nomeEspecifico) + " anos.");
        } else {
            System.out.println("Essa pessoa não está no mapa.");
        }

        System.out.println();

        //metodo para imprimir nome de pessoas na terceira idade
        for(Map.Entry<String, Integer> entry : pessoas.entrySet()) {
            String nome = entry.getKey();
            int idade = entry.getValue();
            if(idade >= 60) {
                System.out.println(nome + " está na terceira idade com " + idade + " anos.");
            }
        }



    }
}
