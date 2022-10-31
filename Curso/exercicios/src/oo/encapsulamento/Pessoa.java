package oo.encapsulamento;

public class Pessoa
{
    private int idade;

    public Pessoa(int idade)
    {
        setIdade(idade);
    }

    public int getIdade()
    {
        return idade;
    }

    public boolean setIdade(int idade)
    {
        if (idade > 0 && idade <= 120 && idade > this.idade)
        {
            this.idade = idade;
            return true;
        }
        else
        {
            return false;
        }
    }
}
