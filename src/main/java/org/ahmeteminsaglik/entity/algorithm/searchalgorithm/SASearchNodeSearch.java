package org.ahmeteminsaglik.entity.algorithm.searchalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.concrete.search.LinearSearch;
import org.hibernate.cfg.NotYetImplementedException;

import java.util.HashMap;
import java.util.List;

public class SASearchNodeSearch extends BaseSearchAlgorithmComplexityCalculation implements BaseSearchAlgorithmFunction {
    public SASearchNodeSearch(TestAlgorithmResult testAlgorithmResult) {
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
