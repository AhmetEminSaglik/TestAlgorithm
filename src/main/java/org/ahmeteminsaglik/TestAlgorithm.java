package org.ahmeteminsaglik;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.visitor.TestRealizationVisitor;
import org.ahmeteminsaglik.API.business.visitor.concrete.TestRealizationVisitorImpl;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.API.concretes.SearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.datastructor.DSArrayList;
import org.ahmeteminsaglik.entity.algorithm.sortalgorithm.SABubbleSort;
import org.ahmeteminsaglik.utility.visitor.VisitorValues;

import java.util.ArrayList;
import java.util.List;

public class TestAlgorithm {
    private TestAlgorithmResult testAlgorithmResult;
    private BaseDataStructorComplexityCalculation baseDataStructor;
    private BaseSortAlgorithmComplexityCalculation baseSortAlgorithm;

    private List<AbstractTestRealizationForComplexityCalculation> getUsedAlgorithms(TestAlgorithmResult testAlgorithmResult) {
        List<AbstractTestRealizationForComplexityCalculation> list = new ArrayList<>();

        BaseDataStructorComplexityCalculation baseDataStructor = VisitorValues.getDataStructor(testAlgorithmResult);
//        baseDataStructor = VisitorValues.getDataStructor(testAlgorithmResult);
//        baseDataStructor.testAlgorithm();
//        baseSortAlgorithm = VisitorValues.getSortAlgorithm(testAlgorithmResult);
        System.out.println("baseDataStructor : "+baseDataStructor);
        BaseSortAlgorithmComplexityCalculation baseSortAlgo = VisitorValues.getSortAlgorithm(testAlgorithmResult);
        baseSortAlgo.setDataStructorToBeSort(baseDataStructor,baseSortAlgo);

        list.add(baseDataStructor);
        list.add(baseSortAlgo);
//        baseSortAlgorithm.testAlgorithm();

//        baseSortAlgorithm = new SABubbleSort(testAlgorithmResult);

//        baseSortAlgorithm.sortDataStructor(baseDataStructor.getSelectedDataStructorType());
//        list.add()
//        list.add(getDataStructor(testAlgorithmResult));
//        list.add(getDataStructor(testAlgorithmResult));

        return list;

    }


    public void test(TestAlgorithmResult testAlgorithmResult) {
        this.testAlgorithmResult = testAlgorithmResult;
        //Data Structor complexity calculation :

        List<AbstractTestRealizationForComplexityCalculation> testRealization = getUsedAlgorithms(testAlgorithmResult);
//        testRealization.add(new DSArrayList(testAlgorithmResult));
//        testRealization.add(new DSArray(testAlgorithmResult));

        TestRealizationVisitor visitor = new TestRealizationVisitorImpl();
        for (AbstractTestRealizationForComplexityCalculation tmp : testRealization) {
            System.out.println("----------> ziyaret edilen tmp : " + tmp.getClass().getSimpleName());
            visitor.visit(tmp);
        }
        System.out.println("--------------------------------------------------");
//        System.exit(0);


        BaseDataStructorComplexityCalculation dataStructorComplexityCalculation = new DSArrayList(testAlgorithmResult);
        dataStructorComplexityCalculation.testAlgorithm();
//        System.out.println(testAlgorithmResult.getDataStructorComplexityConcept().toString());
//        System.exit(0);
        //Sort Algorithm complexity calculation :
//        AbstractTestRealizationForComplexityCalculation sortAlgorithmComplexityCalculation = new SABubbleSort(testAlgorithmResult);
//        sortAlgorithmComplexityCalculation.testAlgorithm();
//        sortAlgorithmComplexityCalculation.startComplexityCalculation();
//        sortAlgorithmComplexityCalculation.stopComplexityCalculation();

        //Sort Algorithm complexity calculation :
//        AbstractTestRealizationForComplexityCalculation searchAlgorithmComplexityCalculation = new SearchAlgorithmComplexityCalculation(testAlgorithmResult);
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
