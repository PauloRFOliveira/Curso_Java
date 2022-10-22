package classe;

public class DesafioModuloJantar
{
    public static void main(String[] args)
    {
        DesafioModuloPessoa eu = new DesafioModuloPessoa("Paulo", 108.4);
        DesafioModuloComida comida1 = new DesafioModuloComida("Lasanha", 0.3);
        DesafioModuloComida comida2 = new DesafioModuloComida("Cocada", 0.125);

        System.out.println(eu.comer(comida1));
        System.out.println();
        System.out.println(eu.comer(comida2));
    }
}
