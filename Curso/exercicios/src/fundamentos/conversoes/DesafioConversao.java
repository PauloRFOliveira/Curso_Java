package fundamentos.conversoes;

import java.util.Scanner;

public class DesafioConversao
{
    public static void main(String[] args)
    {
        //Entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os valores referentes aos 3 salarios.");
        String salario1 = entrada.nextLine();
        String salario2 = entrada.nextLine();
        String salario3 = entrada.nextLine();
        entrada.close();
        //Converte o formato de separação da parte inteira e decimal para o formato padrão do computador
        salario1 = salario1.replace(',', '.');
        salario2 = salario2.replace(',', '.');
        salario3 = salario3.replace(',', '.');
        //Converte as Strings em valores numéricos
        double num1 = Double.parseDouble(salario1);
        double num2 = Double.parseDouble(salario2);
        double num3 = Double.parseDouble(salario3);
        //Realiza as operações necessárias
        double soma = num1 + num2 + num3;
        double media = soma/3;
        System.out.printf("A media dos 3 salarios e igual a: %.2f", media);
    }
}
