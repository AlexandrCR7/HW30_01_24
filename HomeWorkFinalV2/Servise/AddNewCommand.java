package HomeWorkFinalV2.Servise;

import HomeWorkFinal.Models.Animals;
import HomeWorkFinalV2.Models.AnimalsV2;

import java.util.List;

public class AddNewCommand implements AddCommands {

    public void addNewCommand(String name, String command, List<AnimalsV2> animals) {
        for (AnimalsV2 str : animals) {
            if(str.toString().contains(name)){
                String oldCommand = str.getCommands();
                str.setCommands(oldCommand + command);
                System.out.println(str);
            }
            else {
                System.out.println("Животное не найдено");
            }
        }
    }
}
