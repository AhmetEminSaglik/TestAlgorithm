package org.ahmeteminsaglik.entity.algorithm.datastructor;

import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;

import java.util.List;

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
    public void visit(BaseSortAlgorithmComplexityCalculation baseSortAlgorithm) {
        baseSortAlgorithm.sort(selectedDataStructorType);
    }

    @Override
    public int visit(BaseSearchAlgorithmComplexityCalculation baseSearchAlgorithm) {
        int foundWordNumber = 0;
        List<String> searchWordList = baseSearchAlgorithm.getWordSearchList();
        for (int i = 0; i < searchWordList.size(); i++) {
            boolean result = baseSearchAlgorithm.search(selectedDataStructorType, searchWordList.get(i));
            if (result) {
                foundWordNumber++;
            }
        }
        return foundWordNumber;
    }

}
