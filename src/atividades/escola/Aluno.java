package atividades.escola;

public class Aluno extends Pessoa{
    private final String matricula;
    private int[] notas;

    public Aluno(String RA, String name, int idade, String endereco, String matricula, int[] notas) {
        super(RA, name, idade, endereco);
        this.matricula = matricula;
        setNotas(notas);
    }

    public void setNotas(int[] notas) {
        this.notas = new int[notas.length];

        for(int i = 0; i < notas.length; i++) {
            this.notas[i] = notas[i];
        }
    }

    public int getNotas(int i) {
        return notas[i];
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public void exibirInformacoes() {
        StringBuilder builder = new StringBuilder();

        builder.append(String.format("Aluno: %s, Matricula: %s", getName(), getMatricula()));

        System.out.println(builder.toString());

    }

}
