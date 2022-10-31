package oo.heranca.desafio;

public class Carro
{
    public int velocidadeAtual;
    public final int velocidadeMaxima;
    private final int delta;
    public boolean ligado = false;
    public final String modelo;

     protected Carro(String modelo, int velocidadeMaxima, int delta)
    {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.delta = delta;
    }

    public void ligar()
    {
        ligado = true;
    }

    public void desligar()
    {
        ligado = false;
    }

    public void acelerar()
    {
        if (ligado)
        {
            if (velocidadeAtual + delta > velocidadeMaxima)
            {
                velocidadeAtual = velocidadeMaxima;
            }
            else
            {
                velocidadeAtual += delta;
            }
        }
    }

    public void frear()
    {
        if (velocidadeAtual - delta < 0)
        {
            velocidadeAtual = 0;
        }
        else
        {
            velocidadeAtual -= delta;
        }
    }
}
