package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class DesafioNotas
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas que deseja calcular a media.");
        int tamanhoArray = entrada.nextInt();

        double[] notas = new double[tamanhoArray];

        for(int i = 0; i < notas.length; i++)
        {
            System.out.println("Digite a nota numero " + (i + 1));
            notas[i] = Double.parseDouble(entrada.next());
        }

        entrada.close();

        String stringNotas = Arrays.toString(notas);

        System.out.println(stringNotas);

        double soma = 0;

        for(double nota:notas)
        {
            soma += nota;
        }

        double media = soma/notas.length;

        System.out.printf("A media das %d notas e igual a: %.1f", notas.length, media);
    }
}
