package atividade2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public boolean emprestarLivro(String titulo, String nome, LocalDate dataDevolucao) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isEmprestado()) {
                livro.emprestar(nome, dataDevolucao);
                System.out.println("Livro emprestado: " + titulo + " para " + nome);
                return true;
            }
        }
        System.out.println("Livro não disponível para empréstimo: " + titulo);
        return false;
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isEmprestado()) {
                livro.devolver();
                System.out.println("Livro devolvido: " + titulo);
                return;
            }
        }
        System.out.println("Livro não encontrado ou não está emprestado: " + titulo);
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros emprestados:");
        for (Livro livro : livros) {
            if (livro.isEmprestado()) {
                System.out.println(livro.exibirDetalhes());
            }
        }
    }
}

