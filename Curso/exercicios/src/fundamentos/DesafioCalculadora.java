package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora
{
    public static void main(String[] args)
    {
        // Ler num 1
        // Ler num 2
        // Operar + - * / %

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite a operacao desejada dentre as seguintes (+. -, *, /, %): ");
        String operacao = entrada.next();

        entrada.close();

        boolean adicao = operacao.equals("+");
        boolean subtracao = operacao.equals("-");
        boolean multiplicacao = operacao.equals("*");
        boolean divisao = operacao.equals("/");
        boolean resto = operacao.equals("%");

        double resultado = 0.0;

        resultado = adicao ? num1 + num2 : resultado;
        resultado = subtracao ? num1 - num2 : resultado;
        resultado = multiplicacao ? num1 * num2 : resultado;
        resultado = divisao ? num1 / num2 : resultado;
        resultado = resto ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
    }
}