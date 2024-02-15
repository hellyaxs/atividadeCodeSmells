package controller;

public class Jogador {
    public Jogador(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "name='" + name + '\'' +
                '}';
    }
}
