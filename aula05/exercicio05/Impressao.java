package aula05.exercicio05;

public class Impressao {
    private String nome;
    private int numeroDePaginas;

    public Impressao(String nome, int numeroDePaginas) {
        this.nome = nome;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public String getNome() {
        return nome;
    }
}
