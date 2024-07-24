package atividades.biblioteca;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("LODR", "J. R. R. Tolkien", 1954, "123");
        Livro livro2 = new Livro("O Hobbit", "J. R. R. Tolkien", 1957, "456");
        Livro livro3 = new Livro("Don Quixote", "Miguel", 1235, "789");
        Livro livro4 = new Livro("Guerra e Paz", "Lev", 1864, "325");
        Livro livro5 = new Livro("100 anos de solidão", "Gabriel", 1234, "657");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        livro1.emprestar();
        livro2.emprestar();
        livro3.emprestar();
        livro1.devolver();

        System.out.println("Livros emprestados: ");

        for(Livro livro : biblioteca.listaEmprestados()) {
            System.out.println(livro.converteParaString());
        }

        System.out.println("\nLivros disponiveis");

        for(Livro livro: biblioteca.listaDisponiveis()) {
            System.out.println(livro.converteParaString());
        }

    }
}
