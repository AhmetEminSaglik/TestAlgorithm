package org.ahmeteminsaglik.entity.algorithm.datastructor;

import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.TestAlgorithmResult;

import java.util.ArrayList;
import java.util.List;

public class DSArrayList extends BaseDataStructorComplexityCalculation {
    private List<String> selectedDataStructorType;

    public DSArrayList(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }

    @Override
    protected void initializeSelectedDataStructorType() {
        selectedDataStructorType = new ArrayList<>();
    }

    @Override
    protected void addValuesToDataStructorType() {
        System.out.println("add values in DS ARRAYLIST ");
        for (String tmp : wordListString) {
            selectedDataStructorType.add(tmp);
        }
    }


}
