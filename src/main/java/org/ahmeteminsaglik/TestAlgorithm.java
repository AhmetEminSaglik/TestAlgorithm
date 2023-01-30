package org.ahmeteminsaglik;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.visitor.TestRealizationVisitor;
import org.ahmeteminsaglik.API.business.visitor.concrete.TestRealizationVisitorImpl;
import org.ahmeteminsaglik.core.utility.enums.EnumUtility;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.API.concretes.SearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.API.concretes.SortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.datastructor.DSArray;
import org.ahmeteminsaglik.entity.algorithm.datastructor.DSArrayList;
import org.ahmeteminsaglik.enums.EnumDataStructor;

import java.util.ArrayList;
import java.util.List;

public class TestAlgorithm {
    private TestAlgorithmResult testAlgorithmResult;

    private List<AbstractTestRealizationForComplexityCalculation> getUsedAlgorithms(TestAlgorithmResult testAlgorithmResult) {
        List<AbstractTestRealizationForComplexityCalculation> list = new ArrayList<>();

        list.add(getDataStructor(testAlgorithmResult));
//        list.add(getDataStructor(testAlgorithmResult));
//        list.add(getDataStructor(testAlgorithmResult));

        return list;

    }

    private BaseDataStructorComplexityCalculation getDataStructor(TestAlgorithmResult testAlgorithmResult) {

//        List<EnumDataStructor> enumList = EnumUtility.getEnumDataStructorList();
//        for (EnumDataStructor tmp = enumList) {
//            if (tmp.equals(testAlgorithmResult.getDataStructorProcess())) {
//                return tmp;
//            }
//        }

        if (EnumDataStructor.ARRAYLIST.equals(testAlgorithmResult.getDataStructorProcess())) {
            return new DSArrayList(testAlgorithmResult);
        }
        if (EnumDataStructor.ARRAY.equals(testAlgorithmResult.getDataStructorProcess())) {
            return new DSArray(testAlgorithmResult);
        }
        return null;
    }

    public void test(TestAlgorithmResult testAlgorithmResult) {
        this.testAlgorithmResult = testAlgorithmResult;
        //Data Structor complexity calculation :

        List<AbstractTestRealizationForComplexityCalculation> testRealization = getUsedAlgorithms(testAlgorithmResult);
//        testRealization.add(new DSArrayList(testAlgorithmResult));
//        testRealization.add(new DSArray(testAlgorithmResult));

        TestRealizationVisitor visitor = new TestRealizationVisitorImpl();
        for (AbstractTestRealizationForComplexityCalculation tmp : testRealization) {
            System.out.println("ziyaret edilen tmp : " + tmp.getClass().getSimpleName());
            visitor.visit(tmp);
        }
        System.out.println("--------------------------------------------------");
        System.exit(0);


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
