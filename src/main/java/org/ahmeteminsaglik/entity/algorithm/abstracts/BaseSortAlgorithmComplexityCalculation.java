package org.ahmeteminsaglik.entity.algorithm.abstracts;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entities.db.SortAlgorithm;

import java.util.List;

public abstract class BaseSortAlgorithmComplexityCalculation extends AbstractTestRealizationForComplexityCalculation implements BaseSortAlgorithmFunction {

    private Object storedDataStructorObject;
    private BaseSortAlgorithmFunction sortAlgorithmFunction;
    private BaseDataStructorComplexityCalculation dataStructorType;


    @Override
    protected void prepareBeforeTest() {
    }

    @Override
    protected void realizeTestProcess() {
        System.out.println("REALIZE TEST SORT : ");
        sortDataStructor(storedDataStructorObject, sortAlgorithmFunction);
    }

    public void setDataStructorToBeSort(Object storedDataStructorObject, BaseSortAlgorithmFunction sortAlgorithmFunction) {
        this.storedDataStructorObject = storedDataStructorObject;
        this.sortAlgorithmFunction = sortAlgorithmFunction;
        System.out.println("SET : storedDataStructorObject : " + storedDataStructorObject);
    }

    private void sortDataStructor(Object dataObject, BaseSortAlgorithmFunction sortAlgorithmFunction) {
        BaseDataStructorComplexityCalculation dataStructorType = (BaseDataStructorComplexityCalculation) dataObject;

        if (dataStructorType.getSelectedDataStructorType() instanceof List) {
            List<String> list = (List<String>) dataStructorType.getSelectedDataStructorType();
            sortAlgorithmFunction.sort(list);
        } else if (dataStructorType.getSelectedDataStructorType() instanceof String[]) {
            String[] arr = (String[]) dataStructorType.getSelectedDataStructorType();
            sortAlgorithmFunction.sort(arr);
        } else {
            System.out.println("THERE IS NO CORRECT DATATYPE TO SORT");
        }


    }

    @Override
    protected void setResultsAfterTest(TestAlgorithmResult testAlgorithmResult) {
        testAlgorithmResult.setComplexityConseptSortAlgorithm(stopwatch, memoryUsage);
    }
}
