package atividades.biblioteca;
import java.util.ArrayList;


public class Biblioteca {
    ArrayList<Livro> acervo;

    public Biblioteca() {
        acervo = new ArrayList<Livro>();
    }

    void adicionarLivro(Livro l) {
        //TODO: Verificar duplicacao
        acervo.add(l);
    }

    boolean removerLivro(String index) {

        for(Livro l : acervo) {
            if(index.equals(l.index)) {
                acervo.remove(l);

                return true;
            }
        }

        return false;

    }
    ArrayList<Livro> listaTodos() {
        return acervo;
    }

    ArrayList<Livro> listaEmprestados() {
        var emprestados = new ArrayList<Livro>();

        for(var livro : acervo) {
            if(livro.estaEmprestado()) {
                emprestados.add(livro);
            }
        }
        return emprestados;
    }

    ArrayList<Livro> listaDisponiveis() {
        var disponiveis = new ArrayList<Livro>();

        for(var livro : acervo) {
            if(!livro.estaEmprestado()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    
}
