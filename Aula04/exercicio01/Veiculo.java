package Aula04.exercicio01;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    public abstract double calcularCustoViagem();

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void imprimir(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(calcularCustoViagem() + " Km");

    }

}
