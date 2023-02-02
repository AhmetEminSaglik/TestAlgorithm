package org.ahmeteminsaglik.entity.algorithm.concrete.search;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.searchnode.business.concretes.searchnode.SearchNode;


public class SearchNodeSearch implements BaseSearchAlgorithmFunction {

    @Override
    public boolean search(SearchNode<String> searchNode, String word) {
        return searchNode.search(word).isSuccess();
    }
}
