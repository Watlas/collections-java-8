package set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet
{
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<>();

        list.add("oi");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");


        System.out.println(list);
    }
}
