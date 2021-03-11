
package filaum.teste;

import filaum.fila.FilaVetor;


public class ExemploFilaEstatica {
    public static void main(String[] args) {
        FilaVetor<String> fila = new FilaVetor<>();
        //enfileira
        System.out.println("A fila está vazia?"+fila.estaVazia());
        fila.enfileira("Mara das colves");
        fila.enfileira("Jose tamarindo");
        fila.enfileira(" Timorteo");
        System.out.println("A fila está vazia?"+fila.estaVazia());
        System.out.println("O tamanho da fila é:"+fila.tamanho());
        System.out.println("O primeiro elemento da fila é:"+fila.espiar());
        System.out.println(fila.toString());
    }                                                                       
}