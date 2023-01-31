package org.ahmeteminsaglik.API.business.abstracts;

import org.ahmeteminsaglik.API.business.concrete.ComplexityCalculationManagement;
import org.ahmeteminsaglik.API.business.visitor.TestRealizationElement;
import org.ahmeteminsaglik.API.business.visitor.TestRealizationVisitor;
import org.ahmeteminsaglik.MemoryUsage;
import org.ahmeteminsaglik.Stopwatch;
import org.ahmeteminsaglik.TestAlgorithmResult;

public abstract class AbstractTestRealizationForComplexityCalculation implements ComplexityCalculationResultService, TestRealizationElement {
    protected ComplexityCalculationService complexityService = new ComplexityCalculationManagement();
    protected TestAlgorithmResult testAlgorithmResult;

    protected Stopwatch stopwatch = complexityService.getStopwatch();
    protected MemoryUsage memoryUsage = complexityService.getMemoryUsage();

    public AbstractTestRealizationForComplexityCalculation(/*TestAlgorithmResult testAlgorithmResult*/) {
//        this.testAlgorithmResult = testAlgorithmResult;
    }

    /**
     * Data Structor, sort algorithm and search algorithm is selected in this function
     * also any data is complicated here. For instance get word list from database...
     */
    protected abstract void prepareBeforeTest();

    public final void testAlgorithm() {
        prepareBeforeTest();
        startComplexityCalculation();
        realizeTestProcess();
        stopComplexityCalculation();
//        setResultsAfterTest();
    }

    protected abstract void realizeTestProcess();

    protected abstract void setResultsAfterTest(TestAlgorithmResult testAlgorithmResult);

    protected final void startComplexityCalculation() {
        complexityService.startComplexityCalculation();
    }

    protected final void stopComplexityCalculation() {
        complexityService.stopComplexityCalculation();
    }

    @Override
    public void accept(TestRealizationVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public final Stopwatch getStopwatch() {
        return complexityService.getStopwatch();
    }

    @Override
    public final MemoryUsage getMemoryUsage() {
        return null;
    }
}
