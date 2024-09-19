package atividades.gestao;

public class App {
    public static void main(String[] args) {
        Pessoal p1 = new Pessoal("Guilherme", "01");
        Pessoal p2 = new Pessoal("João", "02");
        Equipe e1 = new Equipe("Vendas");
        Equipe e2;
        e1.addPessoa(p1);
        e1.addPessoa(p2);
        e2 = e1;

        System.out.println(e1.consultaPessoa(p2));
        System.out.println(e2.toString());
    }
}
