package aula05.exercicio06;

public class Reserva {
    private String nome;
    private String local;
    private String cpf;
    private String dataDeEntrada;
    private String dataDeSaida;

    public Reserva(String nome, String local, String cpf, String dataDeEntrada, String dataDeSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataDeEntrada = dataDeEntrada;
        this.dataDeSaida = dataDeSaida;
    }

    public Reserva() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(String dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }
}
