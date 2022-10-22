package fundamentos;

import java.util.Scanner;

public class Console
{
    public static void main(String[] args)
    {
        System.out.print("Bom");
        System.out.print(" dia!");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Resultado da Mega Sena:\n%d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salario: %.2f\n", 1234.5678);

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.printf("Nome: %s %s\nIdade: %d anos\n", nome, sobrenome, idade);

        entrada.close();
    }
}
