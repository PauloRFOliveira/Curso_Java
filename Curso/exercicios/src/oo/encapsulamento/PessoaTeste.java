package oo.encapsulamento;

public class PessoaTeste
{
    public static void main(String[] args)
    {
        Pessoa p1 = new Pessoa(30);

        //Não é ideal que o valor do atributo idade de uma Pessoa possa ser alterado livremente, sem validação ou discrição.
        //p1.idade = -12;

        //Bem como é importante para o encapsulamento que a forma de ler o conteúdo de uma variável ocorra de maneira mais segura.
        //System.out.println(p1.idade);

        //Depois da aplicação dos conceitos de getters e setters faremos a manipulação de varíveis fazendo o uso dos determinados métodos.

        //Getter de idade
        System.out.println(p1.getIdade());

        //Setter de idade (incluindo eventuais testes e validações sobre o valor de tal atributo)
        System.out.println(p1.setIdade(31));
        System.out.println(p1.setIdade(-1));
        System.out.println(p1.setIdade(198));
        System.out.println(p1.setIdade(19));

        System.out.println(p1.getIdade());
    }
}
