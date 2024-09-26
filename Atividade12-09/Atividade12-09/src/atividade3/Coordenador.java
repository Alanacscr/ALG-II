package atividade3;

class Coordenador {
    private Curso curso;

    public Coordenador(Curso curso) {
        this.curso = curso;
    }

    public void visualizarDisciplinasAluno(Aluno aluno) {
        System.out.println("Disciplinas do aluno " + aluno.getNome() + ":");
        for (Disciplina disciplina : aluno.getDisciplinasMatriculadas()) {
            System.out.println("- " + disciplina.getNome());
        }
        System.out.println("Horas cursadas: " + aluno.calcularHorasCursadas());

        System.out.println("Disciplinas restantes:");
        for (Disciplina disciplina : curso.getDisciplinas()) {
            if (!aluno.getDisciplinasMatriculadas().contains(disciplina)) {
                System.out.println("- " + disciplina.getNome());
            }
        }
    }
}

