package atividades.loja;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> armazem;
    private Produto padrao = new Produto("", 0, 0);

    public Estoque() {
        this.armazem = new ArrayList<>();
    }
    
    void adicionarProduto(Produto p) {
        armazem.add(p);
    }

    boolean removeProduto(Produto produto) {
        for(Produto p : armazem) {
            if(p.getNome().equals(produto.getNome())) {
                armazem.remove(p);
                return true;
            }
        }
        return false;
    }

    boolean mudarPreco(String nome, double novoPreco) {
        for(Produto p : armazem) {
            if(nome.equals(p.getNome())) {
                p.setPreco(novoPreco);

                return true;
            }
        }
        return false;
    }

    public boolean mudaQuantidade(String nome, int quantidade, boolean venda) {
        if(venda) {
            for(Produto p : armazem) {
                if(nome.equals(p.getNome())) {
                    if(p.getQuantidade() - quantidade < 0) {
                        System.out.println("Venda maior que o armazenado.");
                        return false;
                    }
                    p.setQuantidade(p.getQuantidade() - quantidade);
                    if(p.getQuantidade() == 0) {
                        removeProduto(p);
                    }
                    return true;
                }
            }
        }
        else {
            for(Produto p : armazem) {
                if(nome.equals(p.getNome())) {
                    p.setQuantidade(p.getQuantidade() + quantidade);
                    return true;
                }
            }
        }
        return false;
    }

    ArrayList<Produto> listarProdutos() {
        return armazem;
    }

    Produto consultaProduto(String nome) {
        for(Produto p : armazem) {
            if(nome.equals(p.getNome())) {
                return p;
            }
        }
        return padrao;
    }


    public boolean checaOperacao(boolean b) {
        if(b) {
            return true;
        }
        else {
            return false;
        }
    } 
}
