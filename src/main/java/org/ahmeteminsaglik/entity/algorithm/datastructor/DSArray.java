package org.ahmeteminsaglik.entity.algorithm.datastructor;

import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.TestAlgorithmResult;

public class DSArray extends BaseDataStructorComplexityCalculation {

    private String[] selectedDataStructorType;

    public DSArray(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }

    @Override
    protected void initializeSelectedDataStructorType() {
        selectedDataStructorType = new String[wordListString.size()];
    }

    @Override
    protected void addValuesToDataStructorType() {
        System.out.println("add values in DS ARRAY ");
        for (int i = 0; i < wordListString.size(); i++) {
            selectedDataStructorType[i] = wordListString.get(i);
        }
    }

    @Override
    public String[] getSelectedDataStructorType() {
        return selectedDataStructorType;
    }

  /*  public String[] getSelectedDataStructorType() {
        return selectedDataStructorType;
    }*/
}
