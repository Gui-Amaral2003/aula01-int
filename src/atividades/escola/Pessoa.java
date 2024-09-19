package atividades.escola;

public abstract class Pessoa {
    protected final String RA;
    protected String name;
    protected int idade;
    protected String endereco;

    public Pessoa(String RA, String name, int idade, String endereco) {
        setName(name);
        this.RA = RA;
        setIdade(idade);
        setEndereco(endereco);
    }

    public String getRA() {
        return RA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public abstract void exibirInformacoes();

    
}
