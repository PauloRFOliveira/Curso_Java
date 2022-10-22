package fundamentos.conversoes;

import javax.swing.JOptionPane;

public class ConversaoStringNumero
{
    public static void main(String[] args)
    {
        //Entrada sendo realizada por meio de uma janela criada e não pelo console.
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

        //Prova de que temos 2 Strings, pois acontece a concatenação das duas variáveis e não soma, que aconteceria se fossem 2 números.
        System.out.println(valor1 + valor2);

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double soma = num1 + num2;
        double media = soma/2;

        System.out.printf("A soma dos dois numeros e: %f e a sua media e: %f", soma, media);
    }
}
