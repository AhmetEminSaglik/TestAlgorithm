package org.ahmeteminsaglik.API.business.abstracts;

import org.ahmeteminsaglik.MemoryUsage;
import org.ahmeteminsaglik.Stopwatch;

public interface ComplexityCalculationResultService {
    Stopwatch getStopwatch();

    MemoryUsage getMemoryUsage();
}
