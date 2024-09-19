package atividades.gestao;

public class Pessoal {
    private String nome;
    private String id;
    private String funcao;

    public String getNome() {
        return nome;
    }
    public String getId() {
        return id;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Pessoal(String nome, String id, String funcao) {
        setFuncao(funcao);
        setId(id);
        setNome(nome);
    }
    public Pessoal(String nome, String id) {
        setNome(nome);
        setId(id);
        setFuncao(null);
    }

    public String toString() {
        return String.format("Nome: %s, ID: %s, função: %s",nome, id, funcao);
    }
    
}
