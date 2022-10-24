package oo.composicao;

public class CarroTeste
{
    public static void main(String[] args)
    {
        Carro Chevette = new Carro();
        System.out.println(Chevette.estaLigado());

        Chevette.ligar();
        System.out.println(Chevette.estaLigado());

        System.out.println(Chevette.engine.rpm());

        Chevette.acelerar();
        Chevette.acelerar();
        Chevette.acelerar();
        Chevette.acelerar();

        System.out.println(Chevette.engine.rpm());

        Chevette.frear();
        Chevette.frear();
        Chevette.frear();
        Chevette.frear();

        System.out.println(Chevette.engine.rpm());
    }
}
