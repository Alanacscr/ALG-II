package atividade3;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Engenharia da Computação");

        Disciplina disciplina1 = new Disciplina("Algoritmos Programação II", 60, "Prof. Alysson");
        Disciplina disciplina2 = new Disciplina("Estruturas de Dados", 80, "Prof. Jocivan");
        Disciplina disciplina3 = new Disciplina("Banco de Dados", 40, "Prof. Alysson");

        curso.adicionarDisciplina(disciplina1);
        curso.adicionarDisciplina(disciplina2);
        curso.adicionarDisciplina(disciplina3);

        Aluno aluno = new Aluno("Alana");
        aluno.matricularDisciplina(disciplina1);
        aluno.matricularDisciplina(disciplina3);

        Coordenador coordenador = new Coordenador(curso);
        coordenador.visualizarDisciplinasAluno(aluno);
    }
}

