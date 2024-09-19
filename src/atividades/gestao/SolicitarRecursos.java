package atividades.gestao;

public class SolicitarRecursos {
    double valor;
    int dias;
    RecursosDisponiveis rd;

    public SolicitarRecursos(double valor, int dias, RecursosDisponiveis rd) {
        this.rd = rd;
        if(valor > rd.getDinheiro()) {
            throw new IllegalArgumentException("Valor solicitado maior que o disponivel.");
        }
        this.valor = valor;
        this.dias = dias;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return String.format("Valor: %f para %d dias.", valor, dias);
    }


}
