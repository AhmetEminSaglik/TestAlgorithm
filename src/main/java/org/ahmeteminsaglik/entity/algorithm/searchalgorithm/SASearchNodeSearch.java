package org.ahmeteminsaglik.entity.algorithm.searchalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.concrete.search.LinearSearch;
import org.ahmeteminsaglik.entity.algorithm.concrete.search.SearchNodeSearch;
import org.ahmeteminsaglik.searchnode.business.concretes.searchnode.SearchNode;
import org.hibernate.cfg.NotYetImplementedException;

import java.util.HashMap;
import java.util.List;

public class SASearchNodeSearch extends BaseSearchAlgorithmComplexityCalculation implements BaseSearchAlgorithmFunction {
    public SASearchNodeSearch(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
        baseSearchAlgorithmFunction = new SearchNodeSearch();
    }

    @Override
    public boolean search(SearchNode<String> searchNode, String word) {
        return baseSearchAlgorithmFunction.search(searchNode, word);
    }
}
