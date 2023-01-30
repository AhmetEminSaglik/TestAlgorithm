package org.ahmeteminsaglik.API.business.abstracts;

import org.ahmeteminsaglik.API.business.concrete.ComplexityCalculationManagement;
import org.ahmeteminsaglik.MemoryUsage;
import org.ahmeteminsaglik.Stopwatch;
import org.ahmeteminsaglik.TestAlgorithmResult;

public abstract class AbstractTestRealizationForComplexityCalculation implements ComplexityCalculationResultService {
    protected ComplexityCalculationService complexityService = new ComplexityCalculationManagement();
    protected TestAlgorithmResult testAlgorithmResult;

    public AbstractTestRealizationForComplexityCalculation(TestAlgorithmResult testAlgorithmResult) {
        this.testAlgorithmResult = testAlgorithmResult;
    }

    /** Data Structor, sort algorithm and search algorithm is selected in this function
     * also any data is complicated here. For instance get word list from database...
    * */
    protected abstract void prepareBeforeTest();

    public final void testAlgorithm() {
        prepareBeforeTest();
        startCalculation();
        realizeTestProcess();
        stopCalculation();
        setResultsAfterTest();
    }

    protected abstract void realizeTestProcess();

    protected abstract void setResultsAfterTest();

    protected final void startCalculation() {
        complexityService.startComplexityCalculation();
    }

    protected final void stopCalculation() {
        complexityService.stopComplexityCalculation();
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
