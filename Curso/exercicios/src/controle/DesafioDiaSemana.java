package controle;

import java.util.Scanner;

public class DesafioDiaSemana
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do dia da semana: ");
        String diaSemana = entrada.next();

        entrada.close();

        diaSemana = diaSemana.toLowerCase();
        String saida;

        if(diaSemana.equals("domingo"))
        {
            saida = "1";
        }
        else if(diaSemana.equals("segunda"))
        {
            saida = "2";
        }
        else if(diaSemana.equals("terca"))
        {
            saida = "3";
        }
        else if(diaSemana.equals("quarta"))
        {
            saida = "4";
        }
        else if(diaSemana.equals("quinta"))
        {
            saida = "5";
        }
        else if(diaSemana.equals("sexta"))
        {
            saida = "6";
        }
        else if(diaSemana.equals("sabado"))
        {
            saida = "7";
        }
        else
        {
            saida = "Dia da semana invalido.";
        }

        System.out.println(saida);
    }
}
