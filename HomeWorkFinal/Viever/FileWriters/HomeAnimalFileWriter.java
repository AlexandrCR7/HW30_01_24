package HomeWorkFinal.Viever.FileWriters;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class HomeAnimalFileWriter {

    public void fileWriterHome(HashMap<String, List<String>> hashMap){
        try(java.io.FileWriter fw = new java.io.FileWriter("BookOfHomeAnimals", true)){
            fw.append(hashMap.toString());
            fw.append("\n");
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
