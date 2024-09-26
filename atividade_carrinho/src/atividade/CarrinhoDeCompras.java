package atividade;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getNome().equals(produto.getNome())) {
                // Se o produto já está no carrinho, atualiza a quantidade
                item.setQuantidade(item.getQuantidade() + quantidade);
                return;
            }
        }
        // Se o produto ainda não está no carrinho, adiciona um novo item
        itens.add(new ItemCarrinho(produto, quantidade));
    }

    
    public void removerProduto(String nomeProduto) {
        itens.removeIf(item -> item.getProduto().getNome().equals(nomeProduto));
    }

    public void atualizarQuantidade(String nomeProduto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getNome().equals(nomeProduto)) {
                item.setQuantidade(quantidade);
                if (quantidade == 0) {
                    removerProduto(nomeProduto);  
                }
                return;
            }
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemCarrinho item : itens) {
            total += item.getTotal();
        }
        return total;
    }

    public void exibirCarrinho() {
        System.out.println("Itens no carrinho:");
        for (ItemCarrinho item : itens) {
            System.out.println(item.getProduto().getNome() + " - " + item.getQuantidade() + " unidades - R$ " + item.getTotal());
        }
        System.out.println("Total a pagar: R$ " + calcularTotal());
    }
}
