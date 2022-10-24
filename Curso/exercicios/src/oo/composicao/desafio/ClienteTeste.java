package oo.composicao.desafio;

public class ClienteTeste
{
    public static void main(String[] args)
    {
        Produto produto1 = new Produto("Lapis", 0.99);
        Produto produto2 = new Produto("Caneta", 1.99);
        Produto produto3 = new Produto("Borracha", 1.65);
        Produto produto4 = new Produto("Apontador", 1.49);

        Item item1 = new Item(produto1, 9);
        Item item2 = new Item(produto2, 9);
        Item item3 = new Item(produto3, 9);
        Item item4 = new Item(produto4, 9);

        Compra compra1 = new Compra();
        compra1.addItem(item1);
        compra1.addItem(item2);
        compra1.addItem(item3);
        compra1.addItem(item4);

        Item item5 = new Item(produto1, 8);
        Item item6 = new Item(produto2, 8);
        Item item7 = new Item(produto3, 8);
        Item item8 = new Item(produto4, 8);

        Compra compra2 = new Compra();
        compra2.addItem(item5);
        compra2.addItem(item6);
        compra2.addItem(item7);
        compra2.addItem(item8);

        Cliente cliente1 = new Cliente("Paulo");
        cliente1.addCompra(compra1);
        cliente1.addCompra(compra2);

        System.out.println(cliente1.getTotalCliente());

        System.out.println();

        System.out.println(compra1.getTotalCompra());
        System.out.println(item1.getTotalItem());
        System.out.println(item2.getTotalItem());
        System.out.println(item3.getTotalItem());
        System.out.println(item4.getTotalItem());

        System.out.println();

        System.out.println(compra2.getTotalCompra());
        System.out.println(item5.getTotalItem());
        System.out.println(item6.getTotalItem());
        System.out.println(item7.getTotalItem());
        System.out.println(item8.getTotalItem());
    }
}
