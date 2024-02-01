package HomeWorkFinalV2.Servise;

import HomeWorkFinalV2.Models.AnimalsV2;

import java.util.List;

public class AddAnimalsClass implements AddAnimals {
    @Override
    public void addAnimals(AnimalsV2 obj, List<AnimalsV2> list) {
        list.add(obj);
        for (AnimalsV2 animalsV2 : list) {
            System.out.println(animalsV2);
        }
    }
}
