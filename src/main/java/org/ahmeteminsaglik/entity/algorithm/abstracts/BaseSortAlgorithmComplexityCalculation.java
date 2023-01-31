package org.ahmeteminsaglik.entity.algorithm.abstracts;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.API.business.visitor.sort.DataStructorSortElement;
import org.ahmeteminsaglik.API.business.visitor.sort.DataStructorSortVisitor;
import org.ahmeteminsaglik.TestAlgorithmResult;

public abstract class BaseSortAlgorithmComplexityCalculation extends AbstractTestRealizationForComplexityCalculation implements BaseSortAlgorithmFunction, DataStructorSortElement {

    private Object storedDataStructorObject;
    private BaseSortAlgorithmFunction sortAlgorithmFunction;
    private BaseDataStructorComplexityCalculation dataStructorType;
    private DataStructorSortVisitor visitor;

    public BaseSortAlgorithmComplexityCalculation(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }

    //    @Override
    private void accept(DataStructorSortVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void setVisitorForSortProcess(DataStructorSortVisitor visitor) {
        this.visitor = visitor;
    }

    @Override
    protected void prepareBeforeTest() {
    }

    @Override
    protected void realizeTestProcess() {
        System.out.println("REALIZE TEST SORT : ");
        accept(visitor);
    }

    @Override
    protected void setResultsAfterTest() {
        testAlgorithmResult.setComplexityConseptSortAlgorithm(stopwatch, memoryUsage);
    }
}
