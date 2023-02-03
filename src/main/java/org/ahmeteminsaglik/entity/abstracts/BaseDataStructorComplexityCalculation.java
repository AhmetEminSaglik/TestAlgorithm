package org.ahmeteminsaglik.entity.abstracts;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;

import org.ahmeteminsaglik.API.business.visitor.search.DataStructorSearchVisitor;
import org.ahmeteminsaglik.API.business.visitor.sort.DataStructorSortVisitor;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.enums.EnumWordTable;
import org.ahmeteminsaglik.utility.RetriveDataFromDBUtility;

import java.util.List;

public abstract class BaseDataStructorComplexityCalculation extends AbstractTestRealizationForComplexityCalculation implements DataStructorSortVisitor, DataStructorSearchVisitor {
    private EnumWordTable wordTablePool;
    protected List<String> wordListString;

    public BaseDataStructorComplexityCalculation(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
        this.wordTablePool = testAlgorithmResult.getWordProcessUsedTable().getEnumTotalWordList();
    }

    @Override
    protected final void prepareBeforeTest() {
        prepareWordList();
    }


    protected abstract void addValuesToDataStructorType();

    @Override
    protected final void realizeTestProcess() {
        initializeSelectedDataStructorType();
        addValuesToDataStructorType();
    }


    @Override
    protected final void setResultsAfterTest() {
        testAlgorithmResult.setComplexityConseptDataStructor(stopwatch, memoryUsage);
    }


    private final void prepareWordList() {
        wordListString = RetriveDataFromDBUtility.getWordListFromDatabaseInStringFormat(wordTablePool);
    }


    protected abstract void initializeSelectedDataStructorType();
}
