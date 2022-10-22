package fundamentos.conversoes;

public class ConversaoNumeroString
{
    public static void main(String[] args)
    {
        //Conversão criando uma instância inteira na classe wrapper Integer e então usando métodos dessa classe.
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        //Conversão se utilizando dos métodos da classe wrapper Integer, mas sem fazer a criação de uma instância dessa classe.
        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        //Método de conversão onde fazemos uso de uma operação de concatenação "vazia" para realizar a conversão de número para String, seja o número do tipo primitivo, ou da classe wrapper.
        System.out.println(("" + num2).length());
    }
}
