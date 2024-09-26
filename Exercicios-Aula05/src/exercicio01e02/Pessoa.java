package exercicio01e02;

class Pessoa {
    String nome;
    int idade;

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    
    public void cumprimentar() {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");
    }
}
