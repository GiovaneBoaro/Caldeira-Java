package aula06.exercicio03;

public class Agenda {
    private String numeroDeTelefone;
    private String nome;
    private String endereco;
    private String localDaCidade;

    public Agenda( String numeroDeTelefone, String nome, String endereco, String localDaCidade) {
        this.numeroDeTelefone = numeroDeTelefone;
        this.nome = nome;
        this.endereco = endereco;
        this.localDaCidade = localDaCidade;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocalDaCidade() {
        return localDaCidade;
    }

    @Override
    public String toString() {
        return  "\n" +
                "Número de telefone: " + numeroDeTelefone + '\n' +
                "Endereço: " + endereco + '\n' +
                "Local da cidade: " + localDaCidade + '\n' +
                '}';
    }
}
