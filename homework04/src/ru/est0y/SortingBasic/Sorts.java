package ru.est0y.SortingBasic;

import java.util.ArrayList;
import java.util.List;

public class Sorts {
    public static <N extends Number>  List<N> selectionSort(List<N> list) {
         list = new ArrayList<>(list);
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
    public static <N extends Number> List<N> quickSort(List<N> list) {
        list = new ArrayList<>(list);
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
