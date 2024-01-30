package HomeWorkFinal.Service.AddCommands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AddNewCommandWild {
    public void newCommandWild(String name, String command) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("BookOfWildAnimals"));
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.contains(name)) {
                    String str = line;
                    String a = str.replace("{", "").replace("}", "")
                            .replace("[", "").replace("]", "");
                    System.out.println(a + " " + command + "\n");
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
