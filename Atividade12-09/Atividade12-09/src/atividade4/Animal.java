package atividade4;

class Animal {
    private String nome;
    private String especie;
    private int idade;
    private String habitat;
    private boolean ehMamifero;

    public Animal(String nome, String especie, int idade, String habitat, boolean ehMamifero) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.habitat = habitat;
        this.ehMamifero = ehMamifero;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean isEhMamifero() {
        return ehMamifero;
    }

    public String detalhes() {
        return "Nome: " + nome + ", Espécie: " + especie + ", Idade: " + idade + ", Habitat: " + habitat;
    }

    public void amamentar() {
        if (ehMamifero) {
            System.out.println(nome + " está amamentando.");
        } else {
            System.out.println(nome + " não é um mamífero.");
        }
    }
}


