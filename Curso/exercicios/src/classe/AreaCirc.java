package classe;

public class AreaCirc
{
    double raio;
    static final double PI = 3.1415;

    AreaCirc(double raioInicial)
    {
        raio = raioInicial;
    }

    double area()
    {
        double resultado = Math.pow(raio, 2) * PI;
        return resultado;
    }

}
