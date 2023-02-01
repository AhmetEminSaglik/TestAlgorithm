package org.ahmeteminsaglik.API.business.abstracts;

import java.util.HashMap;
import java.util.List;

public interface BaseSearchAlgorithmFunction {
    boolean search(List<String> wordPoollist, String word);

    boolean search(String[] wordPoolArr,  String word);

    boolean search(HashMap<String,String> hashMap,  String word);
}