package org.ahmeteminsaglik.arraylist;

import org.ahmeteminsaglik.TestAlgorithm;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestSearchAlgorithmWithArrayListAndHeapSort {

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
    @DisplayName("ArrayList-HeapSort-BinarySearch")
    @Order(1)
    @Disabled
    public void test_Manuel_ArrayList_HeapSort_BinarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.BINARY_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-HeapSort-BreadthFirstSearch")
    @Order(2)
    @Disabled
    public void test_Manuel_ArrayList_HeapSort_BreadthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.BREADTH_FIRST_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-HeapSort-DepthFirstSearch")
    @Order(3)
    @Disabled
    public void test_Manuel_ArrayList_HeapSort_DepthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.DEPTH_FIRST_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-HeapSort-ExponentialSearch")
    @Order(4)
    @Disabled
    public void test_Manuel_ArrayList_HeapSort_ExponentialSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.EXPONENTIAL_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-HeapSort-FibonacciSearch")
    @Order(5)
    @Disabled
    public void test_Manuel_ArrayList_HeapSort_FibonacciSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.FIBONACCI_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-HeapSort-InterpolationSearch")
    @Order(6)
    @Disabled
    public void test_Manuel_ArrayList_HeapSort_InterpolationSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.INTERPOLATION_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-HeapSort-JumpSearch")
    @Order(7)
    @Disabled
    public void test_Manuel_ArrayList_HeapSort_JumpSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.JUMP_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-HeapSort-LinearSearch")
    @Order(8)
    @Disabled
    public void test_Manuel_ArrayList_HeapSort_LinearSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.LINEAR_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-HeapSort-TernarySearch")
    @Order(9)
    @Disabled
    public void test_Manuel_ArrayList_HeapSort_TernarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.TERNARY_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    private static void checkWordStatistic(int expectedFoundWord, int expectedMissingWord, TestAlgorithmResult result) {
        TestUtility.checkWordStatistic(expectedFoundWord, expectedMissingWord, result);
    }
}