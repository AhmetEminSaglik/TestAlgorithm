package org.ahmeteminsaglik.testpart.arraylist;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSearchAlgorithmWithArrayListAndIntroSort {

    private TestAlgorithmResult testAlgorithmResult;

    @BeforeEach
    public void prepareNecessaryObjects() {
        testAlgorithmResult = new TestAlgorithmResult();
    }

    private static TestAlgorithmResult buildTestAlgorithmResult(EnumDataStructor enumDataStructor, EnumSortAlgorithm enumSortAlgorithm, EnumSearchAlgorithm enumSearchAlgorithm) {
        return TestUtility.buildTestAlgorithmResult(enumDataStructor, enumSortAlgorithm, enumSearchAlgorithm);
    }

    @Test
    @DisplayName("ArrayList-IntroSort-BinarySearch")
    @Order(1)
    public void test_Manuel_ArrayList_IntroSort_BinarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INTRO_SORT, EnumSearchAlgorithm.BINARY_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-IntroSort-BreadthFirstSearch")
    @Order(2)
    public void test_Manuel_ArrayList_IntroSort_BreadthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INTRO_SORT, EnumSearchAlgorithm.BREADTH_FIRST_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-IntroSort-DepthFirstSearch")
    @Order(3)
    public void test_Manuel_ArrayList_IntroSort_DepthFirstSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INTRO_SORT, EnumSearchAlgorithm.DEPTH_FIRST_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-IntroSort-ExponentialSearch")
    @Order(4)
    public void test_Manuel_ArrayList_IntroSort_ExponentialSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INTRO_SORT, EnumSearchAlgorithm.EXPONENTIAL_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-IntroSort-FibonacciSearch")
    @Order(5)
    public void test_Manuel_ArrayList_IntroSort_FibonacciSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INTRO_SORT, EnumSearchAlgorithm.FIBONACCI_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-IntroSort-InterpolationSearch")
    @Order(6)
    public void test_Manuel_ArrayList_IntroSort_InterpolationSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INTRO_SORT, EnumSearchAlgorithm.INTERPOLATION_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-IntroSort-JumpSearch")
    @Order(7)
    public void test_Manuel_ArrayList_IntroSort_JumpSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INTRO_SORT, EnumSearchAlgorithm.JUMP_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-IntroSort-LinearSearch")
    @Order(8)
    public void test_Manuel_ArrayList_IntroSort_LinearSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INTRO_SORT, EnumSearchAlgorithm.LINEAR_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

    @Test
    @DisplayName("ArrayList-IntroSort-TernarySearch")
    @Order(9)
    public void test_Manuel_ArrayList_IntroSort_TernarySearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.ARRAYLIST, EnumSortAlgorithm.INTRO_SORT, EnumSearchAlgorithm.TERNARY_SEARCH);
        TestUtility.testAlgorithmTestResultWithNotYetImplemenationException(testAlgorithmResult);
    }

}
