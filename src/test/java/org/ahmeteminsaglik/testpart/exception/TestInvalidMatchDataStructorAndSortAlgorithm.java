package org.ahmeteminsaglik.testpart.exception;

import org.ahmeteminsaglik.TestAlgorithm;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestInvalidMatchDataStructorAndSortAlgorithm {

    private TestAlgorithm testAlgorithm;
    private TestAlgorithmResult testAlgorithmResult;

    @BeforeEach
    public void prepareNecessaryObjects() {
        testAlgorithm = new TestAlgorithm();
        testAlgorithmResult = new TestAlgorithmResult();
    }

    private static TestAlgorithmResult buildTestAlgorithmResult(EnumDataStructor enumDataStructor, EnumSortAlgorithm enumSortAlgorithm, EnumSearchAlgorithm enumSearchAlgorithm) {
        return TestUtility.buildTestAlgorithmResult(enumDataStructor, enumSortAlgorithm, enumSearchAlgorithm);
    }

    @Test
    @DisplayName("Hashmap-BubbleSort")
    @Order(1)
    public void testInvalidMatch_Hashmap_vs_BubbleSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.HASHMAP, EnumSortAlgorithm.BUBBLE_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("Hashmap-HeapSort")
    @Order(2)
    public void testInvalidMatch_Hashmap_vs_HeapSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.HASHMAP, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("Hashmap-InsertionSort")
    @Order(3)
    public void testInvalidMatch_Hashmap_vs_InsertionSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.HASHMAP, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("Hashmap-IntroSort")
    @Order(4)
    public void testInvalidMatch_Hashmap_vs_IntroSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.HASHMAP, EnumSortAlgorithm.INTRO_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("Hashmap-MergeSort")
    @Order(5)
    public void testInvalidMatch_Hashmap_vs_MergeSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.HASHMAP, EnumSortAlgorithm.MERGE_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("Hashmap-QuickSort")
    @Order(6)
    public void testInvalidMatch_Hashmap_vs_QuickSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.HASHMAP, EnumSortAlgorithm.QUICK_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("Hashmap-SelectionSort")
    @Order(7)
    public void testInvalidMatch_Hashmap_vs_SelectionSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.HASHMAP, EnumSortAlgorithm.SELECTION_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("Hashmap-TimSort")
    @Order(8)
    public void testInvalidMatch_Hashmap_vs_TimSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.HASHMAP, EnumSortAlgorithm.TIM_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }



    @Test
    @DisplayName("SearchNodeV1-BubbleSort")
    @Order(9)
    public void testInvalidMatch_SearchNodeV1_vs_BubbleSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.SEARCHNODE_V1, EnumSortAlgorithm.BUBBLE_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("SearchNodeV1-HeapSort")
    @Order(10)
    public void testInvalidMatch_SearchNodeV1_vs_HeapSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.SEARCHNODE_V1, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("SearchNodeV1-InsertionSort")
    @Order(11)
    public void testInvalidMatch_SearchNodeV1_vs_InsertionSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.SEARCHNODE_V1, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("SearchNodeV1-IntroSort")
    @Order(12)
    public void testInvalidMatch_SearchNodeV1_vs_IntroSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.SEARCHNODE_V1, EnumSortAlgorithm.INTRO_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("SearchNodeV1-MergeSort")
    @Order(13)
    public void testInvalidMatch_SearchNodeV1_vs_MergeSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.SEARCHNODE_V1, EnumSortAlgorithm.MERGE_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("SearchNodeV1-QuickSort")
    @Order(14)
    public void testInvalidMatch_SearchNodeV1_vs_QuickSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.SEARCHNODE_V1, EnumSortAlgorithm.QUICK_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("Hashmap-SelectionSort")
    @Order(15)
    public void testInvalidMatch_SearchNodeV1_vs_SelectionSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.SEARCHNODE_V1, EnumSortAlgorithm.SELECTION_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

    @Test
    @DisplayName("SearchNodeV1-TimSort")
    @Order(16)
    public void testInvalidMatch_SearchNodeV1_vs_TimSort() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.SEARCHNODE_V1, EnumSortAlgorithm.TIM_SORT, EnumSearchAlgorithm.HASHMAP);
        testAlgorithm.test(testAlgorithmResult);
    }

}
