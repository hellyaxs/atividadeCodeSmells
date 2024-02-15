import controller.Game;
import controller.Jogador;
import view.InterationUser;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Jogador> jogadores = new ArrayList<Jogador>(){{
            add(new Jogador("pedro"));
            add(new Jogador("thiago"));
            add(new Jogador("joão"));

        }};

        Game game = Game.getInstance(jogadores);
        
    }


}