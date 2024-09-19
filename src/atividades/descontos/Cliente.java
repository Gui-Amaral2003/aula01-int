package atividades.descontos;

public class Cliente {
    private String nome;
    private String email;
    private boolean fidelidade;

    Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


    public void fidelizar() {
        fidelidade = true;
    }

    public void desfidelizar() {
        fidelidade = false;
    }

    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }

    public boolean isFidelidade() {
        return fidelidade;
    }

    
}
