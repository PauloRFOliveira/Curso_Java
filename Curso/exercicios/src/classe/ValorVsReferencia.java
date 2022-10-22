package classe;

public class ValorVsReferencia
{
    public static void main(String[] args)
    {
        double a = 2;
        double b = a; //Atribuição por valor

        a++;
        b--;

        System.out.println("Valor de a: " + a + ", valor de b: " + b);

        Data d1 = new Data();
        Data d2 = d1; //Atribuição por referência

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2046;

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        voltarDataPadrao(d1);
        voltarDataPadrao(d2);

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
    }

    static void voltarDataPadrao(Data a)
    {
        a.dia = 1;
        a.mes = 1;
        a.ano = 1970;
    }
}
