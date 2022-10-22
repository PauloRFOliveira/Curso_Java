package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila
{
    public static void main(String[] args)
    {
        Queue<String> fila = new LinkedList<>();

        //Os dois métodos podem ser usados para adicionar elementos a uma fila.
        //Onde existe diferença de comportamento entre os métodos é quando a fila está cheia. O método add retorna falso nesse caso e o método offer resulta em um erro.
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //Os dois retornam o próximo elemento da fila, mas não retiram tal elemento da fila.
        //Os dois métodos diferem em comportamento quando a fila está vazia, onde o peek retorna null e o element resulta em um erro.
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        System.out.println();

        //Retorna o tamanho da fila.
        System.out.println(fila.size());

        System.out.println();

        //Apaga todos os elementos da fila.
        fila.clear();
        //Retorna se a fila está vazia;
        System.out.println(fila.isEmpty());

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println();

        //Retorna o próximo elemento da fila e o retira da fila. Retorna null caso a fila esteja vazia.
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        //Remove o próximo elemento da fila, mas caso a fila esteja vazia resulta em um erro.
        //fila.remove();

        //Retorna verdadeiro se a fila contêm tal elemento e falso caso contrário.
        //fila.contains();
    }
}
