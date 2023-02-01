package org.ahmeteminsaglik.entity.algorithm.searchalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.concrete.search.LinearSearch;

import java.util.HashMap;
import java.util.List;

public class SALinearSearch extends BaseSearchAlgorithmComplexityCalculation implements BaseSearchAlgorithmFunction {
    public SALinearSearch(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
        baseSearchAlgorithmFunction = new LinearSearch();
    }


    @Override
    public boolean search(List<String> wordPoollist, String word) {
        return baseSearchAlgorithmFunction.search(wordPoollist, word);
    }

    @Override
    public boolean search(String[] wordPoolArr, String word) {
        return baseSearchAlgorithmFunction.search(wordPoolArr, word);
    }

    @Override
    public boolean search(HashMap<String, String> map, String word) {
        System.err.println("!!! WRONG PROCESSS --> HASHSET SEARCH IS NOT ABLE TO IMPLEMENT IN " + getClass().getSimpleName());
        return false;// baseSearchAlgorithmFunction.search(map, word);
    }
}
