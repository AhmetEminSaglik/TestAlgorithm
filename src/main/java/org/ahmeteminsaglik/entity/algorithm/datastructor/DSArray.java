package org.ahmeteminsaglik.entity.algorithm.datastructor;

import org.ahmeteminsaglik.API.concretes.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;

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

    @Override
    public void visit(BaseSortAlgorithmComplexityCalculation baseSortAlgorithm) {
        baseSortAlgorithm.sort(selectedDataStructorType);
    }

    @Override
    public void visit(BaseSearchAlgorithmComplexityCalculation baseSearchAlgorithm) {
        baseSearchAlgorithm.search(selectedDataStructorType, baseSearchAlgorithm.getWordSearchList());
    }

}
