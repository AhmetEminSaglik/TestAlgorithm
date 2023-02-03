package org.ahmeteminsaglik.core;

import org.ahmeteminsaglik.TestAlgorithm;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.abstracts.set.api.SetTestResultService;
import org.ahmeteminsaglik.entity.WordProcessUsedTable;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.ahmeteminsaglik.enums.EnumWordTable;
import org.hibernate.cfg.NotYetImplementedException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUtility {
    private static TestAlgorithm testAlgorithm = new TestAlgorithm();

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

    public static void testBuildedTestAlgorithmResult(TestAlgorithmResult result) {
        testAlgorithm.test(result);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, result);
    }

    public static void testAlgorithmTestResultWithNotYetImplemenationException(TestAlgorithmResult result) {
        Assertions.assertThrows(NotYetImplementedException.class, getExecutableFunction(result));
    }

    private static Executable getExecutableFunction(TestAlgorithmResult result) {
        return new Executable() {
            @Override
            public void execute() throws Throwable {
                testAlgorithm.test(result);
            }
        };

    }
}
