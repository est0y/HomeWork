package ru.est0y.SortingComplicated;

import java.util.*;

public class SortingApp {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 1000; i++) list.add(i);
        Collections.shuffle(list);
        Sorting sorts = new SortingTimeDecorator(new Sorts<>(list));
        System.out.println(sorts.quickSort());
        System.out.println(sorts.selectionSort());
    }
}
