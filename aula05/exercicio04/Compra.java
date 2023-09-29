package aula05.exercicio04;

public class Compra {
    private String nome;
    private String dataDeValidade;

    public Compra(String nome, String dataDeValidade) {
        this.nome = nome;
        this.dataDeValidade = dataDeValidade;
    }

    public Compra() {

    }

    public String getNome() {
        return nome;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
