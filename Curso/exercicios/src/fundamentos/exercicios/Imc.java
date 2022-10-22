package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Imc
{
    public static void main(String[] args)
    {
        String alt = JOptionPane.showInputDialog("Digite a sua altura em centimetros:");
        String pes = JOptionPane.showInputDialog("Digite o seu peso em quilogramas:");

        int peso = Integer.parseInt(pes);
        double altura = Double.parseDouble(alt)/100;

        double imc = peso/Math.pow(altura, 2);
        System.out.println("O seu IMC é igual a: " + imc);

    }
}
