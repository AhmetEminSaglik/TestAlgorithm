package org.ahmeteminsaglik.API.business.visitor.concrete;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.visitor.TestRealizationVisitor;

public class TestRealizationVisitorImpl implements TestRealizationVisitor {

    @Override
    public void visit(AbstractTestRealizationForComplexityCalculation abstractTestRealization) {
        abstractTestRealization.testAlgorithm();
    }
}
