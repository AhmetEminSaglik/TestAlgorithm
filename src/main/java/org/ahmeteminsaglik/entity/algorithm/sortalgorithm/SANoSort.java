package org.ahmeteminsaglik.entity.algorithm.sortalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;

import java.util.List;

public class SANoSort extends BaseSortAlgorithmComplexityCalculation implements BaseSortAlgorithmFunction {
    public SANoSort(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }

    @Override
    public void sort(List<String> list) {
        System.out.println("There wont be any sort process");
    }

    @Override
    public void sort(String[] arr) {
        System.out.println("There wont be any sort process");

    }
}
