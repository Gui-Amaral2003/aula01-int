package atividades.loja;
import java.util.ArrayList;

public class Carrinho extends Estoque{
    private ArrayList<Produto> carrinho;
    private double valorTotal;

    
    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Carrinho() {
        setCarrinho(carrinho);
        setValorTotal(0);
    }

    public void adicionarProduto(Produto p) {
        if(mudaQuantidade(p.getNome(), p.getQuantidade(), true)) {
            carrinho.add(p);
            setValorTotal(valorTotal + p.getPreco());
        }
    }

    boolean removeProduto(Produto produto) {
        for(Produto p : carrinho) {
            if(p.getNome().equals(produto.getNome())) {
                carrinho.remove(p);
                return true;
            }
        }
        return false;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(valorTotal + "\n");

        for(var produto: carrinho) {
            s.append(produto.getNome())
             .append("\n");
        }
        return s.toString();
    }
}
