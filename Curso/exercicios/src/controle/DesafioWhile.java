package controle;

import java.util.Scanner;

public class DesafioWhile
{
    public static void main(String[] args)
    {
        int notasValidas = 0;
        double somaNotas = 0.0;
        double nota = 0.0;

        Scanner entrada = new Scanner(System.in);

        while(nota != -1)
        {
            System.out.print("Digite o valor da nota do aluno: ");
            nota = Double.parseDouble(entrada.next());

            if(nota >= 0.0 && nota <= 10.0)
            {
                notasValidas++;
                somaNotas += nota;
            }
            else if(nota != -1)
            {
                System.out.println("Por favor digite uma nota valida. Se deseja sair, digite o valor da nota sendo -1.");
            }
        }

        entrada.close();

        double media = somaNotas / notasValidas;
        System.out.printf("A media das %d notas da turma e igual a: %.1f", notasValidas, media);
    }
}
