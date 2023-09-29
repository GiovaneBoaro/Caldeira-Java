package aula04.exercicio01;

public class Carro extends Veiculo {
    double distancia = 45;
    public Carro() {
        super.setAno(2015);
        super.setMarca("Chevrolet");
        super.setModelo("Celta");
    }
    @Override
    public double calcularCustoViagem() {
        return distancia * 0.20;
    }


}
