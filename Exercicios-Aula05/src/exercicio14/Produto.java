package exercicio14;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void vender(int quantidadeVendida) {
        if (quantidade >= quantidadeVendida) {
            quantidade -= quantidadeVendida;
        } else {
            System.out.println("Estoque insuficiente para " + nome);
        }
    }

    public void repor(int quantidadeReposta) {
        quantidade += quantidadeReposta;
    }
}

