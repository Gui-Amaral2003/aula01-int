package atividades.biblioteca;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    //TODO: Validar ISDN
    String index;
    boolean emprestado;


    public Livro(String titulo, String autor, int anoPublicacao, String index) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.index = index;
        this.emprestado = false;
    }

    void emprestar() {
        if(estaEmprestado()) {
            throw new IllegalStateException("O livro esta emprestado.");
        }

        this.emprestado = true;
    }

    void devolver() {
        if(!estaEmprestado()) {
            throw new IllegalStateException("O livro nao esta disponivel.");
        }

        this.emprestado = false;
    }

    boolean estaEmprestado() {
        return emprestado;
    }

    String converteParaString() {
        return String.format("%s. %s. (%d). ISDN: %s", this.autor, this.titulo, this.anoPublicacao, this.index);
    }

}

