package HomeWorkFinalV2.Viever;

import HomeWorkFinalV2.Models.AnimalsV2;
import HomeWorkFinalV2.Models.HomeAnimalsV2;
import HomeWorkFinalV2.Models.WildAnimalsV2;
import HomeWorkFinalV2.Servise.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Viewer {
    List<AnimalsV2> listOfHomeAnimals = new ArrayList<>();
    List<AnimalsV2> listOfWildAnimals = new ArrayList<>();
    Counter counter = new Counter();

    public void request() throws Exception {

        System.out.println("""
                Вам доступны следующие действия:\s
                1 - Завести новое животное
                2 - Увидеть список команд, которое выполняет животное
                3 - Посмотреть список всех животных
                4 - Обучить животное новым командам
                5 - Завершить работу программы""");

        Scanner menu = new Scanner(System.in);
        switch (menu.nextInt()) {
            case 1 -> {
                System.out.println("""
                        Выберете класс животного:\s
                        1 - HomeAnimals
                        2 - WildAnimals
                        3 - Вернуться назад
                        """);
                Scanner menu1 = new Scanner(System.in);
                switch (menu1.nextInt()) {
                    case 1 -> {
                        Scanner in = new Scanner(System.in);
                        System.out.println("Введите вид животного: \n");
                        String type = in.nextLine();
                        System.out.println("Введите команду для животного: \n");
                        String command = in.nextLine();
                        HomeAnimalsV2 homeAnimals = new HomeAnimalsV2(type, command);
                        AddAnimalsClass addAnimalsClass = new AddAnimalsClass();
                        addAnimalsClass.addAnimals(homeAnimals, listOfHomeAnimals);
                        counter.add();
                        request();
                    }
                    case 2 -> {
                        Scanner in1 = new Scanner(System.in);
                        System.out.println("Введите вид животного: \n");
                        String type1 = in1.nextLine();
                        System.out.println("Введите команду для  животного: \n");
                        String command1 = in1.nextLine();
                        WildAnimalsV2 wildAnimals = new WildAnimalsV2(type1, command1);
                        AddAnimalsClass addAnimalsClass1 = new AddAnimalsClass();
                        addAnimalsClass1.addAnimals(wildAnimals, listOfWildAnimals);
                        counter.add();
                        request();

                    }
                    case 3 -> {
                        request();
                        counter.close();
                    }
                }
            }
            case 2 -> {
                System.out.println("""
                        Выберете класс животного:\s
                        1 - HomeAnimals
                        2 - WildAnimals
                        3 - Вернуться назад
                        """);
                Scanner menu2 = new Scanner(System.in);
                switch (menu2.nextInt()) {
                    case 1 -> {
                        Scanner in = new Scanner(System.in);
                        System.out.println("Введите вид животного: \n");
                        String type = in.nextLine();
                        ShowAnimalCommands showAnimalCommands = new ShowAnimalCommands();
                        showAnimalCommands.showAnimalCommands(type, listOfHomeAnimals);
                        counter.close();
                        request();
                    }
                    case 2 -> {
                        Scanner into = new Scanner(System.in);
                        System.out.println("Введите вид животного: \n");
                        String type1 = into.nextLine();
                        ShowAnimalCommands showAnimalCommands1 = new ShowAnimalCommands();
                        showAnimalCommands1.showAnimalCommands(type1, listOfWildAnimals);
                        counter.close();
                        request();
                    }
                    case 3 ->
                    request();
                }
            }
            case 3 -> {
                ShowListOfAnimals showListOfAnimals = new ShowListOfAnimals();
                showListOfAnimals.showAllAnimals(listOfHomeAnimals);
                showListOfAnimals.showAllAnimals(listOfWildAnimals);
                counter.close();
                request();
            }
            case 4 -> {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите вид животного, которого хотите обучить: \n");
                String type1 = in.nextLine();
                System.out.println("Введите одну или несколько команд через запятую \n");
                String type2 = in.nextLine();
                AddNewCommand addNewCommand = new AddNewCommand();
                addNewCommand.addNewCommand(type1, type2, listOfHomeAnimals);
                counter.close();
                request();
            }
            case 5 -> {
            }
        }
    }
}