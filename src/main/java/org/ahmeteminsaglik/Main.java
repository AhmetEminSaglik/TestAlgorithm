package org.ahmeteminsaglik;

import org.ahmeteminsaglik.abstracts.set.api.SetTestResultService;
import org.ahmeteminsaglik.entity.WordProcessUsedTable;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.ahmeteminsaglik.enums.EnumWordTable;

public class Main {
    public static void main(String[] args) {
        TestAlgorithmResult testAlgorithmResult = buildFakeTestAlgorithmResult();
        TestAlgorithm testAlgorithm = new TestAlgorithm();
        testAlgorithm.test(testAlgorithmResult);
        printInfo(testAlgorithmResult);
    }

    static TestAlgorithmResult buildFakeTestAlgorithmResult() {
        SetTestResultService setResultService = new TestAlgorithmResult();

        WordProcessUsedTable wordProcessUsedTable = new WordProcessUsedTable(EnumWordTable.WORD_250, EnumWordTable.WORD_50);

        setResultService
//                .setDataStructorProcess(EnumDataStructor.HASHMAP)
//                .setDataStructorProcess(EnumDataStructor.SEARCHNODE_V1)
                .setDataStructorProcess(EnumDataStructor.ARRAYLIST)
//                .setSortAlgorithmProcess(EnumSortAlgorithm.BUBBLE_SORT)
//                .setSortAlgorithmProcess(EnumSortAlgorithm.NO_SORT)
//                .setSearchAlgorithmProcess(EnumSearchAlgorithm.HASHMAP)
//                .setSearchAlgorithmProcess(EnumSearchAlgorithm.SEARCH_NODE)
                .setSearchAlgorithmProcess(EnumSearchAlgorithm.LINEAR_SEARCH)
                .setWordProcessUsedTable(wordProcessUsedTable);
        return (TestAlgorithmResult) setResultService;

    }

    static void printInfo(TestAlgorithmResult result) {

        System.out.println("--- Data Structor :");
        if (result.getDataStructorComplexityConcept() != null) {

            System.out.println("Used Memory (KB) :" + result.getDataStructorComplexityConcept().getMemoryUsage());
            System.out.println("Elapsed Time : " + result.getDataStructorComplexityConcept().getStopwatch().getElapsedTimeString());
        } else {
            System.out.println("getDataStructorComplexityConcept : is NULL");
        }
        System.out.println("--- Sort Algorithm  :");
        if (result.getSortAlgorithmComplexityConcept() != null) {

            System.out.println("Used Memory (KB) :" + result.getSortAlgorithmComplexityConcept().getMemoryUsage());
            System.out.println("Elapsed Time : " + result.getSortAlgorithmComplexityConcept().getStopwatch().getElapsedTimeString());
        } else {
            System.out.println("getSortAlgorithmComplexityConcept : is NULL");
        }
        System.out.println("--- Search Algorithm  :");
        if (result.getSearchAlgorithmComplexityConcept() != null) {

            System.out.println("Used Memory (KB) :" + result.getSearchAlgorithmComplexityConcept().getMemoryUsage());
            System.out.println("Elapsed Time : " + result.getSearchAlgorithmComplexityConcept().getStopwatch().getElapsedTimeString());
            System.out.println("Found word number : "+result.getWordProcessStatistic().getFoundWord());
            System.out.println("Missing word number : "+result.getWordProcessStatistic().getMissingWord());
        } else {
            System.out.println("getSearchAlgorithmComplexityConcept : is NULL");
        }
    }
}