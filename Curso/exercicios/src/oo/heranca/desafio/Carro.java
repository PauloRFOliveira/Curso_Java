package oo.heranca.desafio;

public class Carro
{
    int velocidadeAtual;
    final int velocidadeMaxima;
    final int delta;
    boolean ligado = false;
    final String modelo;

    Carro(String modelo, int velocidadeMaxima, int delta)
    {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.delta = delta;
    }

    void ligar()
    {
        ligado = true;
    }

    void desligar()
    {
        ligado = false;
    }

    void acelerar()
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

    void frear()
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
