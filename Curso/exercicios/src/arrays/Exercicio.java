package arrays;

import java.util.Arrays;

public class Exercicio
{
    public static void main(String[] args)
    {
        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        String stringAlunoA = Arrays.toString(notasAlunoA);
        String stringAlunoB = Arrays.toString(notasAlunoB);

        System.out.println(stringAlunoA);

        double total = 0.0;

        for(int i = 0; i < notasAlunoA.length; i++)
        {
            total += notasAlunoA[i];
        }

        System.out.println(total);

        double media = total/notasAlunoA.length;

        System.out.println(media);

        total = 0;

        for(int i = 0; i < notasAlunoB.length; i++)
        {
            total += notasAlunoB[i];
        }

        System.out.println(stringAlunoB);

        System.out.println(total);

        media = total/notasAlunoB.length;

        System.out.println(media);
    }
}
