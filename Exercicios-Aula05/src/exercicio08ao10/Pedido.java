package exercicio08ao10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Pedido {
    int numero;
    Date data;
    Cliente cliente;
    List<Produto> produtos;

    Pedido(int numero, Date data, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    double calcularValorTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.preco;
        }
        return total;
    }

    void exibirPedido() {
        System.out.println("Número do Pedido: " + numero);
        System.out.println("Data: " + data);
        System.out.println("Cliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf());
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.nome + " | Preço: R$" + produto.preco);
        }
        System.out.println("Valor Total: R$" + calcularValorTotal());
    }
}
