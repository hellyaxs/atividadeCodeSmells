package controller;
import java.util.ArrayList;

public class Game {
    private static Game instance;
    private ArrayList<String>  availableColors;

    protected Game(ArrayList<String> colors) {
        this.availableColors = colors;
    }

    public static synchronized Game getInstance(ArrayList<String> colors) {
        if (instance == null) {
            instance = new Game(colors);
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
