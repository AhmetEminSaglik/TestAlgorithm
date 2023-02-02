package org.ahmeteminsaglik.API.business.abstracts;

import org.ahmeteminsaglik.searchnode.business.concretes.searchnode.SearchNode;

import java.util.HashMap;
import java.util.List;

public interface BaseSortAlgorithmFunction {
    List<String> sort(List<String> list);

    String[] sort(String[] arr);

    default void sort(SearchNode<String> searchNode) {
        System.err.println("SearchNode is not able to sort");
    }

    default void sort(HashMap<String, String> hashMap) {
        System.err.println("Hashmap is not able to sort");
    }


}