package fundamentos;

public class TipoString
{
    public static void main(String[] args)
    {
        System.out.println("Ola pessoal".charAt(0));

        String s = "Boa tarde";
        System.out.println(s.concat(" !!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;
        System.out.printf("Nome: %s %s têm %d anos e ganha %.2f reais.", nome, sobrenome, idade, salario);
    }
}
