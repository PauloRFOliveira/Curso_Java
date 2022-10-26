package oo.heranca;

public class Jogo
{
    public static void main(String[] args)
    {
        Heroi heroi = new Heroi(10, 20);

        Monstro monstro = new Monstro(10, 19);

        System.out.println(heroi);
        System.out.println(monstro);

        System.out.println(heroi.atacar(monstro));
        System.out.println(monstro.atacar(heroi));

        System.out.println(heroi);
        System.out.println(monstro);
    }
}
