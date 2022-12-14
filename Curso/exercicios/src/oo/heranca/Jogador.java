package oo.heranca;

public class Jogador
{
    int x;
    int y;
    public int vida = 100;

    protected Jogador(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void andar(Direcao direcao)
    {
        if (this.podeAndar(direcao))
        {
            switch (direcao) {
                case NORTE:
                    y++;
                    break;
                case SUL:
                    y--;
                    break;
                case LESTE:
                    x++;
                    break;
                case OESTE:
                    x--;
                    break;
            }
        }
    }

    private boolean podeAndar(Direcao direcao)
    {
        if (direcao == Direcao.NORTE && y < 100)
        {
            return true;
        }
        else if (direcao == Direcao.SUL && y > 0)
        {
            return true;
        }
        else if (direcao == Direcao.LESTE && x < 100)
        {
            return true;
        }
        else if (direcao == Direcao.OESTE && x > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean atacar(Jogador oponente)
    {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaY <= 1 && deltaX <= 1)
        {
            oponente.vida -= 10;
            return true;
        }
        else
        {
            return false;
        }
    }
}
