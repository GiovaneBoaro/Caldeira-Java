package aula06.exercicio01;

import aula06.exercicio01.Livro;

import java.util.Scanner;
import java.util.Stack;

public class LivroConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Livro> pilha = new Stack<>();
        Livro livro = new Livro();

        //tamanho do stack
        System.out.println("Quantos livros você quer adicionar?");
        int n = scanner.nextInt();

        System.out.println("Qual o titulo do livro que você deseja adicionar?");
        livro.setTitulo(scanner.next());

        System.out.println("Qual a categoria do livro?");
        livro.setCategoria(scanner.next());

        //adicionando novos elementos ao fim da lista
        for(int cont = 0; cont <= n; cont++) {
            pilha.push(livro);
        }

    }
}
