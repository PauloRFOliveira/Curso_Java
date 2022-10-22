package colecoes;

import java.util.ArrayList;

public class Lista
{
    public static void main(String[] args)
    {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Ana"); //Posso tanto criar o novo usuário antes e armazenar em uma variável antes de adicionar ele à lista.
        lista.add(u1);

        lista.add(new Usuario("Carlos")); //Como posso criar o novo usuário durante a adição dele à lista, não armazenando seu valor em uma variável antes.
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println("Depois da adicao de elementos");

        for(Usuario u: lista)
        {
            System.out.println(u.nome);
        }

        System.out.println();

        System.out.println("Impressao de um elemento da lista a partir do indice.");
        System.out.println(lista.get(3).nome); //Impressão fazendo o uso do índice da lista.

        System.out.println();

        System.out.println("Impressao de um elemento da lista por meio de comparacao.");
        System.out.println(lista.get(3)); //Impressão usando o método toString que foi implementado para a classe Usuario

        System.out.println();

        //Remoção usando um dos índices da lista.
        lista.remove(1); //Dessa maneira o método remove retorna o objeto que ela removeu da lista.
        System.out.println("Impressao depois da primeira remocao de um elemento da lista.");
        for(Usuario u: lista)
        {
            System.out.println(u.nome);
        }

        System.out.println();

        //Fazendo a remoção do elemento dessa forma, existe a chamada a um equals, que remove o objeto igual ao passado.
        lista.remove(new Usuario("Manu")); //Dessa maneira o método remove retorna verdadeiro se houve a remoção do elemento, e falso caso contrário.
        System.out.println("Impressao depois da segunda remocao de um elemento da lista.");
        for(Usuario u: lista)
        {
            System.out.println(u.nome);
        }

        System.out.println();

        //Também podemos fazer a verificação de um elemtento está contido dentro da lista, por meio do método contains
        System.out.println("Impressao referente aos metodos contains chamados sobre a lista.");
        System.out.println(lista.contains(new Usuario("Lia")));
        System.out.println(lista.contains(new Usuario("Manu")));
    }
}
