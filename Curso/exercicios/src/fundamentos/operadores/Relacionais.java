package fundamentos.operadores;

public class Relacionais
{
    public static void main(String[] args)
    {
        int a = 97;
        int b = 'a';//A letra "a" têm o valor inteiro 97 associado a ela na tabela unicode, então o inteiro guardado nessa variável é o 97.

        System.out.println(a == b);
        System.out.println(30 != 7);
        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7.0;
        boolean temDesconto = bomComportamento && passouPorMedia;
        System.out.println("Tem desconto? " + temDesconto);
    }
}
