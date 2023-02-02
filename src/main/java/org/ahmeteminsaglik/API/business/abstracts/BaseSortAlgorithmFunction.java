package org.ahmeteminsaglik.API.business.abstracts;

import org.ahmeteminsaglik.searchnode.business.concretes.searchnode.SearchNode;

import java.util.HashMap;
import java.util.List;

public interface BaseSortAlgorithmFunction {
    void sort(List<String> list);

    void sort(String[] arr);

    default void sort(SearchNode<String> searchNode) {
        System.out.println("SearchNode is not able to sort");//
    }

    default void sort(HashMap<String, String> hashMap) {
        System.out.println("Hashmap is not able to sort");
    }


}