package exercicio14;

class Venda {
    private Produto produto;
    private int quantidadeVendida;
    private double total;

    public Venda(Produto produto, int quantidadeVendida) {
        this.produto = produto;
        this.quantidadeVendida = quantidadeVendida;
        this.total = produto.getPreco() * quantidadeVendida;
        produto.vender(quantidadeVendida);
    }

    public double getTotal() {
        return total;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }
}

