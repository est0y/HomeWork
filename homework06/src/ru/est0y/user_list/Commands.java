package  ru.est0y.user_list;

import java.util.concurrent.atomic.AtomicBoolean;

public class Commands {
    public static void save(UserList userList) {
        try {
            userList.saveToFile("list.txt");
        } catch (ImpossibleSaveFileException e) {
            System.out.println("Что-то пошло не так: Невозможно сохранить файл");
        }
    }

    public static void printRandomElementsFromList(UserInput userInput, UserList userList) {
        try {
            System.out.println("Введите колличество элементов:");
            int elementsCount = userInput.getInteger();
            System.out.println(userList.getRandomElements(elementsCount));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            printRandomElementsFromList(userInput, userList);
        }
    }
    public static void shuffleList(UserList userList){
        userList.shuffle();
    }
    public static void exit(AtomicBoolean appIsRunning) {
        System.out.println("До свидания");
        appIsRunning.set(false);
    }
    public static void printList(UserList userList){
        System.out.println(userList);
    }
}

