package org.ahmeteminsaglik.testpart.array;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestSearchAlgorithmWithArrayAndHeapSort {

    private TestAlgorithmResult testAlgorithmResult;

    @BeforeEach
    public void prepareNecessaryObjects() {
        testAlgorithmResult = new TestAlgorithmResult();
    }

    private static TestAlgorithmResult buildTestAlgorithmResult(EnumDataStructor enumDataStructor, EnumSortAlgorithm enumSortAlgorithm, EnumSearchAlgorithm enumSearchAlgorithm) {
        return TestUtility.buildTestAlgorithmResult(enumDataStructor, enumSortAlgorithm, enumSearchAlgorithm);
    }

    @Test
    @DisplayName("Array-HeapSort-BinarySearch")
    @Order(1)
    public void test_Manuel_Array_HeapSort_BinarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.BINARY_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-HeapSort-BreadthFirstSearch")
    @Order(2)
    public void test_Manuel_Array_HeapSort_BreadthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.BREADTH_FIRST_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-HeapSort-DepthFirstSearch")
    @Order(3)
    public void test_Manuel_Array_HeapSort_DepthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.DEPTH_FIRST_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-HeapSort-ExponentialSearch")
    @Order(4)
    public void test_Manuel_Array_HeapSort_ExponentialSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.EXPONENTIAL_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-HeapSort-FibonacciSearch")
    @Order(5)
    public void test_Manuel_Array_HeapSort_FibonacciSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.FIBONACCI_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-HeapSort-InterpolationSearch")
    @Order(6)
    public void test_Manuel_Array_HeapSort_InterpolationSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.INTERPOLATION_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-HeapSort-JumpSearch")
    @Order(7)
    public void test_Manuel_Array_HeapSort_JumpSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.JUMP_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-HeapSort-LinearSearch")
    @Order(8)
    public void test_Manuel_Array_HeapSort_LinearSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.LINEAR_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-HeapSort-TernarySearch")
    @Order(9)
    public void test_Manuel_Array_HeapSort_TernarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, EnumSortAlgorithm.HEAP_SORT, EnumSearchAlgorithm.TERNARY_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

}
