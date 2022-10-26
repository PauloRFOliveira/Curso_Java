package oo.heranca.desafio;

public class Uno extends Carro
{
    Uno(String modelo, int velocidadeMaxima, int delta)
    {
        super(modelo, velocidadeMaxima, delta);
    }

    public String toString()
    {
        return "A velocidade atual do Uno " + modelo + " é de " + velocidadeAtual + " km/h.";
    }
}
