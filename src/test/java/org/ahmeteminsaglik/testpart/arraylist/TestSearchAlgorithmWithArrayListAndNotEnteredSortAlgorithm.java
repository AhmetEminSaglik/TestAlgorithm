package org.ahmeteminsaglik.testpart.arraylist;

import org.ahmeteminsaglik.TestAlgorithm;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSearchAlgorithmWithArrayListAndNotEnteredSortAlgorithm {

    private TestAlgorithmResult testAlgorithmResult;

    @BeforeEach
    public void prepareNecessaryObjects() {
        testAlgorithmResult = new TestAlgorithmResult();
    }

    private static TestAlgorithmResult buildTestAlgorithmResult(EnumDataStructor enumDataStructor, EnumSortAlgorithm enumSortAlgorithm, EnumSearchAlgorithm enumSearchAlgorithm) {
        return TestUtility.buildTestAlgorithmResult(enumDataStructor, enumSortAlgorithm, enumSearchAlgorithm);
    }

    @Test
    @DisplayName("ArrayList-Null-BinarySearch")
    @Order(1)
    public void test_Manuel_ArrayList_Null_BinarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, null, EnumSearchAlgorithm.BINARY_SEARCH);
        TestAlgorithm testAlgorithm = new TestAlgorithm();
        testAlgorithm.test(testAlgorithmResult);
        int expectedFoundWord = 5;
        int expectedMissingWord = 95;
        TestUtility.checkWordStatistic(expectedFoundWord, expectedMissingWord, testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-Null-BreadthFirstSearch")
    @Order(2)
    public void test_Manuel_ArrayList_Null_BreadthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, null, EnumSearchAlgorithm.BREADTH_FIRST_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-Null-DepthFirstSearch")
    @Order(3)
    public void test_Manuel_ArrayList_Null_DepthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, null, EnumSearchAlgorithm.DEPTH_FIRST_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-Null-ExponentialSearch")
    @Order(4)
    public void test_Manuel_ArrayList_Null_ExponentialSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, null, EnumSearchAlgorithm.EXPONENTIAL_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-Null-FibonacciSearch")
    @Order(5)
    public void test_Manuel_ArrayList_Null_FibonacciSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, null, EnumSearchAlgorithm.FIBONACCI_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-Null-InterpolationSearch")
    @Order(6)
    public void test_Manuel_ArrayList_Null_InterpolationSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, null, EnumSearchAlgorithm.INTERPOLATION_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-Null-JumpSearch")
    @Order(7)
    public void test_Manuel_ArrayList_Null_JumpSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, null, EnumSearchAlgorithm.JUMP_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-Null-LinearSearch")
    @Order(8)
    public void test_Manuel_ArrayList_Null_LinearSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, null, EnumSearchAlgorithm.LINEAR_SEARCH);
        TestUtility.testBuildedTestAlgorithmResult(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-Null-TernarySearch")
    @Order(9)
    public void test_Manuel_ArrayList_Null_TernarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, null, EnumSearchAlgorithm.TERNARY_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

}

