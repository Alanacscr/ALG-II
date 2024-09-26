package exercicio15;

class Pedido {
    private Cliente cliente;
    private Produto produto;
    private String status;

    public Pedido(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
        this.status = "Pendente";
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public String getStatus() {
        return status;
    }

    public void exibirDetalhes() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Peso: " + produto.getPeso() + " kg");
        System.out.println("Status do Pedido: " + status);
        System.out.println("----------------------------");
    }
}

