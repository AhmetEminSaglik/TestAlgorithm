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
//        System.out.println("BEFORE TEST : ");
//        printInfo(testAlgorithmResult);

        testAlgorithm.test(testAlgorithmResult);
        testAlgorithmResult = testAlgorithm.getTestResult();

//        System.out.println("AFTER  TEST : ");
        printInfo(testAlgorithmResult);
    }

    static TestAlgorithmResult buildFakeTestAlgorithmResult() {
        SetTestResultService setResultService = new TestAlgorithmResult();

        WordProcessUsedTable wordProcessUsedTable = new WordProcessUsedTable(EnumWordTable.WORD_50_000, EnumWordTable.WORD_10_000);

        setResultService
                .setDataStructorProcess(EnumDataStructor.ARRAYLIST)
//                .setComplexityConseptDataStructor(new Stopwatch(), new MemoryUsage())
                .setSortAlgorithmProcess(EnumSortAlgorithm.INSERTION_SORT)
//                .setComplexityConseptDataStructor(new Stopwatch(), new MemoryUsage())
                .setSearchAlgorithmProcess(EnumSearchAlgorithm.LINEAR_SEARCH)
//                .setComplexityConseptDataStructor(new Stopwatch(), new MemoryUsage())
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
        } else {
            System.out.println("getSearchAlgorithmComplexityConcept : is NULL");
        }
    }
}