package oo.heranca.desafio;

public class Civic extends Carro
{
    public Civic(String modelo, int velocidadeMaxima, int delta)
    {
        super(modelo, velocidadeMaxima, delta);
    }

    public String toString()
    {
        return "A velocidade atual do Civic " + modelo + " é de " + velocidadeAtual + " km/h.";
    }
}
