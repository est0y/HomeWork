package ru.est0y.SortingComplicated;

import java.util.ArrayList;
import java.util.List;

public class Sorts<N extends Number> implements Sorting {
    private final List<N> unsortedList;

    public Sorts(List<N> unsortedList) {
        this.unsortedList = unsortedList;
    }

    public List<N> selectionSort() {
        List<N> list = new ArrayList<>(this.unsortedList);
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            N min = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                //не уверен
                if (min.doubleValue() > list.get(j).doubleValue()) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            list.set(minIndex, list.get(i));
            list.set(i, min);
        }
        return list;
    }

    public List<N> quickSort() {
        List<N> list = new ArrayList<>(this.unsortedList);
        for (int k = list.size() - 1; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                if (list.get(i).doubleValue() > list.get(i + 1).doubleValue()) {
                    N temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
        return list;
    }
}
