package org.ahmeteminsaglik.entity.algorithm.searchalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.concrete.search.BinarySearch;
import org.hibernate.cfg.NotYetImplementedException;

import java.util.*;

public class SABinarySearch extends BaseSearchAlgorithmComplexityCalculation implements BaseSearchAlgorithmFunction {
    public SABinarySearch(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
        baseSearchAlgorithmFunction = new BinarySearch();
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
        throw new NotYetImplementedException();
    }
}
