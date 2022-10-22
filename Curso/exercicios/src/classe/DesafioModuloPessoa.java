package classe;

public class DesafioModuloPessoa
{
    String nome;
    double peso;

    DesafioModuloPessoa(String nome, double peso)
    {
        this.nome = nome;
        this.peso = peso;
    }

    String comer(DesafioModuloComida comida)
    {
        String linha1 = String.format(this.nome + " pesa " + this.peso + " quilos.\n");
        String linha2 = String.format(this.nome + " comeu " + comida.peso + " quilos de " + comida.nome + ".\n");
        this.peso += comida.peso;
        String linha3 = String.format("Depois de comer " + comida.nome + ", " + this.nome + " ficou com " + this.peso + " quilos.");
        String retorno = String.format(linha1 + linha2 + linha3);
        return retorno;
    }
}
