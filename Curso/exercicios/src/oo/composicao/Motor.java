package oo.composicao;

public class Motor
{
    final Carro carro;
    boolean ligado = false;
    double aceleracao = 1;

    Motor(Carro carro)
    {
        this.carro = carro;
    }

    int rpm()
    {
        if (ligado)
        {
            return (int) Math.round(aceleracao * 800);
        }
        else
        {
            return 0;
        }
    }
}
