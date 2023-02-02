package org.ahmeteminsaglik.arraylist;

import org.ahmeteminsaglik.TestAlgorithm;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSearchAlgorithmWithArrayListAndTimSort {

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
    @DisplayName("ArrayList-TimSort-BinarySearch")
    @Order(1)
    @Disabled
    public void test_Manuel_ArrayList_TimSort_BinarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.TIM_SORT, EnumSearchAlgorithm.BINARY_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-TimSort-BreadthFirstSearch")
    @Order(2)
    @Disabled
    public void test_Manuel_ArrayList_TimSort_BreadthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.TIM_SORT, EnumSearchAlgorithm.BREADTH_FIRST_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-TimSort-DepthFirstSearch")
    @Order(3)
    @Disabled
    public void test_Manuel_ArrayList_TimSort_DepthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.TIM_SORT, EnumSearchAlgorithm.DEPTH_FIRST_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-TimSort-ExponentialSearch")
    @Order(4)
    @Disabled
    public void test_Manuel_ArrayList_TimSort_ExponentialSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.TIM_SORT, EnumSearchAlgorithm.EXPONENTIAL_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-TimSort-FibonacciSearch")
    @Order(5)
    @Disabled
    public void test_Manuel_ArrayList_TimSort_FibonacciSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.TIM_SORT, EnumSearchAlgorithm.FIBONACCI_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-TimSort-InterpolationSearch")
    @Order(6)
    @Disabled
    public void test_Manuel_ArrayList_TimSort_InterpolationSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.TIM_SORT, EnumSearchAlgorithm.INTERPOLATION_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-TimSort-JumpSearch")
    @Order(7)
    @Disabled
    public void test_Manuel_ArrayList_TimSort_JumpSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.TIM_SORT, EnumSearchAlgorithm.JUMP_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-TimSort-LinearSearch")
    @Order(8)
    @Disabled
    public void test_Manuel_ArrayList_TimSort_LinearSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.TIM_SORT, EnumSearchAlgorithm.LINEAR_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-TimSort-TernarySearch")
    @Order(9)
    @Disabled
    public void test_Manuel_ArrayList_TimSort_TernarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.TIM_SORT, EnumSearchAlgorithm.TERNARY_SEARCH);
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 83;
        int expectedMissingWord = 17;
        checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    private static void checkWordStatistic(int expectedFoundWord, int expectedMissingWord, TestAlgorithmResult result) {
        TestUtility.checkWordStatistic(expectedFoundWord, expectedMissingWord, result);
    }

}
