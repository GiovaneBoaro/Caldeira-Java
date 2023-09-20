package Aula03;

public class Circulo {

    // ATRIBUTOS
    private double raio;

    // CONSTRUTOR
    public Circulo(double raio) {
        this.raio = raio;
    }

    // GETTER E SETTER
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // METODOS
    public double calcularArea() {
        double area = Math.PI * this.raio * this.raio;
        return area;
    }

    public double calcularCircunferencia() {
        double circunferencia = 2 * Math.PI * this.raio;
        return circunferencia;
    }

    public double calcularDiametro() {
        double diametro = 2 * raio;
        return diametro;
    }

    public void definirRaio(double novoRaio) {
        this.raio = novoRaio;
    }

    //Os circulos são iguais desde que os raios sejam iguais
    @Override public boolean equals(Object circulo) {
        if (this.raio == ((Circulo) circulo).getRaio()){
            return true; } return false; }


    // ToString
    public String toString() {
        String texto = "";
        texto = texto + "Raio: " + this.raio + "\n";
        texto = texto + "Área " + calcularArea() + "\n";
        texto = texto + "Circunferência " + calcularCircunferencia() + "\n";
        texto = texto + "diâmetro " +  calcularDiametro() + "\n";
        return texto;
    }
}
