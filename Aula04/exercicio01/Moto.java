package Aula04.exercicio01;

public class Moto extends Veiculo {
    double distancia = 5;

    public Moto() {
        super.setAno(2012);
        super.setMarca("fdgfhgfhgf");
        super.setModelo("dhfghgfhgf");
    }
    @Override
    public double calcularCustoViagem() {
        return distancia * 0.15;
    }


}
