package atividade2;

import java.time.LocalDate;

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;
    private String nomeEmprestado;
    private LocalDate dataDevolucao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar(String nome, LocalDate dataDevolucao) {
        this.emprestado = true;
        this.nomeEmprestado = nome;
        this.dataDevolucao = dataDevolucao;
    }

    public void devolver() {
        this.emprestado = false;
        this.nomeEmprestado = null;
        this.dataDevolucao = null;
    }

    public String getNomeEmprestado() {
        return nomeEmprestado;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public String exibirDetalhes() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao + ", Emprestado: " + (emprestado ? "Sim" : "Não");
    }
}
