package atividade1;

import java.util.ArrayList;
import java.util.List;

class Carrinho {
    private List<ItemCarrinho> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getNome().equals(produto.getNome())) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                System.out.println("Atualizada a quantidade do produto: " + produto.getNome());
                return;
            }
        }
        itens.add(new ItemCarrinho(produto, quantidade));
        System.out.println("Produto adicionado ao carrinho: " + produto.getNome());
    }

    public void removerProduto(String nomeProduto) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getProduto().getNome().equals(nomeProduto)) {
                itens.remove(i);
                System.out.println("Produto removido do carrinho: " + nomeProduto);
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho: " + nomeProduto);
    }

    public void atualizarQuantidade(String nomeProduto, int novaQuantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getNome().equals(nomeProduto)) {
                item.setQuantidade(novaQuantidade);
                System.out.println("Quantidade atualizada para: " + nomeProduto + " - " + novaQuantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho: " + nomeProduto);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.calcularPrecoTotal();
        }
        return total;
    }

    public void exibirCarrinho() {
        System.out.println("Itens no Carrinho:");
        for (ItemCarrinho item : itens) {
            System.out.println("- " + item.getProduto().getNome() + " | Quantidade: " + item.getQuantidade() + " | Preço Total: R$" + item.calcularPrecoTotal());
        }
        System.out.println("Total a pagar: R$" + calcularTotal());
    }
}

