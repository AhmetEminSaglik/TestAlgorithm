package org.ahmeteminsaglik.entity.algorithm.sortalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.hibernate.cfg.NotYetImplementedException;

import java.util.List;

public class SAQuickSort extends BaseSortAlgorithmComplexityCalculation implements BaseSortAlgorithmFunction {
//    BaseSortAlgorithmFunction baseSortAlgorithmFunction = new BubbleSort();

    public SAQuickSort(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }


    @Override
    public List<String> sort(List<String> list) {
        throw new NotYetImplementedException();
    }

    @Override
    public String[] sort(String[] arr) {
        throw new NotYetImplementedException();
    }


}
