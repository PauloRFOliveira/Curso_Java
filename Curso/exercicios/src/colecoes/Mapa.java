package colecoes;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class Mapa
{
    public static void main(String[] args)
    {
        Map<Integer, String> usuarios = new HashMap<>();

        //Diferentemente das outras coleções, o mapa não admite o método add para a adição de elementos, nesse caso fazemos uso do método put.
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");
        //Mas o método put não serve apenas para adicionar elementos a uma chave, ele substitui o valor atribuído a chave, caso a mesma já esteja em uso.

        //Ainda podemos fazer o uso de outros métodos comuns às coleções, como os seguintes.
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println();

        //No caso do mapa, temos um método especial que nos retorna o conjunto de todas as chaves que estão sendo usadas.
        System.out.println(usuarios.keySet());
        //Também temos acesso a um outro método no mapa que nos retorna se uma dada chave está contida entre as chaves do mapa.
        System.out.println(usuarios.containsKey(4));
        System.out.println(usuarios.containsKey(6));

        System.out.println();

        //De forma análoga, podemos trabalhar de maneiras semelhantes com os valores do mapa.
        System.out.println(usuarios.values());
        //Verificando se um determinado valor se faz presente no mapa.
        System.out.println(usuarios.containsValue("Roberto"));
        System.out.println(usuarios.containsValue("Roberta"));

        System.out.println();

        //Da mesma forma que podemos obter as chaves e os valores separadamente, podemos obter os dois de forma combinada.
        System.out.println(usuarios.entrySet());

        System.out.println();

        //Podemos facilmente obter o valor a partir da sua chave associada fazendo o uso do método get e inserindo a chave.
        System.out.println(usuarios.get(3));
        System.out.println(usuarios.get(1));

        System.out.println();

        //Com o uso do for, podemos percorrer as chaves, os valores e a combinação chave-valor.
        for(int chave: usuarios.keySet())
        {
            System.out.println(chave);
        }

        System.out.println();

        for(String valor: usuarios.values())
        {
            System.out.println(valor);
        }

        System.out.println();

        for(Entry<Integer, String> usuario: usuarios.entrySet())
        {
            System.out.print(usuario.getKey() + " ==> ");
            System.out.println(usuario.getValue());
        }

        System.out.println();

        //Para remover um elemento do mapa, fazemos o uso do método remove, que possui dois funcionamentos, um onde passamos apenas a chave e ele efetua a remoção do elemento com aquela chave.
        //Na outra modalidade, passamos o conjunto chave e valor, onde apenas se os dois baterem a remoção é realizada.
        System.out.println(usuarios.remove(1)); //Dessa forma o método retorna o valor que é referente a chave passada.
        System.out.println(usuarios.remove(2, "Rafaela"));
        System.out.println(usuarios.remove(2, "Ricardo")); //Quando é passado o conjunto chave-valor o retorno do método é verdadeiro ou falso.

    }
}
