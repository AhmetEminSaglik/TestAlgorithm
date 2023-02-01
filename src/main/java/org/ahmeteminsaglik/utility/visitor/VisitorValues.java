package org.ahmeteminsaglik.utility.visitor;

import org.ahmeteminsaglik.AvailableAlgorithm;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.datastructor.*;
import org.ahmeteminsaglik.entity.algorithm.searchalgorithm.*;
import org.ahmeteminsaglik.entity.algorithm.sortalgorithm.*;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;

import java.util.List;
import java.util.Objects;

public class VisitorValues {
    private static AvailableAlgorithm availableAlgorithm = new AvailableAlgorithm();

    public synchronized static BaseDataStructorComplexityCalculation getDataStructor(TestAlgorithmResult testAlgorithmResult) {
        switch (testAlgorithmResult.getDataStructorProcess()) {
            case ARRAY:
                return new DSArray(testAlgorithmResult);
            case ARRAYLIST:
                return new DSArrayList(testAlgorithmResult);
            case HASHMAP:
                return new DSHashMap(testAlgorithmResult);
            case SEARCHNODE_V1:
                return new DSSearchNodeV1(testAlgorithmResult);
            case SEARCHNODE_V2:
                return new DSSearchNodeV2(testAlgorithmResult);
            default:
                //todo add exception here
                System.err.println("---> Invalid dataStructor is given to testAlgorithmResult");
                return null;
        }
    }

    public synchronized static BaseSortAlgorithmComplexityCalculation getSortAlgorithm(EnumDataStructor enumDataStructor, TestAlgorithmResult testAlgorithmResult) {

        EnumSortAlgorithm decidedEnumSortAlgorithm = getRequestEnumSortAlgorithm(enumDataStructor, testAlgorithmResult);

        switch (Objects.requireNonNull(decidedEnumSortAlgorithm)) {
            case SELECTION_SORT:
                return new SASelectionSort(testAlgorithmResult);
            case INSERTION_SORT:
                return new SAInsertionSort(testAlgorithmResult);
            case BUBBLE_SORT:
                return new SABubbleSort(testAlgorithmResult);
            case MERGE_SORT:
                return new SAMergeSort(testAlgorithmResult);
            case HEAP_SORT:
                return new SAHeapSort(testAlgorithmResult);
            case QUICK_SORT:
                return new SAQuickSort(testAlgorithmResult);
            case INTRO_SORT:
                return new SAIntroSort(testAlgorithmResult);
            case TIM_SORT:
                return new SATimSort(testAlgorithmResult);
            case NO_SORT:
                return new SANoSort(testAlgorithmResult);
            default:
                //todo add exception here
                System.err.println("---> Invalid dataStructor is given to testAlgorithmResult");
                return null;
        }

    }

    private static EnumSortAlgorithm getRequestEnumSortAlgorithm(EnumDataStructor enumDataStructor, TestAlgorithmResult testAlgorithmResult) {
        List<EnumSortAlgorithm> enumSortAlgorithmList = availableAlgorithm.getAvailableEnumSortAlgorithmListWithGivenDataStructor(enumDataStructor);
        for (EnumSortAlgorithm tmp : enumSortAlgorithmList) {
            if (tmp == testAlgorithmResult.getSortAlgorithmProcess()) {
                return tmp;
            }
        }
        return null;
    }



    /*public synchronized static BaseSortAlgorithmComplexityCalculation getSortAlgorithm(TestAlgorithmResult testAlgorithmResult){
//        if(EnumSortAlgorithm.SELECTION_SORT.equals(tes))
    }*/

    public synchronized static BaseSearchAlgorithmComplexityCalculation getSearchAlgorithm(EnumDataStructor enumDataStructor, TestAlgorithmResult testAlgorithmResult) {

        EnumSearchAlgorithm decidedEnumSearchAlgorithm = getRequestEnumSearchAlgorithm(enumDataStructor, testAlgorithmResult);

        switch (Objects.requireNonNull(decidedEnumSearchAlgorithm)) {
            case SEARCH_NODE:
                return new SASearchNodeSearch(testAlgorithmResult);
            case HASHMAP:
                return new SAHashMapSearch(testAlgorithmResult);
            case LINEAR_SEARCH:
                return new SALinearSearch(testAlgorithmResult);
            case BINARY_SEARCH:
                return new SABinarySearch(testAlgorithmResult);
            case TERNARY_SEARCH:
                return new SATernarySearch(testAlgorithmResult);
            case JUMP_SEARCH:
                return new SAJumpSearch(testAlgorithmResult);
            case INTERPOLATION_SEARCH:
                return new SAInterpolationSearch(testAlgorithmResult);
            case EXPONENTIAL_SEARCH:
                return new SAExponentialSearch(testAlgorithmResult);
            case FIBONACCI_SEARCH:
                return new SAFibonacciSearch(testAlgorithmResult);
            case BREADTH_FIRST_SEARCH:
                return new SABreadthFirstSearch(testAlgorithmResult);
            case DEPTH_FIRST_SEARCH:
                return new SADepthFirstSearch(testAlgorithmResult);
            default:
                //todo add exception here
                System.err.println("---> Invalid dataStructor is given to testAlgorithmResult");
                return null;

        }

    }

    private static EnumSearchAlgorithm getRequestEnumSearchAlgorithm(EnumDataStructor enumDataStructor, TestAlgorithmResult testAlgorithmResult) {

        List<EnumSearchAlgorithm> enumSearchAlgorithmList = availableAlgorithm.getAvailableEnumSearchAlgorithmListWithGivenDataStructor(enumDataStructor);
        for (EnumSearchAlgorithm tmp : enumSearchAlgorithmList) {
            if (tmp == testAlgorithmResult.getSearchAlgorithmProcess()) {
                return tmp;
            }
        }
        return null;
    }
}
