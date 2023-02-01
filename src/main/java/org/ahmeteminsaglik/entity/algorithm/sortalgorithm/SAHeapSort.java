package org.ahmeteminsaglik.entity.algorithm.sortalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.hibernate.cfg.NotYetImplementedException;

import java.util.List;

public class SAHeapSort extends BaseSortAlgorithmComplexityCalculation implements BaseSortAlgorithmFunction {
//    BaseSortAlgorithmFunction baseSortAlgorithmFunction = new BubbleSort();

    public SAHeapSort(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }


    @Override
    public void sort(List<String> list) {
        throw new NotYetImplementedException();
    }

    @Override
    public void sort(String[] arr) {
        throw new NotYetImplementedException();
    }


}