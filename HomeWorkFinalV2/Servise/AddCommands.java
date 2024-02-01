package HomeWorkFinalV2.Servise;

import HomeWorkFinalV2.Models.AnimalsV2;

import java.util.List;

public interface AddCommands {
    void addNewCommand(String name, String command, List<AnimalsV2> animals);
}
