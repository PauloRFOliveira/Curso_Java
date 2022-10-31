package oo.heranca;

public class Heroi extends Jogador
{
    public Heroi(int x, int y)
    {
        super(x, y);
    }

    public boolean atacar(Jogador oponente)
    {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaY <= 1 && deltaX <= 1)
        {
            oponente.vida -= 20;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "O herói têm " + vida + " pontos de vida.";
    }
}
