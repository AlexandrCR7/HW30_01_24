package HomeWorkFinal.Viever.FileWriters;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class WildAnimalFileWriter {

    public void fileWriterWild(HashMap<String, List<String>> hashMap){
        try(java.io.FileWriter fw = new java.io.FileWriter("BookOfWildAnimals", true)){
            fw.append(hashMap.toString());
            fw.append("\n");
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
