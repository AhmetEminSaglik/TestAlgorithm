package org.ahmeteminsaglik.entity.algorithm.searchalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.hibernate.cfg.NotYetImplementedException;

import java.util.HashMap;
import java.util.List;

public class SAExponentialSearch extends BaseSearchAlgorithmComplexityCalculation implements BaseSearchAlgorithmFunction {
    public SAExponentialSearch(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
//        baseSearchAlgorithmFunction = new SearchNode();
    }


    @Override
    public boolean search(List<String> wordPoollist, String word) {
        throw new NotYetImplementedException();
    }

    @Override
    public boolean search(String[] wordPoolArr, String word) {
        throw new NotYetImplementedException();
    }

    @Override
    public boolean search(HashMap<String, String> map, String word) {
        throw new NotYetImplementedException();
    }
}
