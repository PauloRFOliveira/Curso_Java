package oo.encapsulamento.casaA;

public class Paulo
{
    Ana esposa = new Ana();

    void testeAcessos()
    {
        //A linha seguinte resulta em erro, pois o atributo segredo é privado, portanto, acessível apenas na classe Ana.
        //System.out.println(esposa.segredo);

        //Na linha seguinte o atributo pode ser acessado normalmente, pois têm a visibilidade dentro do seu pacote e as duas classes estão no mesmo pacote.
        System.out.println(esposa.facoDentroDeCasa);

        //Na linha seguinte o atributo pode ser acessado normalmente, embora seja protegido, pois, as duas classes estão no mesmo pacote.
        System.out.println(esposa.formaDeFalar);

        //Na linha seguinte o atributo pode ser acessado normalmente, pois, trata-se de um atributo público.
        System.out.println(esposa.todosSabem);
    }
}
