package oo.heranca.desafio;

public class Corvette extends Carro
{
    public Corvette(String modelo, int velocidadeMaxima, int delta)
    {
        super(modelo, velocidadeMaxima, delta);
    }

    public String toString()
    {
        return "A velocidade atual do Corvette " + modelo + " é de " + velocidadeAtual + " km/h.";
    }
}
