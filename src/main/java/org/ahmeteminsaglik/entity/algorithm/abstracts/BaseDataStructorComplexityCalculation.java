package org.ahmeteminsaglik.entity.algorithm.abstracts;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.enums.EnumWordTable;
import org.ahmeteminsaglik.utility.RetriveDataFromDBUtility;

import java.util.List;

public abstract class BaseDataStructorComplexityCalculation extends AbstractTestRealizationForComplexityCalculation {
    //    private EnumDataStructor enumDataStructor;
    private EnumWordTable wordTablePool;
    protected List<String> wordListString;

    public BaseDataStructorComplexityCalculation(EnumWordTable totalEnumWordList) {
        this.wordTablePool = totalEnumWordList;
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
    protected void setResultsAfterTest(TestAlgorithmResult testAlgorithmResult) {
        testAlgorithmResult.setComplexityConseptDataStructor(stopwatch, memoryUsage);
    }

    private final void prepareWordList() {
        wordListString = RetriveDataFromDBUtility.getWordListFromDatabaseInStringFormat(wordTablePool);
    }

    public abstract Object getSelectedDataStructorType();

    protected abstract void initializeSelectedDataStructorType();
}
