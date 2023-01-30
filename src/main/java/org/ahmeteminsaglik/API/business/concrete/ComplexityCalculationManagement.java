package org.ahmeteminsaglik.API.business.concrete;


import org.ahmeteminsaglik.API.business.abstracts.ComplexityCalculationService;
import org.ahmeteminsaglik.MemoryUsage;
import org.ahmeteminsaglik.Stopwatch;

public class ComplexityCalculationManagement implements ComplexityCalculationService {
    private Stopwatch stopwatch;
    private MemoryUsage memoryUsage;

    public ComplexityCalculationManagement() {
        stopwatch = new Stopwatch();
        memoryUsage = new MemoryUsage();
    }

    @Override
    public void startComplexityCalculation() {
        stopwatch.startTime();
        memoryUsage.calculateMemoryBeforeProcess();
    }

    @Override
    public void stopComplexityCalculation() {
        stopwatch.stopTime();
        memoryUsage.calculateMemoryAfterProcess();
    }

    @Override
    public Stopwatch getStopwatch() {
        return stopwatch;
    }

    @Override
    public MemoryUsage getMemoryUsage() {
        return memoryUsage;
    }
}
