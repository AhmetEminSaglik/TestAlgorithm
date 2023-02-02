package org.ahmeteminsaglik.entity.algorithm.concrete.sort;


import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;

import java.util.List;

public class BubbleSort implements BaseSortAlgorithmFunction {
    @Override
    public List<String> sort(List<String> list) {
        return sortWithBubbleSort(list);
    }

    @Override
    public String[] sort(String[] arr) {
        return sortWithBubbleSort(arr);
    }


    public static String[] sortWithBubbleSort(String[] arr) {
        String temp;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                // comparing adjacent strings
                if (arr[i].compareTo(arr[j]) < 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static List<String> sortWithBubbleSort(List<String> list) {
        String temp;
        for (int j = 0; j < list.size(); j++) {
            for (int i = j + 1; i < list.size(); i++) {
                // comparing adjacent strings
                if (list.get(i).compareTo(list.get(j)) < 0) {
                    temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
        return list;
    }
}
