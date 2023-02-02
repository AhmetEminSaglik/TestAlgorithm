package org.ahmeteminsaglik.entity.algorithm.searchalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.hibernate.cfg.NotYetImplementedException;

import java.util.*;

public class SABinarySearch extends BaseSearchAlgorithmComplexityCalculation implements BaseSearchAlgorithmFunction {
    public SABinarySearch(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
//        baseSearchAlgorithmFunction = new SearchNode();
    }


    @Override
    public boolean search(List<String> wordPoollist, String word) {
        int result = Collections.binarySearch(wordPoollist, word);
        if (result >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean search(String[] wordPoolArr, String word) {
        int result = Arrays.binarySearch(wordPoolArr, word);
        if (result >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean search(HashMap<String, String> map, String word) {
        throw new NotYetImplementedException();
    }
}
