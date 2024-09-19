package atividades.gestao;
import java.util.ArrayList;


public class RecursosDisponiveis {
    private double dinheiro;
    private ArrayList<SolicitarRecursos> solicitacoes;

    public double getDinheiro() {
        return dinheiro;
    }

    public RecursosDisponiveis(double dinheiro) {
        this.dinheiro = dinheiro;
        solicitacoes = new ArrayList<>();
    }

    public boolean removeDinheiro(double valor) {
        if(valor < dinheiro){
            dinheiro -= valor;
            return true;
        }
        return false;
    }
    public boolean adicionaDinheiro(double valor) {
        dinheiro += valor;
        return true;
    }
    public void adicionarSolicitacao(SolicitarRecursos sr) {
        solicitacoes.add(sr);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(dinheiro + "\n");

        for(var solicitacao: solicitacoes) {
            s.append(solicitacao)
             .append("\n");
        }
        return s.toString();
    }

}
