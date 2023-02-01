package org.ahmeteminsaglik;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
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

        BaseDataStructorComplexityCalculation baseDataStructor = VisitorValues.getDataStructor(testAlgorithmResult);

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
            visitor.visit(tmp);
        }
        testAlgorithmResult.getDataStructorComplexityConcept();
        testAlgorithmResult.getSortAlgorithmComplexityConcept();
        testAlgorithmResult.getSearchAlgorithmProcess();
    }

}
