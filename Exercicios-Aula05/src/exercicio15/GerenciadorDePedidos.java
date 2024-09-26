package exercicio15;

import java.util.ArrayList;
import java.util.List;

class GerenciadorDePedidos {
    private List<Pedido> pedidos;

    public GerenciadorDePedidos() {
        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido adicionado: " + pedido.getProduto().getNome() + " para " + pedido.getCliente().getNome());
    }

    public void atualizarStatusPedido(Pedido pedido, String novoStatus) {
        pedido.atualizarStatus(novoStatus);
        System.out.println("Status atualizado para: " + novoStatus);
    }

    public void exibirPedidos() {
        System.out.println("Pedidos:");
        for (Pedido pedido : pedidos) {
            pedido.exibirDetalhes();
        }
    }
}

