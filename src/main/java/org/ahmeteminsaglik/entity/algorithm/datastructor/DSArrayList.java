package org.ahmeteminsaglik.entity.algorithm.datastructor;

import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;

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

    @Override
    public void visit(BaseSortAlgorithmComplexityCalculation baseSortAlgorithm) {
        selectedDataStructorType = baseSortAlgorithm.sort(selectedDataStructorType);
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
