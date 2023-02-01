package org.ahmeteminsaglik.entity.algorithm.abstracts;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.API.business.visitor.search.DataStructorSearchElement;
import org.ahmeteminsaglik.API.business.visitor.search.DataStructorSearchVisitor;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.WordProcessStatistics;
import org.ahmeteminsaglik.enums.EnumWordTable;
import org.ahmeteminsaglik.utility.RetriveDataFromDBUtility;

import java.util.List;

public abstract class BaseSearchAlgorithmComplexityCalculation extends AbstractTestRealizationForComplexityCalculation implements BaseSearchAlgorithmFunction, DataStructorSearchElement {
    private EnumWordTable wordTableSearch;
    private List<String> wordSearchList;
    private int foundWords = 0;
    private int missingWords = 0;
    private DataStructorSearchVisitor visitor;
    protected BaseSearchAlgorithmFunction baseSearchAlgorithmFunction;

    public BaseSearchAlgorithmComplexityCalculation(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
        this.wordTableSearch = testAlgorithmResult.getWordProcessUsedTable().getEnumSearchWordList();
    }

    private void accept(DataStructorSearchVisitor visitor) {
        foundWords = visitor.visit(this);
        missingWords = wordSearchList.size() - foundWords;
    }

    @Override
    public void setVisitorForSearchProcess(DataStructorSearchVisitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public void prepareBeforeTest() {
        prepareSearchWordList();
    }

    @Override
    protected void realizeTestProcess() {
        accept(visitor);
    }

    @Override
    protected void setResultsAfterTest() {
        testAlgorithmResult.setComplexityConseptSearchAlgorithm(stopwatch, memoryUsage);
        testAlgorithmResult.setWordProcessStatistic(new WordProcessStatistics(foundWords, missingWords));
    }

    private final void prepareSearchWordList() {
        wordSearchList = RetriveDataFromDBUtility.getWordListFromDatabaseInStringFormat(wordTableSearch);
    }

    public List<String> getWordSearchList() {
        return wordSearchList;
    }
}
