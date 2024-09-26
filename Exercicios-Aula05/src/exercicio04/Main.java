package exercicio04;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Maria";
        aluno.nota1 = 8.0;
        aluno.nota2 = 6.5;

        System.out.println("Média: " + aluno.calcularMedia());
        if (aluno.foiAprovado()) {
            System.out.println(aluno.nome + " foi aprovado(a).");
        } else {
            System.out.println(aluno.nome + " não foi aprovado(a).");
        }
    }
}
