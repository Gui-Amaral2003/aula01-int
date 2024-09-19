package atividades.descontos;

public abstract class Desconto {
    protected Pedido pedido;

    public Desconto(Pedido pedido) {
        this.pedido = pedido;
    }
    //Calcula o valor monetario do desconto que deve ser posteriormente subtraido do valor do pedido
    public abstract double getDesconto();
}
