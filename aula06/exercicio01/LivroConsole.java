package aula06.exercicio01;

import java.util.Stack;

public class LivroConsole {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();

        //iniciar pilha
        pilha.push(new Livro("Harry Potter e as relíquias da morte","fantasia"));
        pilha.push(new Livro("Jantar Secreto","suspense"));
        pilha.push(new Livro("Dias perfeitos","suspense"));
        pilha.push(new Livro("O vilarejo","suspense"));
        pilha.push(new Livro("O Senhor das moscas","romance"));

        System.out.println("*********************************");

        //imprimir o que foi adicionado na pilha
        System.out.println("Livros adicionados: ");
        for(Livro livroAdicionado : pilha) {
            System.out.println(livroAdicionado.getTitulo());
        }

        System.out.println("*********************************");

        //imprimir por categoria
        String categoria = "suspense";
        System.out.println("Livros com a categoria " + categoria + ":");
        for(Livro livroCategoria : pilha) {
           if(livroCategoria.getCategoria().equals(categoria)) {
               System.out.println(livroCategoria.getTitulo());
           }
        }

        System.out.println("*********************************");

        //loop pra remover elementos
        do {
            Livro removido = pilha.pop();
            System.out.println("Livro que foi removido: " + removido.getTitulo());
        } while(!pilha.isEmpty());
    }
}
