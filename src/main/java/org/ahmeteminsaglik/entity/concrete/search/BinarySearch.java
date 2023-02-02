package org.ahmeteminsaglik.entity.concrete.search;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch implements BaseSearchAlgorithmFunction {
    private boolean searchWithBinarySearch(List<String> list, String word) {
        int result = Collections.binarySearch(list, word);
        if (result >= 0) {
            return true;
        }
        return false;
    }

    private boolean searchWithBinarySearch(String[] arr, String word) {
        int result = Arrays.binarySearch(arr, word);
        if (result >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean search(List<String> wordPoollist, String word) {
        return searchWithBinarySearch(wordPoollist, word);
    }

    @Override
    public boolean search(String[] wordPoolArr, String word) {
        return searchWithBinarySearch(wordPoolArr, word);
    }

}
