
package filaum.teste;

import filaum.fila.FilaVetor;


public class ExemploFIlaDesinfileira {
    public static void main(String[] args) {
        FilaVetor<Integer> fila = new FilaVetor<>();
        fila.enfileira(8);
        fila.enfileira(7);
        fila.enfileira(55);
        fila.enfileira(44);
        fila.enfileira(6778);
        fila.enfileira(999999);
        System.out.println(fila);
        System.out.println("O elemento"+fila.desenfileira()+"foi removido da fila");
        System.out.println(fila);
        System.out.println("O elemento"+fila.desenfileira()+"foi removido da fila");
        System.out.println(fila);
        System.out.println("O elemento"+fila.desenfileira()+"foi removido da fila");                
        
    }
    
}
