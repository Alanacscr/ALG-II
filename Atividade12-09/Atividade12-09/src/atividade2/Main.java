package atividade2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.emprestarLivro("1984", "Maria", LocalDate.of(2024, 10, 10));
        biblioteca.emprestarLivro("Dom Casmurro", "João", LocalDate.of(2024, 10, 15));

        biblioteca.listarLivrosEmprestados();

        biblioteca.devolverLivro("1984");
        biblioteca.listarLivrosEmprestados();
    }
}

