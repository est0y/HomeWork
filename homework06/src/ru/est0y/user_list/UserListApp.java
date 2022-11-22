package ru.est0y.user_list;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class UserListApp {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        List<String> list = userInput.getList();
        UserList<String> userList = new UserList<>(list);
        AtomicBoolean appIsRunning = new AtomicBoolean(true);
        while (appIsRunning.get()) {
            switch (userInput.getCommand()) {
                case "shuffle" -> Commands.shuffleList(userList);
                case "exit" -> Commands.exit(appIsRunning);
                case "show list" -> Commands.printList(userList);
                case "few random elements" -> Commands.printRandomElementsFromList(userInput, userList);
                case "save" -> Commands.save(userList);
                default -> System.out.println("Доступные команды save|shuffle|show list|few random elements|exit");
            }

        }
    }
}

