package controle;

import java.util.Scanner;

public class DoWhile
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        String texto = "";
        do
        {
            System.out.println("Voce tem que digitar as palavrinhas magicas...");
            System.out.print("Quer sair? ");
            texto = entrada.nextLine();

        }while(!texto.equalsIgnoreCase("por favor"));

        entrada.close();

        System.out.println("Obrigado!");
    }
}
