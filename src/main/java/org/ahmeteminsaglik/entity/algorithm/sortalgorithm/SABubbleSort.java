package org.ahmeteminsaglik.entity.algorithm.sortalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.concrete.sort.BubbleSort;

import java.util.List;

public class SABubbleSort extends BaseSortAlgorithmComplexityCalculation implements BaseSortAlgorithmFunction {
    public SABubbleSort(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
        baseSortAlgorithmFunction = new BubbleSort();
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
