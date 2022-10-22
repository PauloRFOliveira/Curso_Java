package controle;

public class DesafioFor
{
    public static void main(String[] args)
    {
        String valor = "#";

        for(int i = 1; i <= 5; i++)
        {
            System.out.println(valor);
            valor += "#";
        }

        //Versão do Desafio
        //Não pode usar valores numéricos para controlar o laço!

        System.out.println();

        for(String i = "@"; !i.equals("@@@@@@"); i += "@")
        {
            System.out.println(i);
        }
    }
}
