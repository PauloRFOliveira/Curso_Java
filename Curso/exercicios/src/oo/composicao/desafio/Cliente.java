package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente
{
    final String nome;
    final ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome)
    {
        this.nome = nome;
    }

    void addCompra(Compra compra)
    {
        compras.add(compra);
    }

    double getTotalCliente()
    {
        double total = 0.0;
        for (Compra compra: compras)
        {
            total += compra.getTotalCompra();
        }
        return total;
    }
}
