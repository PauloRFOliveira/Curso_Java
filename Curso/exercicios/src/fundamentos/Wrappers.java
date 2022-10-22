package fundamentos;

import java.util.Scanner;

public class Wrappers
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        //byte
        Byte b = 100;
        //short
        Short s = 1000;
        //int
        Integer i = Integer.parseInt(entrada.nextLine());
        //long
        Long l = 1000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        entrada.close();

        //float
        Float f = 123.45F;
        System.out.println(f);
        //double
        Double d = 147.876;
        System.out.println(d);

        //boolean
        Boolean bo = Boolean.parseBoolean("false");
        System.out.println(bo);

        //char
        Character c = 'A';
        System.out.println(c + "...");
    }
}
