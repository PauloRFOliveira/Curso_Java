package controle.exercicios;

import javax.swing.JOptionPane;
import java.util.Random;

public class Numero6
{
    public static void main(String[] args)
    {
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(100);
        int tentativasRestantes = 10;
        boolean acertou = false;

        for(int i = 1; i <= 10; i++)
        {
            int tentativa = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja chutar (0 a 100)\nTentativas restantes: " + tentativasRestantes));
            tentativasRestantes--;

            if(tentativa < numeroAleatorio)
            {
                System.out.printf("O numero chutado (%d) e menor que o numero misterioso.\n", tentativa);
            }
            else if (tentativa > numeroAleatorio)
            {
                System.out.printf("O numero chutado (%d) e maior que o numero misterioso.\n", tentativa);
            }
            else
            {
                System.out.printf("O numero chutado (%d) foi certeiro, o numero misterioso era %d.\n", tentativa, numeroAleatorio);
                acertou = true;
                break;
            }
        }

        if(!acertou){
            System.out.printf("\nTentativas encerradas.\nMais sorte da proxima vez. O numero misterioso era %d.", numeroAleatorio);
        }
    }
}
