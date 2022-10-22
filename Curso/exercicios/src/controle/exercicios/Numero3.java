package controle.exercicios;

import java.util.Scanner;

public class Numero3
{
    public static void main(String[] args)
    {
        int contadorNotasValidas = 0;
        double somaValidas = 0.0;
        double media;

        Scanner entrada = new Scanner(System.in);

        while(contadorNotasValidas < 2)
        {
            System.out.print("Digite a nota: ");
            double nota = Double.parseDouble(entrada.next());

            if(nota >= 0.0 && nota <= 10.0)
            {
                somaValidas += nota;
                contadorNotasValidas++;
            }
            else
            {
                System.out.println("Nota invalida, por favor digitar nota valida.");
            }
        }

        entrada.close();

        media = somaValidas / 2;

        if(media >= 7.0)
        {
            System.out.printf("Aluno aprovado. Media: %.1f", media);
        }
        else if(media >= 4.0)
        {
            System.out.printf("Aluno em recuperacao. Media: %.1f", media);
        }
        else
        {
            System.out.printf("Aluni reprovado. Media: %.1f", media);
        }
    }
}
