package controle.exercicios;

import javax.swing.JOptionPane;

public class Numero5
{
    public static void main(String[] args)
    {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja descobrir se e primo."));
        int divisores = 0;
        int metadeNumero = numero / 2;

        for(int i = 2; i <= metadeNumero; i++)
        {
            if(numero % i == 0)
            {
                divisores++;
                break;
            }
        }

        switch(divisores)
        {
            case 0:
                System.out.printf("O numero %d e primo.", numero);
                break;
            default:
                System.out.printf("O numero %d nao e primo.", numero);
        }

    }
}
