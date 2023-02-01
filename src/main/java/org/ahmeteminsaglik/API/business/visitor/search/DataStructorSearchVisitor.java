package org.ahmeteminsaglik.API.business.visitor.search;

import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;

public interface DataStructorSearchVisitor {
    int visit(BaseSearchAlgorithmComplexityCalculation baseSearchAlgorithm);
}
