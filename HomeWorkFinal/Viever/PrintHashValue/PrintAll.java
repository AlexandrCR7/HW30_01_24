package HomeWorkFinal.Viever.PrintHashValue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintAll {
    public void printAllAnimals() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("BookOfHomeAnimals"));
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
