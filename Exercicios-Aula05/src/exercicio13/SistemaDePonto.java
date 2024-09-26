package exercicio13;

import java.util.ArrayList;
import java.util.List;

class SistemaDePonto {
    private List<RegistroDePonto> registros;

    public SistemaDePonto() {
        this.registros = new ArrayList<>();
    }

    public void registrarEntrada(Funcionario funcionario) {
        RegistroDePonto registro = new RegistroDePonto(funcionario);
        registro.registrarEntrada();
        registros.add(registro);
    }

    public void registrarSaida(Funcionario funcionario) {
        for (RegistroDePonto registro : registros) {
            if (registro.getFuncionario().equals(funcionario) && registro.calcularHorasTrabalhadas() == 0) {
                registro.registrarSaida();
                System.out.println("Horas trabalhadas por " + funcionario.getNome() + ": " + registro.calcularHorasTrabalhadas() + " horas.");
                return;
            }
        }
        System.out.println("Erro: Entrada não encontrada para " + funcionario.getNome());
    }
}

