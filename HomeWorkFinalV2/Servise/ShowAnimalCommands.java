package HomeWorkFinalV2.Servise;

import HomeWorkFinalV2.Models.AnimalsV2;

import java.util.List;

public class ShowAnimalCommands implements ShowCommands {
    @Override
    public void showAnimalCommands(String name, List<AnimalsV2> command) {
        int countAnimals = 0;
        for (AnimalsV2 str : command) {
            if (str.toString().contains(name)) {
                System.out.println(str);
                countAnimals += 1;
            }
        }
        if (countAnimals == 0) {
            System.out.println("Животное не найдено.");
        }
    }
}
