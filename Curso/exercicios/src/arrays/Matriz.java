package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Matriz
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos da turma: ");
        int quantidadeAlunos = entrada.nextInt();

        System.out.print("Digite a quantidade de notas de cada aluno: ");
        int quantidadeNotas = entrada.nextInt();

        double[][] notasTurma = new double [quantidadeAlunos][quantidadeNotas];

        double total = 0.0;

        for(int i = 0; i < notasTurma.length; i++)
        {
            for(int j = 0; j < notasTurma[i].length; j++)
            {
                System.out.printf("Digite a nota %d do aluno %d: ", (j + 1), (i + 1));
                notasTurma[i][j] = Double.parseDouble(entrada.next());

                total += notasTurma[i][j];
            }
        }

        entrada.close();

        double media = total / (quantidadeAlunos * quantidadeNotas);
        System.out.printf("A media das notas dos %d alunos e igual a: %.1f", quantidadeAlunos, media);
        System.out.println();

        for(double[] notasDoAluno: notasTurma)
        {
            System.out.println(Arrays.toString(notasDoAluno));
        }
    }
}
