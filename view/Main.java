import controller.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("1-vermelho", "2-azul", "3-verde") );
        Game game = Game.getInstance(colors);

        System.out.println("Bem-vindo ao WAR!");

        System.out.println("Cores disponíveis:");
        ArrayList<String> coresDisponiveis = game.getAvailableColors();

        System.out.print("Escolha sua cor (Digite o número correspondente): ");
        int escolha = scanner.nextInt();

        if (escolha >= 1 && escolha <= coresDisponiveis.size()) {
            String corEscolhida = coresDisponiveis.get(escolha -1);
            System.out.println("Você escolheu a cor " + corEscolhida + ". Boa sorte no jogo!");
        } else {
            System.out.println("Escolha inválida. Por favor, escolha um número válido.");
        }

        // Fechando o scanner
        scanner.close();
    }
}