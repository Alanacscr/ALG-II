package atividade1;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        Produto produto1 = new Produto("Camisa", 49.90);
        Produto produto2 = new Produto("Calça", 89.90);
        Produto produto3 = new Produto("Tênis", 199.90);

        carrinho.adicionarProduto(produto1, 1);
        carrinho.adicionarProduto(produto2, 2);
        carrinho.adicionarProduto(produto3, 1);

        carrinho.exibirCarrinho();

        carrinho.atualizarQuantidade("Calça", 1);
        carrinho.exibirCarrinho();

        carrinho.removerProduto("Tênis");
        carrinho.exibirCarrinho();
    }
}

