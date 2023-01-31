package org.ahmeteminsaglik.entity.algorithm.sortalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.concrete.sort.BubbleSort;

import java.util.List;

public class SABubbleSort extends BaseSortAlgorithmComplexityCalculation implements BaseSortAlgorithmFunction {
    BaseSortAlgorithmFunction baseSortAlgorithmFunction = new BubbleSort();

    public SABubbleSort(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }


    @Override
    public void sort(List<String> list) {
        System.out.println("Bubble Sort ARRAYLIST : size : "+list.size());
        baseSortAlgorithmFunction.sort(list);
    }

    @Override
    public void sort(String[] arr) {
        System.out.println("Bubble Sort ARRAY : size : "+arr.length);
        baseSortAlgorithmFunction.sort(arr);
    }


}
