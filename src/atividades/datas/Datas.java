package atividades.datas;
import java.util.Dictionary;
import java.util.Hashtable;

public class Datas {
    int dia;
    int mes;
    int ano;

    int[] meses31 = new int[]{1, 3, 5, 7, 8, 10, 12};

    public Datas(int dia, int mes, int ano) {
        if(dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia invalido");
        }

        if(mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mes invalido");
        }

        validaAno(ano);

        if(dia == 31 && !testaMes31(mes)) {
            throw new IllegalArgumentException(String.format("O mes %d nao pode receber o dia 31", mes));
        }

        if(mes == 2 && !bissexto(ano) && dia > 28) {
            throw new IllegalArgumentException("dia invalido.");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void validaAno(int ano) {
        if( ano < 0 || ano > 2999) {
            throw new IllegalArgumentException("Ano invalido");
        }
    }

    boolean testaMes31(int mes) {
        for(int m : meses31) {
            if(m == mes) {
                return true;
            }
        }

        return false;
    }

    boolean bissexto(int ano) {
        validaAno(ano);

        if(ano % 4 != 0){
            return false;
        }

        if(ano % 100 != 0) {
            return true;
        }

        return ano % 400 == 0;

    }

    boolean diaAnterior(Datas d) {
        if(d.ano < this.ano) {
            return true;
        }

        else if(this.ano == d.ano) {
            if(d.mes < this.mes) {
                return true;
            }
            else if(d.mes == this.mes && d.dia < this.dia) {
                return true;
            }
        }
        return false;
    }

    boolean diaPosterior(Datas d) {
        if(d.ano > this.ano) {
            return true;
        }

        else if(this.ano == d.ano) {
            if(d.mes > this.mes) {
                return true;
            }
            else if(d.mes == this.mes && d.dia > this.dia) {
                return true;
            }
        }
        return false;
    }

    String nomeDoMes(int mes) {
        Dictionary<Integer, String> dict= new Hashtable<>();
        dict.put(1, "Janeiro");
        dict.put(2, "Fevereiro");
        dict.put(3, "Março");
        dict.put(4, "Abril");
        dict.put(5, "Maio");
        dict.put(6, "Junho");
        dict.put(7, "Julho");
        dict.put(8, "Agosto");
        dict.put(9, "Setembro");
        dict.put(10, "Outubro");
        dict.put(11, "Novembro");
        dict.put(12, "Dezembro");

        return dict.get(mes);
    }

    String converteParaString() {
        return String.format("%d de %s de %d", this.dia, nomeDoMes(this.mes), this.ano);
    }
}
