package org.ahmeteminsaglik;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.visitor.TestRealizationVisitor;
import org.ahmeteminsaglik.API.business.visitor.concrete.TestRealizationVisitorImpl;
import org.ahmeteminsaglik.API.concretes.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.utility.visitor.VisitorValues;

import java.util.ArrayList;
import java.util.List;

public class TestAlgorithm {
    private TestAlgorithmResult testAlgorithmResult;
    private BaseDataStructorComplexityCalculation baseDataStructor;
    private BaseSortAlgorithmComplexityCalculation baseSortAlgorithm;

    private List<AbstractTestRealizationForComplexityCalculation> getUsedAlgorithms() {
        List<AbstractTestRealizationForComplexityCalculation> list = new ArrayList<>();

        BaseDataStructorComplexityCalculation baseDataStructor = VisitorValues.getDataStructor(testAlgorithmResult);
//        System.out.println("baseDataStructor : " + baseDataStructor);
        BaseSortAlgorithmComplexityCalculation baseSortAlgo = VisitorValues.getSortAlgorithm(testAlgorithmResult);
        baseSortAlgo.setVisitorForSortProcess(baseDataStructor);

        BaseSearchAlgorithmComplexityCalculation baseSearchAlgo = VisitorValues.getSearchAlgorithm(testAlgorithmResult);
        baseSearchAlgo.setVisitorForSearchProcess(baseDataStructor);


        list.add(baseDataStructor);
        list.add(baseSortAlgo);
        list.add(baseSearchAlgo);
        return list;

    }


    public void test(TestAlgorithmResult testAlgorithmResult) {
        this.testAlgorithmResult = testAlgorithmResult;

        List<AbstractTestRealizationForComplexityCalculation> testRealization = getUsedAlgorithms();

        TestRealizationVisitor visitor = new TestRealizationVisitorImpl();
        for (AbstractTestRealizationForComplexityCalculation tmp : testRealization) {
            System.out.println("----------> ziyaret edilen tmp : " + tmp.getClass().getSimpleName());
            visitor.visit(tmp);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("testRealization.get(1) : " + testRealization.get(1).getClass().getSimpleName());
        BaseSortAlgorithmComplexityCalculation sortAlgo = (BaseSortAlgorithmComplexityCalculation) testRealization.get(1);
        System.out.println("sortAlgo : " + sortAlgo.getClass().getSimpleName());
//        sortAlgo.
//        DataStructorSortElement visitior = (BaseSortAlgorithmComplexityCalculation)testRealization.get(1);
//        visitior.accept(baseDataStructor);

        testAlgorithmResult.getDataStructorComplexityConcept();
        testAlgorithmResult.getSortAlgorithmComplexityConcept();
        testAlgorithmResult.getSearchAlgorithmProcess();

    }

    public TestAlgorithmResult getTestResult() {
        return testAlgorithmResult;
    }
}
