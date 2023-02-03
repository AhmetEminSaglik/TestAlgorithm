package org.ahmeteminsaglik.API.business.abstracts;

import org.ahmeteminsaglik.searchnode.business.concretes.searchnode.SearchNode;
import org.hibernate.cfg.NotYetImplementedException;

import java.util.HashMap;
import java.util.List;

public interface BaseSearchAlgorithmFunction {
    default boolean search(List<String> wordPoollist, String word){
        throw new NotYetImplementedException();
    }

    default boolean search(String[] wordPoolArr,  String word){
        throw new NotYetImplementedException();
    }

    default boolean search(HashMap<String,String> hashMap,  String word){
        throw new NotYetImplementedException();
    }
    default boolean search(SearchNode<String> searchNode, String word){
        throw new NotYetImplementedException();
    };
}