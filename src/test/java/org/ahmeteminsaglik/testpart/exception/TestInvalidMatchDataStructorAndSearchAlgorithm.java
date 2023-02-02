package org.ahmeteminsaglik.testpart.exception;

import org.ahmeteminsaglik.TestAlgorithm;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestInvalidMatchDataStructorAndSearchAlgorithm {

    private TestAlgorithm testAlgorithm = new TestAlgorithm();
    private TestAlgorithmResult testAlgorithmResult;

    @BeforeEach
    public void prepareNecessaryObjects() {
        testAlgorithmResult = new TestAlgorithmResult();
    }

    private static TestAlgorithmResult buildTestAlgorithmResult(EnumDataStructor enumDataStructor, EnumSortAlgorithm enumSortAlgorithm, EnumSearchAlgorithm enumSearchAlgorithm) {
        return TestUtility.buildTestAlgorithmResult(enumDataStructor, enumSortAlgorithm, enumSearchAlgorithm);
    }

    @Test
    @DisplayName("Array-Hashmap")
    @Order(1)
    public void testInvalidMatch_Array_vs_Hashmap() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, null, EnumSearchAlgorithm.HASHMAP);
        System.out.println("testAlgorithm : " + testAlgorithm);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-Hashmap")
    @Order(2)
    public void testInvalidMatch_ArrayList_vs_Hashmap() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, null, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-SearchNode")
    @Order(3)
    public void testInvalidMatch_Array_vs_SearchNode() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, null, EnumSearchAlgorithm.SEARCH_NODE);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-SearchNode")
    @Order(3)
    public void testInvalidMatch_ArrayList_vs_SearchNode() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, null, EnumSearchAlgorithm.SEARCH_NODE);
        testAlgorithm.test(testAlgorithmResult);
    }
}
