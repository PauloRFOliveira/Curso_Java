package fundamentos.conversoes;

public class ConversaoTipoPrimitivoNumerico
{
    public static void main(String[] args)
    {
        //Conversão implícita de um int em um double
        double a = 1;
        System.out.println(a);

        //Conversão explícita de um double em um float
        float b = 1.0F; //Ou float b = (float) 1.0; (Método CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);
    }
}
