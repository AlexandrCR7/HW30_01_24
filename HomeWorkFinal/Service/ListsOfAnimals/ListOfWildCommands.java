package HomeWorkFinal.Service.ListsOfAnimals;

import HomeWorkFinal.Models.WildAnimalsCommands;

import java.util.ArrayList;
import java.util.List;

public class ListOfWildCommands {

    List<String> listOfWildAnimalsCommands = new ArrayList<>();
    public List<String> commandList(WildAnimalsCommands commands){
        listOfWildAnimalsCommands.add(commands.toString());
        return listOfWildAnimalsCommands;
    }
}
