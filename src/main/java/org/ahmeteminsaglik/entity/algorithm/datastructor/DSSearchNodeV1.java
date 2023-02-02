package org.ahmeteminsaglik.entity.algorithm.datastructor;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.searchnode.business.concretes.searchnode.SearchNode;

import java.util.List;


public class DSSearchNodeV1 extends BaseDataStructorComplexityCalculation {
    private SearchNode<String> selectedDataStructorType;

    public DSSearchNodeV1(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }

    @Override
    protected void initializeSelectedDataStructorType() {
        selectedDataStructorType = new SearchNode<>();
    }

    @Override
    protected void addValuesToDataStructorType() {
        selectedDataStructorType.addAll(wordListString);
    }

    @Override
    public void visit(BaseSortAlgorithmComplexityCalculation baseSortAlgorithm) {
//        try {
            baseSortAlgorithm.sort(selectedDataStructorType);
//        } catch (InvalidSelectedSortAlgorithmException e) {
//            throw new RuntimeException(e);
//        }
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
