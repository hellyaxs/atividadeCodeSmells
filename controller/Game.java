package controller;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private static Game instance;
    private final ArrayList<String> availableColors = new ArrayList<>(Arrays.asList("1-vermelho", "2-azul", "3-verde") );

    protected Game() {

    }

    public static synchronized Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public ArrayList<String> getAvailableColors() {
        for (int i = 0; i < this.availableColors.size(); i++) {
            System.out.println(availableColors.get(i));
        }
        return availableColors;
    }

    public void removeAvaibleColor(String choicedColor){
        for (int i = 0; i < availableColors.size(); i++){
            if(choicedColor.equals(availableColors.get(i))){
                this.availableColors.remove(i);
            }
        }
    }
}
