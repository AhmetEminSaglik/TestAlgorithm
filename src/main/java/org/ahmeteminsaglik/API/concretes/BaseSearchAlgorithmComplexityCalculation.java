package org.ahmeteminsaglik.API.concretes;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.API.business.abstracts.BaseSortAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.WordProcessStatistics;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseDataStructorComplexityCalculation;
import org.ahmeteminsaglik.enums.EnumWordTable;
import org.ahmeteminsaglik.utility.RetriveDataFromDBUtility;

import java.util.List;

public abstract class BaseSearchAlgorithmComplexityCalculation extends AbstractTestRealizationForComplexityCalculation implements BaseSearchAlgorithmFunction {
    private EnumWordTable wordTableSearch;
    private Object storedDataStructorObject;
    protected List<String> wordSearchList;
    private BaseSearchAlgorithmFunction searchAlgorithmFunction;
    private int foundWords = 0;
    private int missingWords = 0;

    public BaseSearchAlgorithmComplexityCalculation(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
        this.wordTableSearch = testAlgorithmResult.getWordProcessUsedTable().getEnumSearchWordList();
    }

    @Override
    public void prepareBeforeTest() {
        prepareSearchWordList();
    }

    @Override
    protected void realizeTestProcess() {
        searchData(storedDataStructorObject, searchAlgorithmFunction);
    }

    public void setDataStructorToBeSearch(Object storedDataStructorObject, BaseSearchAlgorithmFunction searchAlgorithmFunction) {
        this.storedDataStructorObject = storedDataStructorObject;
        this.searchAlgorithmFunction = searchAlgorithmFunction;
    }

    private void searchData(Object dataObject, BaseSearchAlgorithmFunction searchAlgorithmFunction) {
        BaseDataStructorComplexityCalculation dataStructorType = (BaseDataStructorComplexityCalculation) dataObject;

        if (dataStructorType.getSelectedDataStructorType() instanceof List) {
            List<String> wordPoolList = (List<String>) dataStructorType.getSelectedDataStructorType();
            foundWords = searchAlgorithmFunction.search(wordPoolList, wordSearchList);
            missingWords = wordSearchList.size() - foundWords;
        } else if (dataStructorType.getSelectedDataStructorType() instanceof String[]) {
            String[] wordPoolArr = (String[]) dataStructorType.getSelectedDataStructorType();
            searchAlgorithmFunction.search(wordPoolArr, wordSearchList);
            foundWords = searchAlgorithmFunction.search(wordPoolArr, wordSearchList);
            missingWords = wordSearchList.size() - foundWords;
        } else {
            System.out.println("THERE IS NO CORRECT DATATYPE TO SORT");
        }


    }

    @Override
    protected void setResultsAfterTest() {
        testAlgorithmResult.setComplexityConseptSearchAlgorithm(stopwatch, memoryUsage);
        testAlgorithmResult.setWordProcessStatistic(new WordProcessStatistics(foundWords, missingWords));
    }

    private final void prepareSearchWordList() {
        wordSearchList = RetriveDataFromDBUtility.getWordListFromDatabaseInStringFormat(wordTableSearch);
    }
}
