package arrays;

import java.util.Arrays;

public class Exercicio2
{
    public static void main(String[] args)
    {
        double[] notasAlunoA = new double [4];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        String stringAlunoA = Arrays.toString(notasAlunoA);
        String stringAlunoB = Arrays.toString(notasAlunoB);

        double somaAlunoA = 0;
        double somaAlunoB = 0;

        for(double nota:notasAlunoA)
        {
            somaAlunoA += nota;
        }
        for(double nota:notasAlunoB)
        {
            somaAlunoB += nota;
        }

        System.out.println(stringAlunoA);
        System.out.println(somaAlunoA);
        System.out.println(somaAlunoA/notasAlunoA.length);

        System.out.println(stringAlunoB);
        System.out.println(somaAlunoB);
        System.out.println(somaAlunoB/notasAlunoB.length);
    }
}
