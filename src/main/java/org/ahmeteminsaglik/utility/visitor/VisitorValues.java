package org.ahmeteminsaglik.utility.visitor;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.datastructor.DSArray;
import org.ahmeteminsaglik.entity.algorithm.datastructor.DSArrayList;
import org.ahmeteminsaglik.entity.algorithm.sortalgorithm.SABubbleSort;
import org.ahmeteminsaglik.entity.algorithm.sortalgorithm.SAInsertionSort;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;

public class VisitorValues {
    public synchronized static BaseDataStructorComplexityCalculation getDataStructor(TestAlgorithmResult testAlgorithmResult) {
        if (EnumDataStructor.ARRAYLIST.equals(testAlgorithmResult.getDataStructorProcess())) {
            return new DSArrayList(testAlgorithmResult);
        }
        if (EnumDataStructor.ARRAY.equals(testAlgorithmResult.getDataStructorProcess())) {
            return new DSArray(testAlgorithmResult);
        }
        return null;
    }

    public synchronized static BaseSortAlgorithmComplexityCalculation getSortAlgorithm(TestAlgorithmResult testAlgorithmResult) {
        if (EnumSortAlgorithm.BUBBLE_SORT.equals(testAlgorithmResult.getSortAlgorithmProcess())) {
            return new SABubbleSort(testAlgorithmResult);
        }
        if (EnumSortAlgorithm.INSERTION_SORT.equals(testAlgorithmResult.getSortAlgorithmProcess()))
            return new SAInsertionSort(testAlgorithmResult);

        System.out.println("NULLL SORT ALGORITHM");
        return null;
    }

    /*public synchronized static BaseSortAlgorithmComplexityCalculation getSortAlgorithm(TestAlgorithmResult testAlgorithmResult){
//        if(EnumSortAlgorithm.SELECTION_SORT.equals(tes))
    }*/
}