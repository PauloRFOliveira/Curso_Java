package controle.exercicios;

import javax.swing.JOptionPane;

public class Numero1
{
    public static void main(String[] args)
    {
        //Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
        String saida = "";

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));

        boolean par = (numero % 2 == 0);
        boolean intervalo = (numero >= 0 && numero <= 10);

        if(par && intervalo)
        {
            saida += "O numero e par e se encontra no intervalo entre 0 e 10.";
        }
        else if(par)
        {
            saida += "O numero e par, mas nao se encontra no intervalo entre 0 e 10.";
        }
        else if(intervalo)
        {
            saida += "O numero nao e par, mas se encontra no intervalo entre 0 e 10.";
        }
        else
        {
            saida += "O numero nao e par e tambem nao se encontra no intervalo entre 0 e 10.";
        }

        System.out.println(saida);
    }
}
