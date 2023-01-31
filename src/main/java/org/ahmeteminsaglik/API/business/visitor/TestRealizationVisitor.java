package org.ahmeteminsaglik.API.business.visitor;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;

public interface TestRealizationVisitor {
    void visit(AbstractTestRealizationForComplexityCalculation abstractTestRealization);
}
