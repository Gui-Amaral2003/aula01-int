package atividades.loja;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, int quantidade, double preco) {

        if(verificaNegativo(quantidade)) {
            throw new IllegalArgumentException("O valor não pode ser negativo");
        }

        if(verificaPreco(preco)) {
            throw new IllegalArgumentException("O valor não pode ser negativo");
        };

        verificaNome(nome);

        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    boolean verificaNegativo(int a) {
        if(a < 0) {
            return true;
        }
        return false;
    }

    boolean verificaPreco(double preco) {
        if(preco < 0.0) {
            return true;
        }
        return false;
    }
    // VERIFICA SE A CARACTERES ESPECIAIS
    void verificaNome(String s) {
        Pattern pattern = Pattern.compile("[^\\w\\s]"); 
        Matcher matcher = pattern.matcher(s);

        if(matcher.find()) {
            throw new IllegalArgumentException("O nome não pode conter caracteres especiais.");
        }
    }
    
    String converteParaString() {
        return String.format("Produto: %s, Quantidade: %d, Preço: %.2f", this.nome, this.quantidade, this.preco);
    }
}
