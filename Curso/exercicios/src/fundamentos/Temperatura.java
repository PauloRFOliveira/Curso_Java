package fundamentos;

public class Temperatura
{
    public static void main(String[] args)
    {
        double fahrenheit = 86;
        final int SUBTRACAO = 32;
        final double DIVISAO = 5.0/9.0;
        double celsius = (fahrenheit - SUBTRACAO) * DIVISAO;
        System.out.println("A temperatuda de " + fahrenheit + " graus Fahrenheit, equivale a temperatura de " + celsius + " graus Celsius.");
        fahrenheit = 150;
        celsius = (fahrenheit - SUBTRACAO) * DIVISAO;
        System.out.println("A temperatura de " + fahrenheit + " graus Fahrenheit, equivale a temperatura de " + celsius + " graus Celsius.");
    }
}
