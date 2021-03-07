package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Juliana");
        lista.add("Pedro");
        lista.add("Carlos");
        lista.add("Larissa");
        lista.add("Joao");

        System.out.println(lista);

        lista.set(2, "Roberto");

        lista.get(1);
        lista.remove(4);
        lista.remove("Joao");
        lista.size();
        lista.contains("Juliano");

        List<String> lista2 = new ArrayList<>();

        lista2.add("Ismael");
        lista2.add("Rodrigo");

        lista.addAll(lista2);

        Collections.sort(lista);

        lista.isEmpty();

        System.out.println(lista.get(Integer.parseInt("Pedro")));


    }
}
