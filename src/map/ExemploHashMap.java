package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        // CHAVE    VALOR
        Map<String, Integer> list = new HashMap<>();
       // Map<String, List<Objeto>> list = new HashMap<>();

        list.put("a", 2);
        list.put("b", 2);
        list.put("c", 4);
        list.put("d", 5);
        list.put("e", 6);
        list.put("f", 7);
        list.put("g", 8);
        list.put("h", 9);

        list.put(null, 5);


        System.out.println(list);

//
//        //lista com chaves
//        System.out.println(list);
//
//
//        //retorna value
//        System.out.println(list.get("a")); //key
//
//        //retorna se existe ou nao (boolean)
//        System.out.println(list.containsKey("a"));
//
//        //remove uma key
//        list.remove("a");
//        System.out.println(list);
//
//        //retorna se existe ou não
//        System.out.println(list.containsValue("a"));
//
//        //retorna o tamanho do map
//        System.out.println(list.size());
//
//        //Navega no reistros do mapa
//        for (Map.Entry<String, Integer> entry : list.entrySet()){
//            System.out.println(entry.getKey() + "----" + entry.getValue());
//        }
//
//        for(String key : list.keySet()){
//            System.out.println(key + "----" + list.get(key));
//        }
//
//        System.out.println(list);





    }
}
