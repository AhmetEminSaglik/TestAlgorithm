package org.ahmeteminsaglik.entity.concrete.search;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;

import java.util.HashMap;
import java.util.List;

public class HashMapSearch implements BaseSearchAlgorithmFunction {
    @Override
    public boolean search(List<String> wordPoollist, String word) {
        System.err.println("!!! WRONG PROCESSS --> LIST SEARCH IS NOT ABLE TO IMPLEMENT IN " + getClass().getSimpleName());
        return false;
    }

    @Override
    public boolean search(String[] wordPoolArr, String word) {
        System.err.println("!!! WRONG PROCESSS --> ARRAY SEARCH IS NOT ABLE TO IMPLEMENT IN " + getClass().getSimpleName());
        return false;
    }

    @Override
    public boolean search(HashMap<String, String> hashMap, String word) {
        if (hashMap.get(word) != null)
            return true;
        return false;
    }
}
