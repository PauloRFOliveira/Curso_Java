package controle.exercicios;

import java.util.Scanner;

public class Numero7
{
    public static void main(String[] args)
    {
        boolean controle = true;
        double soma = 0.0;

        Scanner entrada = new Scanner(System.in);

        while(controle)
        {

            System.out.print("Digite um numero positivo caso deseje somar, ou um numero negativo caso deseje parar: ");
            double numero = Double.parseDouble(entrada.next());

            if(numero < 0)
            {
                controle = false;
                System.out.println("Programa encerrado, pois um numero negativo foi digitado.");
                System.out.printf("A soma de todos os numeros digitados e igual a %.2f\n", soma);
            }
            else
            {
                soma += numero;
                System.out.printf("A soma de todos os numeros digitados e igual a %.2f\n", soma);
            }
        }

        entrada.close();
    }
}
