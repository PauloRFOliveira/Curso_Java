package colecoes;

import java.util.Deque;
import java.util.ArrayDeque;

public class Pilha
{
    public static void main(String[] args)
    {
        Deque<String> livros = new ArrayDeque<>();

        //Existem dois métodos para adicionar elementos a uma pilha, o add e o push.
        //O add retorna true ou false no caso de ter conseguido ou não adicionar o elemento à pilha. Já o push não tem esse mesmo retorno e emite um erro caso com a adição seja excedido o limite de elementos da pilha.
        livros.add("O Pequeno Principe");
        livros.push("Dom Quixote");
        livros.push("O Hobbit");

        //Para mostrar o próximo elemento da pilha (sem retira-lo) podemos usar os mesmos métodos usados para as filas, mas tomando atenção por a pilha segue e lógica LIFO enquanto a fila a FIFO.
        //Os dois métodos diferem de comportamento quando a pilha está vazia, o peek retornando null e o element resultando em um erro.
        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println();

        //Para mostrar o próximo elemento da pilha e retira-lo da mesma usamos os mesmos métodos que usamos para as filas, mas mais uma vez atentando para as lógicas diferentes.
        //Também podemos fazer uso do método pop, que possui comportamento análogo ao do remove.
        //Mais uma vez os métodos diretem de comportamento quando a pilha está vazia, o poll retorna null nesse caso e o remove entrega um erro.
        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.pop());
        System.out.println(livros.poll());
        //System.out.println(livros.remove()); //Essa linha resulta em um erro.

        //Outros métodos comuns as collections também podem ser usados com pilhas, como os seguintes:
        //livros.size();
        //livros.clear();
        //livros.contains();
        //livros.isEmpty();
    }
}
