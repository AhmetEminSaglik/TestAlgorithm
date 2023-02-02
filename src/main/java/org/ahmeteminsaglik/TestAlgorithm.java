package org.ahmeteminsaglik;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.visitor.TestRealizationVisitor;
import org.ahmeteminsaglik.API.business.visitor.concrete.TestRealizationVisitorImpl;
import org.ahmeteminsaglik.core.exception.InvalidSelectedSearchAlgorithmException;
import org.ahmeteminsaglik.core.exception.InvalidSelectedSortAlgorithmException;
import org.ahmeteminsaglik.entity.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.entity.abstracts.BaseSortAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.utility.visitor.VisitorValues;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TestAlgorithm {
    private TestAlgorithmResult testAlgorithmResult;
    private final Logger logger= Logger.getLogger(getClass().getName());
    private List<AbstractTestRealizationForComplexityCalculation> getUsedAlgorithms() throws InvalidSelectedSortAlgorithmException, InvalidSelectedSearchAlgorithmException {
        List<AbstractTestRealizationForComplexityCalculation> list = new ArrayList<>();

        BaseDataStructorComplexityCalculation baseDataStructor = getBaseDataStructor(testAlgorithmResult);
        BaseSortAlgorithmComplexityCalculation baseSortAlgo = getBaseSortAlgorithm(baseDataStructor, testAlgorithmResult);
        BaseSearchAlgorithmComplexityCalculation baseSearchAlgo = getBaseSearchAlgorithm(baseDataStructor, testAlgorithmResult);
        list.add(baseDataStructor);
        list.add(baseSortAlgo);
        list.add(baseSearchAlgo);
        return list;
    }

    private BaseDataStructorComplexityCalculation getBaseDataStructor(TestAlgorithmResult testAlgorithmResult) {
        return VisitorValues.getDataStructor(testAlgorithmResult);
    }

    private BaseSortAlgorithmComplexityCalculation getBaseSortAlgorithm(BaseDataStructorComplexityCalculation baseDataStructor, TestAlgorithmResult testAlgorithmResult) throws InvalidSelectedSortAlgorithmException {
        BaseSortAlgorithmComplexityCalculation baseSortAlgo = VisitorValues.getSortAlgorithm(testAlgorithmResult.getDataStructorProcess(), testAlgorithmResult);
        baseSortAlgo.setVisitorForSortProcess(baseDataStructor);
        return baseSortAlgo;
    }

    private BaseSearchAlgorithmComplexityCalculation getBaseSearchAlgorithm(BaseDataStructorComplexityCalculation baseDataStructor, TestAlgorithmResult testAlgorithmResult) throws InvalidSelectedSearchAlgorithmException {

        BaseSearchAlgorithmComplexityCalculation baseSearchAlgo = VisitorValues.getSearchAlgorithm(testAlgorithmResult.getDataStructorProcess(), testAlgorithmResult);
        baseSearchAlgo.setVisitorForSearchProcess(baseDataStructor);
        return baseSearchAlgo;
    }


    public void test(TestAlgorithmResult testAlgorithmResult) {
        try {
            this.testAlgorithmResult = testAlgorithmResult;
            List<AbstractTestRealizationForComplexityCalculation> testRealization = getUsedAlgorithms();
            TestRealizationVisitor visitor = new TestRealizationVisitorImpl();
            for (AbstractTestRealizationForComplexityCalculation tmp : testRealization) {
                visitor.visit(tmp);
            }
            testAlgorithmResult.getDataStructorComplexityConcept();
            testAlgorithmResult.getSortAlgorithmComplexityConcept();
            testAlgorithmResult.getSearchAlgorithmProcess();
        } catch (InvalidSelectedSortAlgorithmException | InvalidSelectedSearchAlgorithmException e) {
            logger.severe(e.getMessage());
        }
    }



}
