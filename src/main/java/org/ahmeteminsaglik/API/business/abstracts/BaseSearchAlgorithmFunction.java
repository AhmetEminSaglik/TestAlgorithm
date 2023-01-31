package org.ahmeteminsaglik.API.business.abstracts;

import java.util.List;

public interface BaseSearchAlgorithmFunction {
    int search(List<String> wordPoollist, List<String> searchWordList);

    int search(String[] wordPoolArr, List<String> searchWordList);
}