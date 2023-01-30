package org.ahmeteminsaglik.entity.algorithm.datastructor;

import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.TestAlgorithmResult;

import java.util.ArrayList;
import java.util.List;

public class DSArrayList extends BaseDataStructorComplexityCalculation {
    private List<String> dataStructorList = new ArrayList<>();

    public DSArrayList(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }

    @Override
    protected void realizeTestProcess() {
        for (String tmp : wordListString) {
            dataStructorList.add(tmp);
        }
    }

//    @Override
//    protected void prepareBeforeTest() {
//        super.prepareBeforeTest();
//    }


//    @Override
//    protected void setResultsAfterTest() {
//        super.setResultsAfterTest();
//    }
}
