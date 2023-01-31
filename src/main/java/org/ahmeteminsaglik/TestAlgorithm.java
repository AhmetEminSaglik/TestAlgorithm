package org.ahmeteminsaglik;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.concrete.AllTestProgressRealization;
import org.ahmeteminsaglik.API.business.visitor.TestRealizationVisitor;
import org.ahmeteminsaglik.API.business.visitor.concrete.TestRealizationVisitorImpl;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.API.concretes.SearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.datastructor.DSArrayList;
import org.ahmeteminsaglik.entity.algorithm.sortalgorithm.SABubbleSort;
import org.ahmeteminsaglik.entity.algorithm.sortalgorithm.SAInsertionSort;
import org.ahmeteminsaglik.utility.visitor.VisitorValues;

import javax.swing.plaf.basic.BasicLabelUI;
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
//        System.out.println("baseDataStructor : " + baseDataStructor);
//        BaseSortAlgorithmComplexityCalculation baseSortAlgo = VisitorValues.getSortAlgorithm(testAlgorithmResult);
//        baseSortAlgo.setDataStructorToBeSort(baseDataStructor, baseSortAlgo);

        list.add(baseDataStructor);
//        list.add(baseSortAlgo);
        return list;
    }


    public void test(TestAlgorithmResult testAlgorithmResult) {
        AllTestProgressRealization allTest = new AllTestProgressRealization(testAlgorithmResult);
        allTest.setBaseDataStructor(VisitorValues.getDataStructor(testAlgorithmResult));
//        allTest.setBaseDataStructor(new DSArrayList(testAlgorithmResult.getWordProcessUsedTable().getEnumTotalWordList()));
//        allTest.setBaseSortAlgortihm(new SAInsertionSort(testAlgorithmResult));
//        allTest.setBaseSearchAlgortihm();


        this.testAlgorithmResult = testAlgorithmResult;
        //Data Structor complexity calculation :

        List<AbstractTestRealizationForComplexityCalculation> testRealization = getUsedAlgorithms(testAlgorithmResult);

        TestRealizationVisitor visitor = new TestRealizationVisitorImpl();
        for (AbstractTestRealizationForComplexityCalculation tmp : testRealization) {
            System.out.println("----------> ziyaret edilen tmp : " + tmp.getClass().getSimpleName());
            visitor.visit(tmp);
        }
        System.out.println("--------------------------------------------------");


    }

    public TestAlgorithmResult getTestResult() {
        return testAlgorithmResult;
    }
}
