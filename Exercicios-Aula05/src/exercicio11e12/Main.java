package exercicio11e12;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12345678000199");

        Funcionario func1 = new Funcionario("Alice", 5000.00);
        Funcionario func2 = new Funcionario("Bruno", 4500.00);
        Funcionario func3 = new Funcionario("Carlos", 6000.00);

        empresa.contratarFuncionario(func1);
        empresa.contratarFuncionario(func2);
        empresa.contratarFuncionario(func3);

        empresa.exibirFuncionarios();

        empresa.demitirFuncionario(func2);

        empresa.exibirFuncionarios();
    }
}

