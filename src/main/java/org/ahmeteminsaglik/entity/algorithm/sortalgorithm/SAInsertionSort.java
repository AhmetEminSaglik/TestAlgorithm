package org.ahmeteminsaglik.entity.algorithm.sortalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.concrete.sort.InsertionSort;

import java.util.List;

public class SAInsertionSort extends BaseSortAlgorithmComplexityCalculation implements BaseSortAlgorithmFunction {
    public SAInsertionSort(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
        baseSortAlgorithmFunction = new InsertionSort();
    }

    @Override
    public List<String> sort(List<String> list) {
        return baseSortAlgorithmFunction.sort(list);
    }

    @Override
    public String[] sort(String[] arr) {
        return baseSortAlgorithmFunction.sort(arr);
    }
}
