package comparators;

import java.util.*;

public class ComparatorsExampleList {
    public static void main(String[] args) {

        List<Estudante> list = new ArrayList<>();

        list.add(new Estudante("watlas", 20));
        list.add(new Estudante("carlos", 20));
        list.add(new Estudante("joao", 20));
        list.add(new Estudante("marcos", 20));
        list.add(new Estudante("junior", 20));
        list.add(new Estudante("miguel", 20));
        list.add(new Estudante("julio", 20));

        //ordem de inserção
        System.out.println(list);

        //idade ordenalai
        list.sort((first, segundo) -> first.getIdade() - segundo.getIdade());
        System.out.println(list);
        //ordem reversa da idade
        list.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(list);


        Collections.sort(list, new ComparatorOrdemInversa());
    }
}
