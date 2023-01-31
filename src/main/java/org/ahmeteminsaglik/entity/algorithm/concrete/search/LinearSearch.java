package org.ahmeteminsaglik.entity.algorithm.concrete.search;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;

import java.util.List;

public class LinearSearch implements BaseSearchAlgorithmFunction {


    private boolean searchWithLinearSearch(List<String> list, String val) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(val)) {
                return true;
            }
        }
        return false;
    }

    private boolean searchWithLinearSearch(String[] arr, String val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(val)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int search(List<String> wordPoollist, List<String> searchWordList) {
        int foundWordNumber = 0;
        for (String tmp : searchWordList) {
            boolean result = searchWithLinearSearch(wordPoollist, tmp);
            if (result) {
                foundWordNumber++;
            }
        }
        return foundWordNumber;
    }

    @Override
    public int search(String[] wordPoolArr, List<String> searchWordList) {
        int foundWordNumber = 0;
        for (String tmp : searchWordList) {
            boolean result = searchWithLinearSearch(wordPoolArr, tmp);
            if (result) {
                foundWordNumber++;
            }
        }
        return foundWordNumber;
    }
}
