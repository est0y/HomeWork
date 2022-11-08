package ru.est0y.SortingComplicated;

import java.util.Date;
import java.util.List;

public class SortingTimeDecorator implements Sorting {
    private final Sorting sorting;

    SortingTimeDecorator(Sorting sorting) {
        this.sorting = sorting;
    }

    public List selectionSort() {
        long start = new Date().getTime();
        List sortedList = sorting.selectionSort();
        long end = new Date().getTime();
        System.out.println("Время сортировки выбором:" + (end - start) + "ms");
        return sortedList;
    }

    public List quickSort() {
        long start = new Date().getTime();
        List sortedList = sorting.quickSort();
        long end = new Date().getTime();
        System.out.println("Время быстрой сортировки:" + (end - start) + "ms");
        return sortedList;
    }
}
