package exercicio05ao07;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    List<Livro> livros = new ArrayList<>();

    void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.titulo);
    }

    void removerLivro(Livro livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro removido: " + livro.titulo);
        } else {
            System.out.println("Livro não encontrado: " + livro.titulo);
        }
    }

    Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.titulo.equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
