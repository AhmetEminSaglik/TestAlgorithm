package org.ahmeteminsaglik.entity.algorithm.datastructor;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.entity.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.abstracts.BaseSortAlgorithmComplexityCalculation;

import java.util.HashMap;
import java.util.List;

public class DSHashMap extends BaseDataStructorComplexityCalculation {
    public DSHashMap(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }

    private HashMap<String, String> selectedDataStructorType;

    @Override
    protected void initializeSelectedDataStructorType() {
        selectedDataStructorType = new HashMap<>();
    }

    @Override
    protected void addValuesToDataStructorType() {
        for (String tmp : wordListString) {
            selectedDataStructorType.put(tmp, tmp);
        }
    }

    /*No-sort Algorithm For Hashset*/
    @Override
    public void visit(BaseSortAlgorithmComplexityCalculation baseSortAlgorithm) {
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
