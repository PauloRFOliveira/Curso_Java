package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia
{
    Ana sogra = new Ana();

    void testeAcessos()
    {
        //Na linha seguinte não poderá ser realizado o acesso ao atributo segredo, pois, trata-se de um atributo privado, visível apenas dentro da sua própria classe.
        //System.out.println(sogra.segredo);

        //Na linha seguinte não poderá ser realizado o acesso ao atributo facoDentroDeCasa, pois, trata-se de um atributo visível apenas dentro do seu pacote e as duas classes estão em
        //pacotes separados.
        //System.out.println(sogra.facoDentroDeCasa);

        //Na linha seguinte não poderá ser realizado o acesso ao atributo formaDeFalar, pois, trata-se de um atributo protegido, visível no mesmo pacote ou obtido por herança.
        //System.out.println(sogra.formaDeFalar);

        //Na linha seguinte poderá ser realizado o acesse ao atributo todosSabem, pois, trata-se de um atributo público, visível à todas as outras classes.
        System.out.println(sogra.todosSabem);
    }
}
