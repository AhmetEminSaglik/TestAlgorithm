package org.ahmeteminsaglik.core;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.abstracts.set.api.SetTestResultService;
import org.ahmeteminsaglik.entity.WordProcessUsedTable;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.ahmeteminsaglik.enums.EnumWordTable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUtility {
    public static TestAlgorithmResult buildTestAlgorithmResult(EnumDataStructor enumDataStructor, EnumSortAlgorithm enumSortAlgorithm, EnumSearchAlgorithm enumSearchAlgorithm) {
        SetTestResultService setTestResultService = new TestAlgorithmResult();
        WordProcessUsedTable wordProcessUsedTable = new WordProcessUsedTable(EnumWordTable.WORD_250, EnumWordTable.WORD_100);

        setTestResultService
                .setDataStructorProcess(enumDataStructor)
                .setSortAlgorithmProcess(enumSortAlgorithm)
                .setSearchAlgorithmProcess(enumSearchAlgorithm)
                .setWordProcessUsedTable(wordProcessUsedTable);
        return (TestAlgorithmResult) setTestResultService;
    }

    public static void checkWordStatistic(int expectedFoundWord, int expectedMissingWord, TestAlgorithmResult result) {
        assertEquals(expectedFoundWord, result.getWordProcessStatistic().getFoundWord());
        assertEquals(expectedMissingWord, result.getWordProcessStatistic().getMissingWord());
    }
}
