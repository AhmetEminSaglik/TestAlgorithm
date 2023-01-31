package org.ahmeteminsaglik.API.business.visitor.sort;

import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSortAlgorithmComplexityCalculation;

public interface DataStructorSortVisitor {
    void visit(BaseSortAlgorithmComplexityCalculation baseSortAlgorithm);
}
