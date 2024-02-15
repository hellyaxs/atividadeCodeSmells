import controller.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("1-vermelho", "2-azul", "3-verde") );
        Game game = Game.getInstance(colors);

        showMessage("Bem-vindo ao WAR!");

        showMessage("Cores disponíveis:");
        ArrayList<String> coresDisponiveis = game.getAvailableColors();

        showMessage("Escolha sua cor (Digite o número correspondente): ");
        int escolha = scanner.nextInt();

        if (escolha >= 1 && escolha <= coresDisponiveis.size()) {
            String corEscolhida = coresDisponiveis.get(escolha -1);
            showMessage("Você escolheu a cor " + corEscolhida + ". Boa sorte no jogo!");
        } else {
            showMessage("Escolha inválida. Por favor, escolha um número válido.");
        }

        // Fechando o scanner
        scanner.close();
    }

    static void showMessage(String msg){
        System.out.println(msg);
    }
}