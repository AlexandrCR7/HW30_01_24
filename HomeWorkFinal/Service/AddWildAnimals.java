package HomeWorkFinal.Service;

import HomeWorkFinal.Models.Animals;

import java.util.HashMap;
import java.util.List;

public class AddWildAnimals implements AddAnimals {

    HashMap<String, List<String>> newAnimal = new HashMap<>();

    @Override
    public HashMap<String, List<String>> addAnimals(Animals name, List<String> command) {
        newAnimal.put(name.toString(), command);
        System.out.println(newAnimal);
        return newAnimal;
    }

    @Override
    public String toString() {
        return "AddWildAnimals{" +
                "newAnimal=" + newAnimal +
                '}';
    }
}
