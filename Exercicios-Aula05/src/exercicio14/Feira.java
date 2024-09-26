package exercicio14;

import java.util.ArrayList;
import java.util.List;

class Feira {
    private List<Produto> estoque;
    private List<Venda> vendas;

    public Feira() {
        estoque = new ArrayList<>();
        vendas = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    public void registrarVenda(String nomeProduto, int quantidadeVendida) {
        for (Produto produto : estoque) {
            if (produto.getNome().equals(nomeProduto)) {
                Venda venda = new Venda(produto, quantidadeVendida);
                vendas.add(venda);
                System.out.println("Venda registrada: " + quantidadeVendida + " x " + produto.getNome() + " - Total: R$" + venda.getTotal());
                return;
            }
        }
        System.out.println("Produto não encontrado: " + nomeProduto);
    }

    public double calcularFaturamentoDiario() {
        double total = 0;
        for (Venda venda : vendas) {
            total += venda.getTotal();
        }
        return total;
    }

    public void exibirEstoque() {
        System.out.println("Estoque:");
        for (Produto produto : estoque) {
            System.out.println("- " + produto.getNome() + " | Preço: R$" + produto.getPreco() + " | Quantidade: " + produto.getQuantidade());
        }
    }
}

