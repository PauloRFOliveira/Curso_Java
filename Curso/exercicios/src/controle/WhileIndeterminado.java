package controle;

import java.util.Scanner;

public class WhileIndeterminado
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        String leitura = "";

        while(!leitura.equalsIgnoreCase("sair"))
        {
            System.out.print("O que voce diz? (Digite sair para encerrar) ");
            leitura = entrada.next();
        }

        entrada.close();
    }
}
