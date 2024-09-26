package exercicio05ao07;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Livro livroBuscado = biblioteca.buscarLivroPorTitulo("1984");
        if (livroBuscado != null) {
            System.out.println("Livro encontrado:");
            livroBuscado.exibirDetalhes();
        } else {
            System.out.println("Livro não encontrado.");
        }

        biblioteca.removerLivro(livro1);
    }
}
