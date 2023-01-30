package org.ahmeteminsaglik.entity.algorithm.abstracts;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;

public class BaseSortAlgorithmComplexityCalculation extends AbstractTestRealizationForComplexityCalculation {
    private EnumSortAlgorithm enumSortAlgorithm;

    public BaseSortAlgorithmComplexityCalculation(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
        this.enumSortAlgorithm = testAlgorithmResult.getSortAlgorithmProcess();
    }

    @Override
    protected void prepareBeforeTest() {

    }

    @Override
    protected void realizeTestProcess() {

    }

    @Override
    protected void setResultsAfterTest() {

    }
}
