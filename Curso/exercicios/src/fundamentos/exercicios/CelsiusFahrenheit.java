package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusFahrenheit
{
    public static void main(String[] args)
    {
        //(68 °C × 9/5) + 32 = 155,3 °F
        final double fator = 9.0/5.0;
        final int correcao = 32;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = Double.parseDouble(entrada.next());

        entrada.close();

        double fahrenheit = (celsius * fator) + correcao;
        System.out.printf("A temperatura de %.1f °C, equivale a temperatura de %.1f °F.", celsius, fahrenheit);
    }
}
