package org.ahmeteminsaglik;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.API.business.visitor.TestRealizationVisitor;
import org.ahmeteminsaglik.API.business.visitor.concrete.TestRealizationVisitorImpl;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
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

        BaseDataStructorComplexityCalculation baseDataStructor = getBaseDataStructor(testAlgorithmResult);
        BaseSortAlgorithmComplexityCalculation baseSortAlgo = getBaseSortAlgorithm(baseDataStructor, testAlgorithmResult);
        BaseSearchAlgorithmComplexityCalculation baseSearchAlgo = getBaseSearchAlgorithm(baseDataStructor, testAlgorithmResult);
        list.add(baseDataStructor);
        list.add(baseSortAlgo);
        list.add(baseSearchAlgo);
        return list;
    }

    private BaseDataStructorComplexityCalculation getBaseDataStructor(TestAlgorithmResult testAlgorithmResult) {
        return VisitorValues.getDataStructor(testAlgorithmResult);
    }

    private BaseSortAlgorithmComplexityCalculation getBaseSortAlgorithm(BaseDataStructorComplexityCalculation baseDataStructor, TestAlgorithmResult testAlgorithmResult) {
        BaseSortAlgorithmComplexityCalculation baseSortAlgo = VisitorValues.getSortAlgorithm(testAlgorithmResult.getDataStructorProcess(), testAlgorithmResult);
        baseSortAlgo.setVisitorForSortProcess(baseDataStructor);
        return baseSortAlgo;
    }

    private BaseSearchAlgorithmComplexityCalculation getBaseSearchAlgorithm(BaseDataStructorComplexityCalculation baseDataStructor, TestAlgorithmResult testAlgorithmResult) {
        BaseSearchAlgorithmComplexityCalculation baseSearchAlgo = VisitorValues.getSearchAlgorithm(testAlgorithmResult.getDataStructorProcess(), testAlgorithmResult);
        baseSearchAlgo.setVisitorForSearchProcess(baseDataStructor);
        return baseSearchAlgo;
    }


    public void test(TestAlgorithmResult testAlgorithmResult) {
        this.testAlgorithmResult = testAlgorithmResult;
        List<AbstractTestRealizationForComplexityCalculation> testRealization = getUsedAlgorithms();
        TestRealizationVisitor visitor = new TestRealizationVisitorImpl();
        for (AbstractTestRealizationForComplexityCalculation tmp : testRealization) {
            System.out.println("tmp : " + tmp);
            visitor.visit(tmp);
        }
        testAlgorithmResult.getDataStructorComplexityConcept();
        testAlgorithmResult.getSortAlgorithmComplexityConcept();
        testAlgorithmResult.getSearchAlgorithmProcess();
    }


}
