package atividades.descontos;

public class DescontoCompreAlgunsPagueMenos extends Desconto{
    private int quantidadeMinima;

    public DescontoCompreAlgunsPagueMenos(Pedido pedido, int quantidadeMinima) {
        super(pedido);
        this.quantidadeMinima = quantidadeMinima;
    }
    @Override
    public double getDesconto() {
        return pedido.getQuantidade() / quantidadeMinima * pedido.getPrecoUnitario();
    }
}
