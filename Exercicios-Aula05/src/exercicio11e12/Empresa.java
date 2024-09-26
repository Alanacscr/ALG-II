package exercicio11e12;

import java.util.ArrayList;
import java.util.List;

class Empresa {
    private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário " + funcionario.getNome() + " contratado.");
    }

    public void demitirFuncionario(Funcionario funcionario) {
        if (funcionarios.remove(funcionario)) {
            System.out.println("Funcionário " + funcionario.getNome() + " demitido.");
        } else {
            System.out.println("Funcionário " + funcionario.getNome() + " não encontrado.");
        }
    }

    public double calcularFolhaDePagamento() {
        double totalSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.getSalario();
        }
        return totalSalarios;
    }

    public void exibirFuncionarios() {
        System.out.println("Funcionários da Empresa " + nome + ":");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("- " + funcionario.getNome() + " | Salário: R$" + funcionario.getSalario());
        }
        System.out.println("Total de salários pagos: R$" + calcularFolhaDePagamento());
    }
}

