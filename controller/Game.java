package controller;
import view.InterationUser;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class Game {
    private static Game instance;
    private  final Mapa mapa = new Mapa();
    private final ArrayList<String> availableColors = new ArrayList<>(asList("1-vermelho", "2-azul", "3-verde") );
    private ArrayList<Jogador> jogadores;
    protected Game(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
        startJogadores();

    }

    public static synchronized Game getInstance(ArrayList<Jogador> jogadores) {
        if (instance == null) {
            instance = new Game(jogadores);
        }
        return instance;
    }

    public ArrayList<String> getAvailableColors() {
        for (int i = 0; i < this.availableColors.size(); i++) {
            InterationUser.showMessage(availableColors.get(i));
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

    public void startJogadores(){
        for (var jog : jogadores){
            start(jog);
            int escolha = getTerritorios();
            setMapa(jog,escolha);
        }
    }

   public void setMapa(Jogador jogador,int pais){
        mapa.setTerritorio(jogador,pais);
   }

   public int getTerritorios(){
       mapa.mostrarTerritorios();
       int escolha = InterationUser.ScannerInput();
       return escolha;
   }


   public void start(Jogador jog){
       InterationUser.showMessage("Bem-vindo ao WAR! "+ jog.getName());
       InterationUser.showMessage("Cores disponíveis:");
       getAvailableColors();
       int escolha = InterationUser.ScannerInput();
       if (escolha >= 1 && escolha <= getAvailableColors().size()) {
           String corEscolhida = getAvailableColors().get(escolha -1);
           removeAvaibleColor(corEscolhida);
           InterationUser.showMessage("Você escolheu a cor " + corEscolhida + ". Boa sorte no jogo!");
       } else {
           InterationUser.showMessage("Escolha inválida. Por favor, escolha um número válido.");
       }

   }

}
