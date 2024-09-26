package atividade3;

class Disciplina {
    private String nome;
    private int cargaHoraria;
    private String professorResponsavel;

    public Disciplina(String nome, int cargaHoraria, String professorResponsavel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }
}

