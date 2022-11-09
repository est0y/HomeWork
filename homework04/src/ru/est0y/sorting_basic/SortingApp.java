package ru.est0y.sorting_basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) list.add(i);
        Collections.shuffle(list);
        long start = new Date().getTime();
        System.out.println(Sorts.selectionSort(list));
        long end = new Date().getTime();
        System.out.println("Время сортировки выбором:" + (end - start) + "ms");
        SortingApp.quickSortPrint(list);
    }
    private static void quickSortPrint(List list){
        list=new ArrayList(list);
        long start = new Date().getTime();
        Collections.sort(list);
        System.out.println(list);
        long end = new Date().getTime();
        System.out.println("Время быстрой сортировки:" + (end - start) + "ms");
    }
}
