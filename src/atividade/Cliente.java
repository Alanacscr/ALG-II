package atividade;
public class Cliente {
	private String nome;
	private CarrinhoDeCompras carrinho;

	public Cliente(String nome) {
		this.nome = nome;
		this.carrinho = new CarrinhoDeCompras();
	}

	public void adicionarProdutoAoCarrinho(Produto produto, int quantidade) {
		carrinho.adicionarProduto(produto, quantidade);
	}

	public void removerProdutoDoCarrinho(String nomeProduto) {
		carrinho.removerProduto(nomeProduto);
	}

	public void atualizarQuantidadeNoCarrinho(String nomeProduto, int quantidade) {
		carrinho.atualizarQuantidade(nomeProduto, quantidade);
	}

	public void verCarrinho() {
		carrinho.exibirCarrinho();
	}
}