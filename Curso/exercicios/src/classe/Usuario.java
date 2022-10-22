package classe;

public class Usuario
{
    String nome;
    String email;

    public boolean equals(Object objeto)
    {
        if (objeto instanceof Usuario)
        {
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            boolean igual = nomeIgual && emailIgual;

            return igual;
        }else
        {
            return false;
        }
    }
}
