package controle.exercicios;

import java.util.Scanner;

public class Numero4
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual numero inteiro deseja descobrir se e primo? ");
        int numero = entrada.nextInt();

        entrada.close();

        boolean primo = true;
        int metadeNumero = numero / 2;

        for(int i = 2; i <= metadeNumero; i++)
        {
            if(numero % i == 0)
            {
                primo = false;
                break;
            }
        }

        if(primo)
        {
            System.out.printf("O numero %d e primo.", numero);
        }
        else
        {
            System.out.printf("O numero %d nao e primo.", numero);
        }
    }
}
