package classe;

public class DataTeste
{
    public static void main(String[] args)
    {
        Data nascimento = new Data(12, 07, 1998);
        Data namoro = new Data(10, 9, 2021);
        Data testeConstrutorPadrao = new Data();

        System.out.println(nascimento.dataFormatada());
        System.out.println(namoro.dataFormatada());
        System.out.println(testeConstrutorPadrao.dataFormatada());
    }
}
