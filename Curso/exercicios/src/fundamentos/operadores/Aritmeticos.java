package fundamentos.operadores;

public class Aritmeticos
{
    public static void main(String[] args)
    {
        System.out.println(2 + 3);

        var x = 34.56;
        double y = 2.2;

        //Como dentre os tipos das variáveis operadas, o que carrega mais informações é o double, o resultado das operações será um double.
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        //Como dentre os tipos das variáveis operadas, o que carrega mais informações é o int, o resulta das operações será um int.
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        //Fazendo o uso do método CAST de conversão para obter o resultado completo da operação de divisão.
        System.out.println(a / (double) b);
        //Operador de resto da divisão inteira entre dois números.
        System.out.println(a % b);
    }
}
