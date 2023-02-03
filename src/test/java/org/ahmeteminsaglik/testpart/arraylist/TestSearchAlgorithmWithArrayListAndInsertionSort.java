package org.ahmeteminsaglik.testpart.arraylist;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSearchAlgorithmWithArrayListAndInsertionSort {

    private TestAlgorithmResult testAlgorithmResult;

    @BeforeEach
    public void prepareNecessaryObjects() {
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
        TestUtility.testBuildedTestAlgorithmResult(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-BreadthFirstSearch")
    @Order(2)
    public void test_Manuel_ArrayList_InsertionSort_BreadthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.BREADTH_FIRST_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-DepthFirstSearch")
    @Order(3)
    public void test_Manuel_ArrayList_InsertionpSort_DepthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.DEPTH_FIRST_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-ExponentialSearch")
    @Order(4)
    public void test_Manuel_ArrayList_InsertionSort_ExponentialSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.EXPONENTIAL_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-FibonacciSearch")
    @Order(5)
    public void test_Manuel_ArrayList_InsertionSort_FibonacciSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.FIBONACCI_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-InterpolationSearch")
    @Order(6)
    public void test_Manuel_ArrayList_InsertionSort_InterpolationSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.INTERPOLATION_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-JumpSearch")
    @Order(7)
    public void test_Manuel_ArrayList_InsertionSort_JumpSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.JUMP_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-LinearSearch")
    @Order(8)
    public void test_Manuel_ArrayList_InsertionSort_LinearSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.LINEAR_SEARCH);
        TestUtility.testBuildedTestAlgorithmResult(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-InsertionSort-TernarySearch")
    @Order(9)
    public void test_Manuel_ArrayList_InsertionSort_TernarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INSERTION_SORT, EnumSearchAlgorithm.TERNARY_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

}
