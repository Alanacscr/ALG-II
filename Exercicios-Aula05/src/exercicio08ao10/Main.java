package exercicio08ao10;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João da Silva", "12345678901");

        Pedido pedido = new Pedido(1, new Date(), cliente);

        Produto produto1 = new Produto("Camiseta", 50.00);
        Produto produto2 = new Produto("Calça", 100.00);

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);

        pedido.exibirPedido();
    }
}
