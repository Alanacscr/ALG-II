package atividade4;

import java.util.ArrayList;
import java.util.List;

class Zoologico {
    private List<Animal> animais;

    public Zoologico() {
        animais = new ArrayList<>();
    }

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("Animal cadastrado: " + animal.getNome());
    }

    public void listarAnimaisPorHabitat(String habitat) {
        System.out.println("Animais no habitat " + habitat + ":");
        for (Animal animal : animais) {
            if (animal.getHabitat().equalsIgnoreCase(habitat)) {
                System.out.println(animal.detalhes());
            }
        }
    }
}

