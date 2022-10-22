package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradosCubos
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        double numero = Double.parseDouble(entrada.next());

        entrada.close();

        double quadrado = Math.pow(numero, 2);
        System.out.printf("O quadrado do numero %.2f e igual a: %.2f.\n", numero, quadrado);
        double cubo = Math.pow(numero, 3);
        System.out.printf("O cubo do numero %.2f e igual a: %.2f", numero, cubo);
    }
}
