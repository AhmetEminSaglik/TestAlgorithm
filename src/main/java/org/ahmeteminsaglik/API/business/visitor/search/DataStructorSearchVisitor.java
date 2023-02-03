package org.ahmeteminsaglik.API.business.visitor.search;

import org.ahmeteminsaglik.entity.abstracts.BaseSearchAlgorithmComplexityCalculation;

public interface DataStructorSearchVisitor {
    int visit(BaseSearchAlgorithmComplexityCalculation baseSearchAlgorithm);
}
