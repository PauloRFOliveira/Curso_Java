package classe;

public class Produto
{
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto()
    {

    }

    Produto(String nomeInicial, double precoInicial)
    {
        nome = nomeInicial;
        preco = precoInicial;
    }

    static void alteraDesconto(double novoDesconto)
    {
        Produto.desconto = novoDesconto;
    }

    double precoComDesconto()
    {
        double resultado = preco * (1.0 - desconto);
        return resultado;
    }

    double precoComDesconto(double descontoDoGerente)
    {
        double resultado = preco * (1.0 - desconto - descontoDoGerente);
        return resultado;
    }
}
