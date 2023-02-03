package org.ahmeteminsaglik.testpart.array;

import org.ahmeteminsaglik.TestAlgorithm;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSearchAlgorithmWithArrayAndNotEnteredSortAlgorithm {

    private TestAlgorithmResult testAlgorithmResult;

    @BeforeEach
    public void prepareNecessaryObjects() {
        testAlgorithmResult = new TestAlgorithmResult();
    }

    private static TestAlgorithmResult buildTestAlgorithmResult(EnumDataStructor enumDataStructor, EnumSortAlgorithm enumSortAlgorithm, EnumSearchAlgorithm enumSearchAlgorithm) {
        return TestUtility.buildTestAlgorithmResult(enumDataStructor, enumSortAlgorithm, enumSearchAlgorithm);
    }

    @Test
    @DisplayName("Array-Null-BinarySearch")
    @Order(1)
    public void test_Manuel_Array_Null_BinarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, null, EnumSearchAlgorithm.BINARY_SEARCH);
        TestAlgorithm testAlgorithm = new TestAlgorithm();
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 5;
        int expectedMissingWord = 95;
        TestUtility.checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);

    }

    @Test
    @DisplayName("Array-Null-BreadthFirstSearch")
    @Order(2)
    public void test_Manuel_Array_Null_BreadthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, null, EnumSearchAlgorithm.BREADTH_FIRST_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-Null-DepthFirstSearch")
    @Order(3)
    public void test_Manuel_Array_Null_DepthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, null, EnumSearchAlgorithm.DEPTH_FIRST_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-Null-ExponentialSearch")
    @Order(4)
    public void test_Manuel_Array_Null_ExponentialSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, null, EnumSearchAlgorithm.EXPONENTIAL_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-Null-FibonacciSearch")
    @Order(5)
    public void test_Manuel_Array_Null_FibonacciSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, null, EnumSearchAlgorithm.FIBONACCI_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-Null-InterpolationSearch")
    @Order(6)
    public void test_Manuel_Array_Null_InterpolationSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, null, EnumSearchAlgorithm.INTERPOLATION_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-Null-JumpSearch")
    @Order(7)
    public void test_Manuel_Array_Null_JumpSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, null, EnumSearchAlgorithm.JUMP_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-Null-LinearSearch")
    @Order(8)
    public void test_Manuel_Array_Null_LinearSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, null, EnumSearchAlgorithm.LINEAR_SEARCH);
        TestUtility.testBuildedTestAlgorithmResult(testAlgorithmResult);
    }

    @Test
    @DisplayName("Array-Null-TernarySearch")
    @Order(9)
    public void test_Manuel_Array_Null_TernarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAY, null, EnumSearchAlgorithm.TERNARY_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }
}
