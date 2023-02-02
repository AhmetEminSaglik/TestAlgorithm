package org.ahmeteminsaglik.entity.algorithm.sortalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.concrete.sort.BubbleSort;
import org.ahmeteminsaglik.entity.algorithm.concrete.sort.MergeSort;
import org.hibernate.cfg.NotYetImplementedException;

import java.util.List;

public class SAMergeSort extends BaseSortAlgorithmComplexityCalculation implements BaseSortAlgorithmFunction {
    public SAMergeSort(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
        baseSortAlgorithmFunction = new MergeSort();
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
