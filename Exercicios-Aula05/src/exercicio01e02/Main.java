package exercicio01e02;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();

        pessoa.nome = "João";
        pessoa.idade = 25;

        pessoa.exibirInformacoes();
        pessoa.cumprimentar();
	}

}
