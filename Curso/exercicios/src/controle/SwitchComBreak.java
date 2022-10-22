package controle;

import java.util.Scanner;

public class SwitchComBreak
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = Double.parseDouble(entrada.next());

        entrada.close();

        String conceito = "O conceito e ";

        /**
         Também é possível colocar mais de um case relacionado com as mesmas instruções
         case 10: case 9:
         conceito += "A";
         break;

         OU

         case 10:
         case 9:
         conceito += "A";
         break;
         **/

        switch((int) nota)
        {
            case 10:
                conceito += "A+";
                break;
            case 9:
                conceito += "A";
                break;
            case 8:
                conceito += "B+";
                break;
            case 7:
                conceito += "B";
                break;
            case 6:
                conceito += "C+";
                break;
            case 5:
                conceito += "C";
                break;
            case 4:
                conceito += "D+";
                break;
            case 3:
                conceito += "D";
                break;
            case 2:
                conceito += "E";
                break;
            case 1:
                conceito += "F";
                break;
            case 0:
                conceito += "F-";
                break;
            default:
                conceito = "Nota invalida.";
        }

        System.out.println(conceito);
    }
}
