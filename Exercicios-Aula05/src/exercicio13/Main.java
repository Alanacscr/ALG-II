package exercicio13;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Alice");
        Funcionario func2 = new Funcionario("Bruno");

        SistemaDePonto sistemaDePonto = new SistemaDePonto();

        sistemaDePonto.registrarEntrada(func1);
        sistemaDePonto.registrarEntrada(func2);

        // Simulando uma pausa antes da saída
        try {
            Thread.sleep(2000); // pausa de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sistemaDePonto.registrarSaida(func1);
        sistemaDePonto.registrarSaida(func2);
    }
}

