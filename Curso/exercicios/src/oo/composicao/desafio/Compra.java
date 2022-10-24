package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra
{
    final ArrayList<Item> items = new ArrayList<>();

    void addItem(Item item)
    {
        items.add(item);
    }

    double getTotalCompra()
    {
        double total = 0.0;
        for (Item item: items)
        {
            total += item.getTotalItem();
        }
        return total;
    }
}
