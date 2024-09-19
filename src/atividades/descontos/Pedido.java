package atividades.descontos;

import java.util.ArrayList;

public abstract class Pedido {
    private int quantidade;
    private double precoUnitario;
    private Cliente cliente;
    private ArrayList<Desconto> descontos;
    private MeioPagamento meioPagamento;
    public enum MeioPagamento {
        DINHEIRO, PIX, CARTAO
    }

    public Pedido(int quantidade, double precoUnitario, Cliente cliente, MeioPagamento meioPagamento) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.cliente = cliente;
        this.meioPagamento = meioPagamento;
        this.descontos = new ArrayList<Desconto>();

        if(cliente.isFidelidade()) {
            descontos.add(new DescontoFixo(this, 0.05));
        }
        if(meioPagamento == MeioPagamento.DINHEIRO || meioPagamento == MeioPagamento.PIX) {
            descontos.add(new DescontoFixo(this, 0.04));
        }
    }

    public void addDesconto(Desconto desconto) {
        descontos.add(desconto);
    }

    public double getDescontoTotal() {
        double total = 0;

        for(Desconto desconto : descontos) {
            total += desconto.getDesconto();
        }

        return total;
    }
    

    public double getPrecoFinal() {
        return this.getPrecoTotal() - this.getDescontoTotal();
    }
    
    public double getPrecoTotal() {
        return quantidade * precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade <= 0) {
            throw new IllegalArgumentException("quantidade negativa.");
        }

        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public abstract double getAcrescimo();

    

    
}
