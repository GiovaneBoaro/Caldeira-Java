package aula06.exercicio03;

import java.util.TreeMap;
import java.util.Map;

public class AgendaConsole {
    public static void main(String[] args) {
        TreeMap<String, Agenda> agenda = new TreeMap<>();
        
        // inserindo elementos na lista
          agenda.put("Maria", new Agenda("(51)91245-9617","Maria","rua barcelos 123","norte"));
          agenda.put("José", new Agenda("(51)95687-4521","José","rua joselio 51","sul"));
          agenda.put("Carol", new Agenda("(51)90745-6732","Carol","rua paraiba 12","leste"));
          agenda.put("Anderson", new Agenda("(51)90928-1432","Anderson","rua mascaranhas 21","oeste"));
          agenda.put("Eduardo", new Agenda("(51)93456-9817","Eduardo","rua jucelino 45","norte"));

        // imprimir a lista em ordem alfabetica dos nomes
        for(Map.Entry<String, Agenda> entry : agenda.entrySet()) {
            System.out.println(entry.toString());
        }

        // imprimir a lista com base na localidade
        String localEspecifico = "norte";
        for(Map.Entry<String, Agenda> entry : agenda.entrySet()) {
            Agenda local = entry.getValue();
            if(local.getLocalDaCidade().equalsIgnoreCase(localEspecifico)) {
                System.out.println();
                System.out.println("Pessoa(s) da região " + localEspecifico + " da cidade: " + entry.getKey());
            }
        }
    }
}
