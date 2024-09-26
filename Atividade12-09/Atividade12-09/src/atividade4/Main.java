package atividade4;

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        Animal leao = new Animal("Leão", "L", 5, "Terrestre", true);
        Animal golfinho = new Animal("Golfinho", "G", 8, "Aquático", true);
        Animal aguia = new Animal("Águia", "A", 3, "Ave", false);

        zoologico.cadastrarAnimal(leao);
        zoologico.cadastrarAnimal(golfinho);
        zoologico.cadastrarAnimal(aguia);

        zoologico.listarAnimaisPorHabitat("Terrestre");
        zoologico.listarAnimaisPorHabitat("Aquático");
        zoologico.listarAnimaisPorHabitat("Ave");

        // Exemplo de amamentação
        golfinho.amamentar();
        aguia.amamentar();
    }
}
