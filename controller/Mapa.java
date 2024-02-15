package controller;
import view.InterationUser;
import java.util.ArrayList;
import java.util.HashMap;

import static java.util.Arrays.asList;

public class Mapa {

    private HashMap<String,Boolean> paises = new HashMap<String,Boolean>(){{
        put("1-Brasil",true);
        put("2-Argentina",true);
        put("3-Chile",true);
        put("4-Venezuela",true);
        put("5-Peru",true);
        put("6-Alemanha",true);
        put("7-Espanha",true);
        put("8-Inglaterra",true);

    }};
    private HashMap<Jogador,ArrayList<String>> jogadorTerritorio = new HashMap<Jogador,ArrayList<String>>();

    public void setTerritorio(Jogador jog, int territorio){
        if(jogadorTerritorio.containsKey(jog)){
           String key = mostrar(territorio);
            if(paises.get(key)){
                jogadorTerritorio.get(jog).add(key);
                paises.replace(key,false);
                InterationUser.showMessage("territorio adicionado");
            }else{
                InterationUser.showMessage("Este territorio ja esta ocupado");
            }

        }
        else{
            String key = mostrar(territorio);
            if(paises.get(key)){
                jogadorTerritorio.put(jog,new ArrayList<String>(asList(key)));
                paises.replace(key,false);
                InterationUser.showMessage(jog.getName()+ " seu territorio adicionado!! " +jog+":"+jogadorTerritorio.get(jog));
            }else{
                InterationUser.showMessage("Este territorio ja esta ocupado");
            }

        }

    }
    public void mostrarTerritorios(){
        InterationUser.showMessage("paises disponiveis (Digite o número correspondente): ");
        for(var pais : paises.keySet()){
            if(paises.get(pais)){
                InterationUser.showMessage(pais);
            }
        }
    }
    private String mostrar(Integer territorio){
        for(var pais : paises.keySet()){
            var tes = territorio.toString();
            if(pais.contains(tes)){
                return pais;
            }
        }
        return "erro";

    }

}
