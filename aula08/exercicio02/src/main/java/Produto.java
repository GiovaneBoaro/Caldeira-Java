package aula08.exercicio02.src.main.java;

public class Produto {
    private String produto;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.produto = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return  "" + "\n" +
                "produto = " + produto + "\n" +
                "preço =" + " R$" + preco + "\n" +
                "quantidade = " + quantidade + "\n" +
                "";
    }
}
