package fundamentos.operadores;

public class DesafioAritmeticos
{
    public static void main(String[] args)
    {
        int a = 3 + 2;
        int b = (int) Math.pow(6 * a, 2);
        int c = 3 * 2;
        int d = b / c;
        int e = 1 - 5;
        int f = 2 - 7;
        int g = (int) Math.pow(e * f/2, 2);
        int h = (int) Math.pow(d - g, 3);
        int i = h / (int) Math.pow(10, 3);
        System.out.println(i);

        int j = ((int) Math.pow(((((int) Math.pow(6*(3+2), 2))/(3*2))-((int) Math.pow(((1-5)*(2-7))/(2), 2))), 3))/(int) Math.pow(10, 3);
        System.out.println(j);
    }
}
