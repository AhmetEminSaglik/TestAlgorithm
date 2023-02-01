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
    public List<String> getSelectedDataStructorType() {
        return selectedDataStructorType;
    }

    @Override
    public void visit(BaseSortAlgorithmComplexityCalculation baseSortAlgorithm) {
        baseSortAlgorithm.sort(selectedDataStructorType);
    }
/*    private  void printList(){
        for(String tmp : selectedDataStructorType){
            System.out.print(tmp+", ");
        }
    }*/

    @Override
    public int visit(BaseSearchAlgorithmComplexityCalculation baseSearchAlgorithm) {
        return baseSearchAlgorithm.search(selectedDataStructorType, baseSearchAlgorithm.getWordSearchList());
    }
}
