package oo.composicao;

public class Carro
{
    final Motor engine;

    Carro()
    {
        this.engine = new Motor(this);
    }

    void acelerar()
    {
        if (engine.aceleracao <= 6.5)
        {
            engine.aceleracao += 0.5;
        }
    }

    void frear()
    {
        if (engine.aceleracao >= 0.5)
        {
            engine.aceleracao -= 0.5;
        }
    }

    void ligar()
    {
        engine.ligado = true;
    }

    void desligar()
    {
        engine.ligado = false;
    }

    boolean estaLigado()
    {
        return engine.ligado;
    }
}
