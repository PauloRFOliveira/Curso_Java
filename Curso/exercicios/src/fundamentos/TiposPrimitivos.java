package fundamentos;

public class TiposPrimitivos
{
    public static void main(String[] args)
    {
        //Informações de um funcionário

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        //Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false;

        //Tipo caractere
        char status = 'A'; //Ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Número de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        //Salário do funcionário
        System.out.println(id + ": ganha -> " + salario);

        //Está de férias?
        System.out.println("Ferias? " + estaDeFerias);

        //SItuação do funcionário
        System.out.println("Status: " + status);
    }
}
