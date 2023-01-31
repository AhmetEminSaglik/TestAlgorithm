package org.ahmeteminsaglik.API.business.concrete;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;

public class AllTestProgressRealization {
    TestAlgorithmResult testAlgorithmResult;

    public AllTestProgressRealization(TestAlgorithmResult testAlgorithmResult) {
        this.testAlgorithmResult = testAlgorithmResult;
    }

    public void setBaseDataStructor(BaseDataStructorComplexityCalculation baseDataStructor) {
        System.out.println("setBaseDataStructor gelldi : "+baseDataStructor.getClass().getSimpleName());
    }

    public void setBaseSortAlgortihm(BaseSortAlgorithmComplexityCalculation baseSortAlgortihm) {
    }

    public void setBaseSearchAlgortihm() {
    }
}
