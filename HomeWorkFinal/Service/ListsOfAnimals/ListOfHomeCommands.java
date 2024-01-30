package HomeWorkFinal.Service.ListsOfAnimals;

import HomeWorkFinal.Models.HomeAnimalsCommands;

import java.util.ArrayList;
import java.util.List;

public class ListOfHomeCommands {

    List<String> listOfHomeAnimalsCommands = new ArrayList<>();
    public List<String> commandList(HomeAnimalsCommands commands){
        listOfHomeAnimalsCommands.add(commands.toString());
        return listOfHomeAnimalsCommands;
    }

    public List<String> getListOfHomeAnimalsCommands() {
        return listOfHomeAnimalsCommands;
    }

    public void setListOfHomeAnimalsCommands(List<String> listOfHomeAnimalsCommands) {
        this.listOfHomeAnimalsCommands = listOfHomeAnimalsCommands;
    }
}
