package fundamentos;

public class PrimitivoVsObjeto
{
    public static void main(String[] args)
    {
        String s = "texto";
        s = s.toUpperCase();

        //Wrappers são as versões objetos dos tipos básicos
        int a = 123;
        System.out.println(a);
    }
}
