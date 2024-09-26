package exercicio04;

class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    boolean foiAprovado() {
        return calcularMedia() >= 7;
    }
}
