package org.ahmeteminsaglik.entity.algorithm.sortalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.concrete.sort.InsertionSort;

import java.util.List;

public class SAInsertionSort extends BaseSortAlgorithmComplexityCalculation implements  BaseSortAlgorithmFunction {
    BaseSortAlgorithmFunction baseSortAlgorithmFunction = new InsertionSort();

    public SAInsertionSort(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }


    @Override
    public void sort(List<String> list) {
        System.out.println("Insertion Sort ARRAYLIST : size : "+list.size());
        baseSortAlgorithmFunction.sort(list);
    }

    @Override
    public void sort(String[] arr) {
        System.out.println("Insertion Sort ARRAY : size :  "+arr.length);
        baseSortAlgorithmFunction.sort(arr);
    }
}
