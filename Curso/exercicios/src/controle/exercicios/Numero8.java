package controle.exercicios;

import java.util.Scanner;

public class Numero8
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a palavra que deseja escrita letra por letra: ");
        String palavra = entrada.next();

        entrada.close();

        for(int i = 0; i < palavra.length(); i++)
        {
            System.out.println(palavra.charAt(i));
        }
    }
}
