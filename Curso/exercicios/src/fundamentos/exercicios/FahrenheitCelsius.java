package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitCelsius
{
    public static void main(String[] args)
    {
        //(32 °F − 32) × 5/9 = 0 °C
        final int correcao = 32;
        final double fator = 5.0/9.0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = Double.parseDouble(entrada.next());

        entrada.close();

        double celsius = (fahrenheit - correcao) * fator;

        System.out.printf("A temperatura de %.1f°F equivale a %.1f°C", fahrenheit, celsius);
    }
}