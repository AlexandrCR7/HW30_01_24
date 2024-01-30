package HomeWorkFinal.Viever;

import HomeWorkFinal.Models.HomeAnimalsCommands;
import HomeWorkFinal.Models.HomeAnimalsNames;
import HomeWorkFinal.Models.WildAnimalsCommands;
import HomeWorkFinal.Models.WildAnimalsNames;
import HomeWorkFinal.Service.AddCommands.AddNewCommanHome;
import HomeWorkFinal.Service.AddCommands.AddNewCommandWild;
import HomeWorkFinal.Service.AddHomeAnimals;
import HomeWorkFinal.Service.AddWildAnimals;
import HomeWorkFinal.Service.ListsOfAnimals.ListOfHomeCommands;
import HomeWorkFinal.Service.ListsOfAnimals.ListOfWildCommands;
import HomeWorkFinal.Viever.FileWriters.HomeAnimalFileWriter;
import HomeWorkFinal.Viever.FileWriters.WildAnimalFileWriter;
import HomeWorkFinal.Viever.PrintHashValue.PrintAll;
import HomeWorkFinal.Viever.PrintHashValue.Printer;

import java.util.Scanner;

public class Viever1 implements Viever {

    @Override
    public void request() {

        System.out.println("Вам доступны следующие действия: \n" +
                "1 - Завести новое животное\n" +
                "2 - Увидеть список команд, которое выполняет животное\n" +
                "3 - Посмотреть список всех животных\n" +
                "4 - Обучить животное новым командам\n" +
                "5 - Завершить работу программы");

        Scanner menu = new Scanner(System.in);
        switch (menu.nextInt()) {
            case 1:
                System.out.println("Выберете класс животного: \n" +
                        "1 - HomeAnimals\n" +
                        "2 - WildAnimals\n" +
                        "3 - Вернуться назад\n");
                Scanner menu1 = new Scanner(System.in);
                switch (menu1.nextInt()) {
                    case 1:
                        Scanner in = new Scanner(System.in);
                        System.out.println("Введите вид животного: \n");
                        String type = in.nextLine();
                        HomeAnimalsNames homeAnimalsNames = new HomeAnimalsNames(type);
                        System.out.println("Введите команду, которую будет выполнять животное: \n");
                        String command = in.nextLine();
                        HomeAnimalsCommands homeAnimalsCommands = new HomeAnimalsCommands(command);
                        AddHomeAnimals addHomeAnimals = new AddHomeAnimals();
                        ListOfHomeCommands listOfHomeCommands = new ListOfHomeCommands();
                        HomeAnimalFileWriter homeAnimalFileWriter = new HomeAnimalFileWriter();
                        homeAnimalFileWriter.fileWriterHome(addHomeAnimals.addAnimals(homeAnimalsNames,
                                listOfHomeCommands.commandList(homeAnimalsCommands)));
                        request();
                    case 2:
                        Scanner into = new Scanner(System.in);
                        System.out.println("Введите вид животного: \n");
                        String type1 = into.nextLine();
                        WildAnimalsNames wildAnimalsNames = new WildAnimalsNames(type1);
                        System.out.println("Введите команду, которую будет выполнять животное: \n");
                        String command1 = into.nextLine();
                        WildAnimalsCommands wildAnimalsCommands = new WildAnimalsCommands(command1);
                        ListOfWildCommands listOfWildCommands = new ListOfWildCommands();
                        AddWildAnimals addWildAnimals = new AddWildAnimals();
                        WildAnimalFileWriter wildAnimalFileWriter = new WildAnimalFileWriter();
                        wildAnimalFileWriter.fileWriterWild(addWildAnimals.addAnimals(wildAnimalsNames,
                                listOfWildCommands.commandList(wildAnimalsCommands)));
                        request();
                        break;
                    case 3:
                        request();
                        break;
                }
            case 2:
                Scanner in = new Scanner(System.in);
                System.out.println("Введите название животного: список команд которого хотите посмотреть \n");
                String nameOfAnimal = in.nextLine();
                Printer printer = new Printer();
                printer.printer(nameOfAnimal);
                request();
                break;

            case 3:
                PrintAll printAll = new PrintAll();
                printAll.printAllAnimals();
                request();

            case 4:
                System.out.println("Выберете класс животного: \n" +
                        "1 - HomeAnimals\n" +
                        "2 - WildAnimals\n" +
                        "3 - Вернуться назад\n");
                Scanner menu2 = new Scanner(System.in);
                switch (menu2.nextInt()) {
                    case 1:
                        Scanner into = new Scanner(System.in);
                        System.out.println("Введите название животного, которому хотите добавить команду \n");
                        String name = into.nextLine();
                        System.out.println("Перечислите команды через запятую, которые хотите добавить \n");
                        String command = into.nextLine();
                        AddNewCommanHome addNewCommanHome = new AddNewCommanHome();
                        addNewCommanHome.newCommandHome(name, command);
                    case 2:
                        Scanner into1 = new Scanner(System.in);
                        System.out.println("Введите название животного, которому хотите добавить команду \n");
                        String name1 = into1.nextLine();
                        System.out.println("Перечислите команды через запятую, которые хотите добавить \n");
                        String command1 = into1.nextLine();
                        AddNewCommandWild addNewCommandWild = new AddNewCommandWild();
                        addNewCommandWild.newCommandWild(name1, command1);
                    case 3:
                        request();
                }
            case 5:
                break;
        }
    }
}