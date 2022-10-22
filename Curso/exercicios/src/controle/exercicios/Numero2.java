package controle.exercicios;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Numero2
{
    public static void main(String[] args)
    {
        //Criar um programa informa se o ano atual é um ano bissexto;

        //Usando o módulo GregorianCalendar
        GregorianCalendar hoje = new GregorianCalendar();

        if(hoje.getWeekYear() % 4 == 0)
        {
            System.out.println("O ano e bissexto.");
        }
        else
        {
            System.out.println("O ano nao e bissexto.");
        }

        //Pedindo ao usuário o ano
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano que deseja descobrir se e bissexto: ");
        int anoLido = entrada.nextInt();

        entrada.close();

        if(anoLido % 4 == 0)
        {
            System.out.printf("O ano %d e bissexto.", anoLido);
        }
        else
        {
            System.out.printf("O ano %d nao e bissexto.", anoLido);
        }
    }
}
