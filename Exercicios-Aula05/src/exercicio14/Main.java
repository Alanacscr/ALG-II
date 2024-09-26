package exercicio14;

public class Main {
    public static void main(String[] args) {
        Feira feira = new Feira();

        Produto produto1 = new Produto("Maçã", 2.00, 100);
        Produto produto2 = new Produto("Banana", 1.50, 50);
        Produto produto3 = new Produto("Laranja", 1.80, 80);

        feira.adicionarProduto(produto1);
        feira.adicionarProduto(produto2);
        feira.adicionarProduto(produto3);

        feira.exibirEstoque();

        feira.registrarVenda("Maçã", 10);
        feira.registrarVenda("Banana", 5);
        feira.registrarVenda("Laranja", 8);
        feira.registrarVenda("Pera", 3); 

        System.out.println("Faturamento diário: R$" + feira.calcularFaturamentoDiario());
    }
}

