package colecoes;

import java.util.HashSet;

public class Hash
{
    public static void main(String[] args)
    {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));

        //Caso a classe Usuario não tivesse o HashCode implementado, essa comparação seguinte resultaria em falso, mesmo o Usuário de nome Guilherme estando presente na Set.
        System.out.println(usuarios.contains(new Usuario("Guilherme")));
    }
}
