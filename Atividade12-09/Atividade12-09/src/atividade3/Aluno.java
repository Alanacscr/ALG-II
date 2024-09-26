package atividade3;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
        System.out.println("Aluno " + nome + " matriculado em: " + disciplina.getNome());
    }

    public int calcularHorasCursadas() {
        int totalHoras = 0;
        for (Disciplina disciplina : disciplinasMatriculadas) {
            totalHoras += disciplina.getCargaHoraria();
        }
        return totalHoras;
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }
}

