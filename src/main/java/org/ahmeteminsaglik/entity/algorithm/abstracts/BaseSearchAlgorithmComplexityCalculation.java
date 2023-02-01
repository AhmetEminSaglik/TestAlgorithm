package org.ahmeteminsaglik.entity.algorithm.abstracts;

import org.ahmeteminsaglik.API.business.abstracts.AbstractTestRealizationForComplexityCalculation;
import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.API.business.visitor.search.DataStructorSearchElement;
import org.ahmeteminsaglik.API.business.visitor.search.DataStructorSearchVisitor;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.WordProcessStatistics;
import org.ahmeteminsaglik.entity.algorithm.concrete.search.LinearSearch;
import org.ahmeteminsaglik.enums.EnumWordTable;
import org.ahmeteminsaglik.utility.RetriveDataFromDBUtility;

import java.util.List;

public abstract class BaseSearchAlgorithmComplexityCalculation extends AbstractTestRealizationForComplexityCalculation implements BaseSearchAlgorithmFunction, DataStructorSearchElement {
    private EnumWordTable wordTableSearch;
    private Object storedDataStructorObject;
    private List<String> wordSearchList;
    private BaseSearchAlgorithmFunction searchAlgorithmFunction;
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
//        searchData(storedDataStructorObject, searchAlgorithmFunction);
        System.out.println("REALIZE TEST SEARCH : ");
        accept(visitor);
    }

    /*public void setDataStructorToBeSearch(Object storedDataStructorObject, BaseSearchAlgorithmFunction searchAlgorithmFunction) {
        this.storedDataStructorObject = storedDataStructorObject;
        this.searchAlgorithmFunction = searchAlgorithmFunction;
    }*/

    /*private void searchData(Object dataObject, BaseSearchAlgorithmFunction searchAlgorithmFunction) {
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


    }*/

    @Override
    protected void setResultsAfterTest() {
        testAlgorithmResult.setComplexityConseptSearchAlgorithm(stopwatch, memoryUsage);
        System.out.println("found words : " + foundWords);
        System.out.println("missing words : " + missingWords);
        testAlgorithmResult.setWordProcessStatistic(new WordProcessStatistics(foundWords, missingWords));
    }

    private final void prepareSearchWordList() {
        wordSearchList = RetriveDataFromDBUtility.getWordListFromDatabaseInStringFormat(wordTableSearch);
    }

    public List<String> getWordSearchList() {
        return wordSearchList;
    }
}
