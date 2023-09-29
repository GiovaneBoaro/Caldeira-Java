package aula04.exercicio01;

public class Moto extends Veiculo {
    double distancia = 45;

    public Moto() {
        super.setAno(2016);
        super.setMarca("Honda");
        super.setModelo("CG 160");
    }
    @Override
    public double calcularCustoViagem() {
        return distancia * 0.15;
    }


}
