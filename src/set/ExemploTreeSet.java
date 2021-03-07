package set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> list = new TreeSet<>();

        list.add("Porto Alegre");
        list.add("Florianopolis");
        list.add("Curitiba");
        list.add("Sao paulo");
        list.add("Rio de janeiro");


        System.out.println(list);
    }
}
