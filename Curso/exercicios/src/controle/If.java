package controle;

import java.util.Scanner;

public class If
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a media. ");
        double media = Double.parseDouble(entrada.next());

        entrada.close();

        if(media <= 10.0 && media >= 7.0)
        {
            System.out.println("Aprovado, parabens!");
        }
        if(media < 7.0 && media >= 4.0)
        {
            System.out.println("Recuperacao.");
        }
        if(media < 4.5 && media >= 0.0)
        {
            System.out.println("Reprovado!");
        }
    }
}
