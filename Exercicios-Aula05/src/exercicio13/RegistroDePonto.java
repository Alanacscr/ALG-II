package exercicio13;

import java.time.LocalDateTime;
import java.time.Duration;

class RegistroDePonto {
    private Funcionario funcionario;
    private LocalDateTime entrada;
    private LocalDateTime saida;

    public RegistroDePonto(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void registrarEntrada() {
        entrada = LocalDateTime.now();
        System.out.println("Entrada registrada para " + funcionario.getNome() + " às " + entrada);
    }

    public void registrarSaida() {
        saida = LocalDateTime.now();
        System.out.println("Saída registrada para " + funcionario.getNome() + " às " + saida);
    }

    public long calcularHorasTrabalhadas() {
        if (entrada != null && saida != null) {
            Duration duracao = Duration.between(entrada, saida);
            return duracao.toHours();
        } else {
            System.out.println("Erro: Entrada ou saída não registrada.");
            return 0;
        }
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
}

