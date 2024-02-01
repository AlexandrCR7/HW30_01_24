package HomeWorkFinalV2.Servise;

import HomeWorkFinal.Models.Animals;
import HomeWorkFinalV2.Models.AnimalsV2;

import java.util.List;

public class ShowListOfAnimals implements ShowAllAnimals {
    @Override
    public void showAllAnimals(List<AnimalsV2> animals) {
        for (AnimalsV2 str : animals) {
            System.out.println(str.toString());
        }
    }
}
