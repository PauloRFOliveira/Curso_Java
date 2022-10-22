package fundamentos;

import java.util.Scanner;

public class TipoStringEquals
{
    public static void main(String[] args)
    {
        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2" == s); //Forma errada de comparar se duas Strings são iguais
        System.out.println("2".equals(s)); //Forma correta de comparar se duas Strings são iguais, por meio do uso do método .equals() das Strings

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next();

        entrada.close();

        System.out.println("2" == s2);
    }
}
