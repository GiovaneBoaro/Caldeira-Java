package Aula04.exercicio01;

public class Carro extends Veiculo {
    double distancia = 5;
    public Carro() {
        super.setAno(2015);
        super.setMarca("fdgfhgfhgf");
        super.setModelo("dhfghgfhgf");
    }
    @Override
    public double calcularCustoViagem() {
        return distancia * 0.20;
    }


}
