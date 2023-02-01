package org.ahmeteminsaglik.entity.algorithm.searchalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.concrete.search.LinearSearch;

import java.util.List;

public class SALinearSearch extends BaseSearchAlgorithmComplexityCalculation implements BaseSearchAlgorithmFunction {
    BaseSearchAlgorithmFunction baseSearchAlgorithmFunction = new LinearSearch();

    public SALinearSearch(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }


    @Override
    public int search(List<String> wordPoollist, List<String> searchWordList) {
        return baseSearchAlgorithmFunction.search(wordPoollist,searchWordList);
    }

    @Override
    public int search(String[] wordPoolArr, List<String> searchWordList) {
        return baseSearchAlgorithmFunction.search(wordPoolArr, searchWordList);

    }
}
