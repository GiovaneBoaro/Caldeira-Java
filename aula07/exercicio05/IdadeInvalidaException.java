package aula07.exercicio05;

// Definir exceção
public class IdadeInvalidaException extends RuntimeException{
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }

}
