package fundamentos.exercicios;

import java.util.Scanner;

public class EquacaoSegundoGrau
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do a. ");
        double a = Double.parseDouble(entrada.next());
        System.out.print("Digite o valor do b. ");
        double b = Double.parseDouble(entrada.next());
        System.out.print("Digite o valor do c. ");
        double c = Double.parseDouble(entrada.next());

        entrada.close();

        double delta = Math.pow(b, 2) + (4 * (a * c));
        double raiz1 = 0.0;
        double raiz2 = 0.0;

        raiz1 = delta == 0 ? ((-1 * b) + Math.sqrt(delta)) / (2 * a) : raiz1;
        raiz2 = delta == 0 ? raiz1 : raiz2;
        raiz1 = delta > 0 ? ((-1 * b) + Math.sqrt(delta)) / (2 * a) : raiz1;
        raiz2 = delta > 0 ? ((-1 * b) - Math.sqrt(delta)) / (2 * a) : raiz2;

        String impressao = " ";
        impressao = delta < 0 ? "A equacao nao tem raizes reais." : impressao;
        impressao = delta == 0 ? String.format("A equacao tem uma raiz real, igual a: %.2f", raiz1) : impressao;
        impressao = delta > 0 ? String.format("A equacao tem duas raizes reais, sao elas: %.2f e %.2f", raiz1, raiz2) : impressao;

        System.out.println(impressao);

    }
}