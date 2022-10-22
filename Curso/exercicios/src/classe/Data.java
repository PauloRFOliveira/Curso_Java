package classe;

public class Data
{
    int dia;
    int mes;
    int ano;

    Data()
    {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String dataFormatada() {
        String retorno;
        if(dia < 10 && mes < 10)
        {
            retorno = String.format("0%d/0%d/%d", dia, mes, ano);
        }
        else if(dia < 10)
        {
            retorno = String.format("0%d/%d/%d", dia, mes, ano);
        }
        else if(mes < 10)
        {
            retorno = String.format("%d/0%d/%d", dia, mes, ano);
        }
        else
        {
            retorno = String.format("%d/%d/%d", dia, mes, ano);
        }
        return retorno;
    }
}
