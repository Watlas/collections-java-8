package queue;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("Joao");
//
//        String clienteASerAtendido = filaBanco.poll(); //pega o primeiro Cliente e remove
//
//        System.out.println(clienteASerAtendido);
//
//        System.out.println(filaBanco);
//
//        String PrimeiroDaFila = filaBanco.peek();
//
//        System.out.println(PrimeiroDaFila);
//        filaBanco.element(); // com validaçao


//
        filaBanco.clear();
        filaBanco.poll();




    }
}
