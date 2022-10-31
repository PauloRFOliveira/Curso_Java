package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana
{
    Ana mae = new Ana();

    void testeAcessos()
    {
        //A linha seguinte não vai poder ser executada, pois, o atributo segredo é um atributo privado, visível apenas na classe Ana.
        //System.out.println(mae.segredo);

        //A linha seguinte não pode ser executada, pois, o atributo facoDentroDeCasa é um atributo com o modificador de acesso default, visível apenas dentro do seu pacote.
        //System.out.println(mae.facoDentroDeCasa);

        //A linha seguinte não pode ser executada, pois, o atributo formaDeFalar mesmo sendo protegido, que deveria ser passado por herança, tem a tentativa de acesso realizada a partir
        // de uma instância da classe Ana e não a própria classe.
        //System.out.println(mae.formaDeFalar);

        //A forma correta de fazer acesso aos atributos e métodos herdados deve ser feita a partir do próprio objeto, como que se usasse o this.
        System.out.println(formaDeFalar);

        //Por ser parte da herança da classe Ana, o atributo todosSaber pode ser acessado a partir do próprio objeto, como que se usasse o this, mas devido a ser um atributo público,
        // pode ser acessado a partir de um abjeto instanciado da classe Ana normalmente.
        System.out.println(todosSabem);
        System.out.println(mae.todosSabem);
    }
}
