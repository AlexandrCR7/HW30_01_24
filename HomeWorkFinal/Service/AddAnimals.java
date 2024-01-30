package HomeWorkFinal.Service;

import HomeWorkFinal.Models.Animals;

import java.util.HashMap;
import java.util.List;

public interface AddAnimals {
    HashMap<String, List<String>> addAnimals(Animals name, List<String> command);
}
