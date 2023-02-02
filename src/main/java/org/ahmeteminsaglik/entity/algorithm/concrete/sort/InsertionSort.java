package org.ahmeteminsaglik.entity.algorithm.concrete.sort;

import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;

import java.awt.datatransfer.ClipboardOwner;
import java.util.List;

public class InsertionSort implements BaseSortAlgorithmFunction {
    @Override
    public List<String> sort(List<String> list) {
        return sortWithInsertionSort(list);
    }

    @Override
    public String[] sort(String[] arr) {
        return sortWithInsertionSort(arr);
    }

    private String[] sortWithInsertionSort(String[] array) {
        String temp = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    private List<String> sortWithInsertionSort(List<String> list) {
        String temp = "";
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}
