package atividades.escola;

public class Professor extends Pessoa{
    private double salario;
    private String disciplina;
    
    public Professor(String RA, String name, int idade, String endereco, double salario, String disciplina) {
        super(RA, name, idade, endereco);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    
}
