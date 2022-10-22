package controle.exercicios;

import javax.swing.JOptionPane;

public class Numero9
{
    public static void main(String[] args)
    {
        double maior = 0.0;
        double numero;

        for(int i = 0; i < 10; i++)
        {
            numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));

            if(i == 0)
            {
                maior = numero;
            }
            else
            {
                if(numero > maior)
                {
                    maior = numero;
                }
            }
        }

        System.out.printf("O maior dentre os numeros digitados foi: %.2f", maior);
    }
}
