package org.ahmeteminsaglik.arraylist;

import org.ahmeteminsaglik.TestAlgorithm;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSearchAlgorithmWithArrayListAndInsertionSort {

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
    @DisplayName("ArrayList-InsertionSort-BinarySearch")
    @Order(1)
    public void test_Manuel_ArrayList_InsertionSort_BinarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.BINARY_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-BreadthFirstSearch")
    @Order(2)
    @Disabled
    public void test_Manuel_ArrayList_InsertionSort_BreadthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.BREADTH_FIRST_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-DepthFirstSearch")
    @Order(3)
    @Disabled
    public void test_Manuel_ArrayList_InsertionpSort_DepthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.DEPTH_FIRST_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-ExponentialSearch")
    @Order(4)
    @Disabled
    public void test_Manuel_ArrayList_InsertionSort_ExponentialSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.EXPONENTIAL_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-FibonacciSearch")
    @Order(5)
    @Disabled
    public void test_Manuel_ArrayList_InsertionSort_FibonacciSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.FIBONACCI_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-InterpolationSearch")
    @Order(6)
    @Disabled
    public void test_Manuel_ArrayList_InsertionSort_InterpolationSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.INTERPOLATION_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-JumpSearch")
    @Order(7)
    @Disabled
    public void test_Manuel_ArrayList_InsertionSort_JumpSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.JUMP_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-LinearSearch")
    @Order(8)
    public void test_Manuel_ArrayList_InsertionSort_LinearSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.LINEAR_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-TernarySearch")
    @Order(9)
    @Disabled
    public void test_Manuel_ArrayList_InsertionSort_TernarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.TERNARY_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    private static void checkWordStatistic(int expectedFoundWord, int expectedMissingWord, TestAlgorithmResult result) {
        TestUtility.checkWordStatistic(expectedFoundWord, expectedMissingWord, result);
    }
}
