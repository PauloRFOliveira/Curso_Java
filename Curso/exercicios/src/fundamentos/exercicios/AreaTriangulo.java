package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class AreaTriangulo
{
    public static void main(String[] args)
    {
        String bas = JOptionPane.showInputDialog("Digite o valor referente a base do triangulo.");
        String alt = JOptionPane.showInputDialog("Digite o valor referente a altura do triangulo.");

        double base = Double.parseDouble(bas);
        double altura = Double.parseDouble(alt);
        double area = (base * altura)/2;

        System.out.printf("O triangulo de base %.2f e altura %.2f ocupa uma area igual a: %.2f.", base, altura, area);
    }
}
