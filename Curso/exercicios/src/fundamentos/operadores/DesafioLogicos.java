package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos
{
    public static void main(String[] args)
    {
        //Trabalho na terça (V ou F)
        //Trabalho na quinta (V ou F)

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite se o trabalho da terca vai dar certo.");
        boolean terca = entrada.nextBoolean();
        System.out.println("Digite se o trabalho da quinta vai dar certo.");
        boolean quinta = entrada.nextBoolean();
        entrada.close();

        System.out.println("Comprou a televisao de 50 polegadas?");
        boolean tv50 = (terca && quinta);
        System.out.println(tv50);

        System.out.println("Comprou a televisao de 32 polegadas?");
        boolean tv32 = (terca ^ quinta);
        System.out.println(tv32);

        System.out.println("Vamos tomar sorvete?");
        boolean sorvete = (tv50 || tv32);
        System.out.println(sorvete);

        System.out.println("Esta mais saudavel?");
        boolean saude = !sorvete;
        System.out.println(saude);
    }
}
