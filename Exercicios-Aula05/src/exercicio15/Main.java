package exercicio15;

public class Main {
    public static void main(String[] args) {
        GerenciadorDePedidos gerenciador = new GerenciadorDePedidos();

        Cliente cliente1 = new Cliente("Alana", "Avenida JK, 123", "1234-5678");
        Produto produto1 = new Produto("Pizza", 1.5);

        Pedido pedido1 = new Pedido(cliente1, produto1);
        gerenciador.adicionarPedido(pedido1);

        Cliente cliente2 = new Cliente("George", "Taquaralto, 456", "9876-5432");
        Produto produto2 = new Produto("Sushi", 0.5);

        Pedido pedido2 = new Pedido(cliente2, produto2);
        gerenciador.adicionarPedido(pedido2);

        gerenciador.exibirPedidos();

        gerenciador.atualizarStatusPedido(pedido1, "Entregue");
        gerenciador.exibirPedidos();
    }
}

