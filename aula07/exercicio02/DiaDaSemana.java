package aula07.exercicio02;

public enum DiaDaSemana {
    SEGUNDA("Hoje é segunda-feira, dia de trabalhar!"),
    TERCA("Hoje é terça-terça, dia de trabalhar!"),
    QUARTA("Hoje é quarta-feira, dia de trabalhar!"),
    QUINTA("Hoje é quinta-feira, dia de trabalhar!"),
    SEXTA("Hoje é sexta-feira, dia de trabalhar!"),
    SABADO("Hoje é sabado, dia de descanso!"),
    DOMINGO("Hoje é domingo, dia de descanso!");

    DiaDaSemana(String mensagem) {
        this.mensagem = mensagem;
    }

    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }
}
