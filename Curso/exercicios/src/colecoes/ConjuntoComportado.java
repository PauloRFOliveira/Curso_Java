package colecoes;

import java.util.Set;
import java.util.SortedSet;
import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntoComportado
{
    public static void main(String[] args)
    {
        //Agora que o tipo de valores que serão adicionados a um Set estão homogenizados, não é aceita a adição de um elemento de um outro tipo.
        Set<String> listaAprovados = new HashSet<String>(); //Por ser um HashSet, não mantém a ordem dos elementos adicionados a ele
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");
        listaAprovados.add("Pedro");

        for(String candidato: listaAprovados)
        {
            System.out.println(candidato);
        }

        System.out.println();

        SortedSet<String> listaAprovacao = new TreeSet<String>(); //Por ser um TreeSet, a ordem de adição dos elementos é mantida
        listaAprovacao.add("Ana");
        listaAprovacao.add("Carlos");
        listaAprovacao.add("Lucas");
        listaAprovacao.add("Pedro");

        for(String candidato: listaAprovacao)
        {
            System.out.println(candidato);
        }
    }
}
