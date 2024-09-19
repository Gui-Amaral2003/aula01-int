package atividades.gestao;
import java.util.ArrayList;

public class Equipe {
    private ArrayList<Pessoal> equipe;
    private String titulo;
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Equipe(String titulo) {
        setTitulo(titulo);
        equipe = new ArrayList<>();
    }

    public void addPessoa(Pessoal p) {
        equipe.add(p);
    }

    public boolean removePessoa(String id) {
        for(var p : equipe) {
            if(p.getId().equals(id)) {
                equipe.remove(p);
                return true;
            }
        }
        return false;
    }

    public boolean consultaPessoa(Pessoal p) {
        return equipe.contains(p);
    }



    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(titulo + "\n");

        for(var pessoa: equipe) {
            s.append(pessoa)
             .append("\n");
        }
        return s.toString();
    }


}
