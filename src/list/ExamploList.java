package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExamploList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Watlas");
        nomes.add("Pedro");
        nomes.add("Mamaco");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(0, "marcos");  //seta no indeci

        System.out.println(nomes);

        nomes.remove("marcos"); //remove item

        System.out.println(nomes);

        nomes.remove(0); //remove  indece

        System.out.println(nomes);

        int tamanho = nomes.size();

        boolean temwatlas= nomes.contains("Watlas");

        System.out.println(temwatlas);

        boolean estavazi = nomes.isEmpty();

        System.out.println(estavazi);

      //  nomes.clear(); //limpa lista

        int posicao = nomes.indexOf("Watlas"); //retorna a posiçao

        for (String nome:
             nomes) {
            System.out.println(nome);
        }

      Iterator<String> iterator =  nomes.iterator();


        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }


}
