package org.ahmeteminsaglik.entity.algorithm.sortalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;

import java.util.List;

public class SANoSort extends BaseSortAlgorithmComplexityCalculation implements BaseSortAlgorithmFunction {
    public SANoSort(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }

    /**
     * Data will not be sorted*/
    @Override
    public List<String> sort(List<String> list) {
        return list;
    }
    /**
     * Data will not be sorted*/
    @Override
    public String[] sort(String[] arr) {
        return arr;
    }
}
