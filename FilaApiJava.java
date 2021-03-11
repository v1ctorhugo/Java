package exemplofila.teste;

import java.util.LinkedList;
import java.util.Queue;


public class ExemploFilaApiJava {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        fila.add(852);
        fila.add(3434);
        fila.add(434);
        fila.add(6566);
        fila.add(222);
        System.out.println("Os elementos da fila são:\n"
                + fila);
        System.out.println("O primeiro elemento da fila é:"+fila.peek());
        System.out.println("O elemento "+fila.remove()+" foi removido");
        System.out.println(fila);
        System.out.println("O tamanho da fila é:"+fila.size());
        
    }
    
    
}
