package aula05.exercicio05;

import java.util.LinkedList;
import java.util.Scanner;

public class ImpressaoConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Impressao> lista = new LinkedList<>();
        boolean start = true;

        while(start){
            System.out.println("Digite o nome do documento que deseja imprimir: ");
            String nome = scanner.next();

            System.out.println("Digite o número de páginas: ");
            int numeroDePaginas = scanner.nextInt();

            Impressao impressao = new Impressao(nome, numeroDePaginas);
            lista.add(impressao);

            System.out.println("Deseja continuar?");
            System.out.println("0 - Sair");
            System.out.println("1 - Continuar");
            int opcao = scanner.nextInt();

            if(opcao == 0) {
                start = false;
            }
        }

        for(int cont = 0; cont < lista.size(); cont++) {
            System.out.println((cont+ 1) + "º documento para impressão.");
        }
    }
}
