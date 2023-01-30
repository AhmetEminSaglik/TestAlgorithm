package org.ahmeteminsaglik;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.API.concretes.SearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.API.concretes.SortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.datastructor.DSArrayList;

public class TestAlgorithm {
    private TestAlgorithmResult testAlgorithmResult;

    public void test(TestAlgorithmResult testAlgorithmResult) {
        this.testAlgorithmResult = testAlgorithmResult;
        //Data Structor complexity calculation :
        BaseDataStructorComplexityCalculation dataStructorComplexityCalculation = new DSArrayList(testAlgorithmResult);
        dataStructorComplexityCalculation.testAlgorithm();
        System.out.println(testAlgorithmResult.getDataStructorComplexityConcept().toString());
//        System.exit(0);
        //Sort Algorithm complexity calculation :
        AbstractTestRealizationForComplexityCalculation sortAlgorithmComplexityCalculation = new SortAlgorithmComplexityCalculation(testAlgorithmResult);
        sortAlgorithmComplexityCalculation.testAlgorithm();
//        sortAlgorithmComplexityCalculation.startComplexityCalculation();
//        sortAlgorithmComplexityCalculation.stopComplexityCalculation();

        //Sort Algorithm complexity calculation :
        AbstractTestRealizationForComplexityCalculation searchAlgorithmComplexityCalculation = new SearchAlgorithmComplexityCalculation(testAlgorithmResult);
//        searchAlgorithmComplexityCalculation.startComplexityCalculation();
//        searchAlgorithmComplexityCalculation.stopComplexityCalculation();

        testAlgorithmResult.getDataStructorComplexityConcept();
        testAlgorithmResult.getSortAlgorithmComplexityConcept();
        testAlgorithmResult.getSearchAlgorithmProcess();

    }

    public TestAlgorithmResult getTestResult() {
        return testAlgorithmResult;
    }
}
