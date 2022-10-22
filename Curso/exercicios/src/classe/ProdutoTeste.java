package classe;

public class ProdutoTeste
{
    public static void main(String[] args)
    {
        Produto p1 = new Produto("Notebook", 4356.89);
        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());
        Produto.alteraDesconto(0.30);
        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());
    }
}
