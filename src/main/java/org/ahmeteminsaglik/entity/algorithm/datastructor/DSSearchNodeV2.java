package org.ahmeteminsaglik.entity.algorithm.datastructor;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.hibernate.cfg.NotYetImplementedException;

public class DSSearchNodeV2 extends BaseDataStructorComplexityCalculation {
    public DSSearchNodeV2(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
    }

    @Override
    public int visit(BaseSearchAlgorithmComplexityCalculation baseSearchAlgorithm) {
        throw new  NotYetImplementedException();
    }

    @Override
    public void visit(BaseSortAlgorithmComplexityCalculation baseSortAlgorithm) {
        throw new  NotYetImplementedException();
    }

    @Override
    protected void addValuesToDataStructorType() {
        throw new  NotYetImplementedException();
    }

    @Override
    protected void initializeSelectedDataStructorType() {
        throw new  NotYetImplementedException();
    }
}
