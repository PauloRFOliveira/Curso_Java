package oo.heranca;

public class Monstro extends Jogador
{
    public Monstro(int x, int y)
    {
        super(x, y);
    }

    public String toString()
    {
        return "O monstro têm " + vida + " pontos de vida.";
    }
}
