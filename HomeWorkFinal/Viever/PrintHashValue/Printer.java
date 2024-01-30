package HomeWorkFinal.Viever.PrintHashValue;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Printer {
//
//    public void printer(HashMap<String, List<String>> hashMap, String nameOfAnimal){
//        for(Map.Entry<String, List<String>> entry : hashMap.entrySet()){
////            if(hashMap.containsKey(nameOfAnimal))
//                System.out.println(entry.getValue());
////            else {
////                System.out.println("Животное " + nameOfAnimal + " не найдено");
//            }
//        }
//    }
////}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Printer {
    public void printer(String nameOfAnimals) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("BookOfHomeAnimals"));
            String line = bufferedReader.readLine();
            while (line != null){
                if (line.contains(nameOfAnimals)){
                    String str = line;
                    String a = str.replace("{", "").replace("}", "")
                            .replace("[", "").replace("]", "");
                    System.out.println(a);
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}