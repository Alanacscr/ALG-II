package atividade;
public class Main {
    public static void main(String[] args) {
        // Meus produtos
        Produto produto1 = new Produto("Camisa", 50.0);
        Produto produto2 = new Produto("Calca", 100.0);
        Produto produto3 = new Produto("Tenis", 200.0);

        
        Cliente mateus = new Cliente("Mateus");

        // Mateus adiciona produtos no carrinho
        mateus.adicionarProdutoAoCarrinho(produto1, 2);  // 2 Camisas
        mateus.adicionarProdutoAoCarrinho(produto2, 1);  // 1 Calça

        
        mateus.verCarrinho();

        // Mateus atualiza a quantidade de camisas para 1
        mateus.atualizarQuantidadeNoCarrinho("Camisa", 1);

        // Ver o carrinho atualizado
        mateus.verCarrinho();

        // Mateus remove a calça
        mateus.removerProdutoDoCarrinho("Calca");

        // Ver o carrinho final
        mateus.verCarrinho();
    }
}