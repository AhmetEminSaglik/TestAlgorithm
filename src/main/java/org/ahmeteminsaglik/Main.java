package org.ahmeteminsaglik;

import org.ahmeteminsaglik.abstracts.set.api.SetTestResultService;
import org.ahmeteminsaglik.entity.WordProcessUsedTable;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.ahmeteminsaglik.enums.EnumWordTable;
import org.ahmeteminsaglik.readableformat.ReadableFormat;

public class Main {
    public static void main(String[] args) {
        TestAlgorithmResult testAlgorithmResult = buildFakeTestAlgorithmResult();
        TestAlgorithm testAlgorithm = new TestAlgorithm();
        testAlgorithm.test(testAlgorithmResult);
        printInfo(testAlgorithmResult);
    }

    static TestAlgorithmResult buildFakeTestAlgorithmResult() {
        SetTestResultService setResultService = new TestAlgorithmResult();

        WordProcessUsedTable wordProcessUsedTable = new WordProcessUsedTable(EnumWordTable.WORD_1_000, EnumWordTable.WORD_250);

        setResultService
                .setDataStructorProcess(EnumDataStructor.HASHMAP)
//                .setSortAlgorithmProcess(EnumSortAlgorithm.INSERTION_SORT)
                .setSortAlgorithmProcess(EnumSortAlgorithm.NO_SORT)
//                .setSearchAlgorithmProcess(EnumSearchAlgorithm.LINEAR_SEARCH)
                .setSearchAlgorithmProcess(EnumSearchAlgorithm.HASHMAP)
                .setWordProcessUsedTable(wordProcessUsedTable);
        return (TestAlgorithmResult) setResultService;

    }

    static void printInfo(TestAlgorithmResult result) {

        System.out.println("--- Data Structor :");
        if (result.getDataStructorComplexityConcept() != null) {

            System.out.println("Used Memory (KB) :" + ReadableFormat.getStringValue(result.getDataStructorComplexityConcept().getMemoryUsage().getUsedMemoryKB()));
            System.out.println("Elapsed Time : " + result.getDataStructorComplexityConcept().getStopwatch().getElapsedTimeString());
        } else {
            System.out.println("getDataStructorComplexityConcept : is NULL");
        }
        System.out.println("--- Sort Algorithm  :");
        if (result.getSortAlgorithmComplexityConcept() != null) {

            System.out.println("Used Memory (KB) :" + ReadableFormat.getStringValue(result.getSortAlgorithmComplexityConcept().getMemoryUsage().getUsedMemoryKB()));
            System.out.println("Elapsed Time : " + result.getSortAlgorithmComplexityConcept().getStopwatch().getElapsedTimeString());
        } else {
            System.out.println("getSortAlgorithmComplexityConcept : is NULL");
        }
        System.out.println("--- Search Algorithm  :");
        if (result.getSearchAlgorithmComplexityConcept() != null) {

            System.out.println("Used Memory (KB) :" + result.getSearchAlgorithmComplexityConcept().getStopwatch().getElapsedTimeString());
            System.out.println("Elapsed Time : " + result.getSearchAlgorithmComplexityConcept().getStopwatch().getElapsedTimeString());
            System.out.println("Found word number : "+result.getWordProcessStatistic().getFoundWord());
            System.out.println("Missing word number : "+result.getWordProcessStatistic().getMissingWord());
        } else {
            System.out.println("getSearchAlgorithmComplexityConcept : is NULL");
        }
    }
}