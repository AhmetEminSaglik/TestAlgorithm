package org.ahmeteminsaglik.testpart.searchnodev1;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSearchAlgorithmWithSearchNodeAndNoSort {

    private TestAlgorithmResult testAlgorithmResult;

    @BeforeEach
    public void prepareNecessaryObjects() {
        testAlgorithmResult = new TestAlgorithmResult();
    }

    private static TestAlgorithmResult buildTestAlgorithmResult(EnumDataStructor enumDataStructor, EnumSortAlgorithm enumSortAlgorithm, EnumSearchAlgorithm enumSearchAlgorithm) {
        return TestUtility.buildTestAlgorithmResult(enumDataStructor, enumSortAlgorithm, enumSearchAlgorithm);
    }


    @Test
    @DisplayName("SearchNodeV1-NoSort-HashmapSearch")
    @Order(1)
    public void test_Manuel_SearchNodeV1_NoSort_HashmapSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.SEARCHNODE_V1, EnumSortAlgorithm.NO_SORT, EnumSearchAlgorithm.SEARCH_NODE);
        TestUtility.testBuildedTestAlgorithmResult(testAlgorithmResult);
    }
}
