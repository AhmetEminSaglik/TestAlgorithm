package org.ahmeteminsaglik.testpart.hashmap;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.core.TestUtility;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSearchAlgorithmWithHashmapAndNotEnteredSortAlgorithm {

    private TestAlgorithmResult testAlgorithmResult;

    @BeforeEach
    public void prepareNecessaryObjects() {
        testAlgorithmResult = new TestAlgorithmResult();
    }

    private static TestAlgorithmResult buildTestAlgorithmResult(EnumDataStructor enumDataStructor, EnumSortAlgorithm enumSortAlgorithm, EnumSearchAlgorithm enumSearchAlgorithm) {
        return TestUtility.buildTestAlgorithmResult(enumDataStructor, enumSortAlgorithm, enumSearchAlgorithm);
    }

    @Test
    @DisplayName("Hashmap-Null-HashmapSearch")
    @Order(1)
    public void test_Manuel_Hashmap_Null_HashmapSearch() {
        testAlgorithmResult = buildTestAlgorithmResult(EnumDataStructor.HASHMAP, null, EnumSearchAlgorithm.HASHMAP);
        TestUtility.testBuildedTestAlgorithmResult(testAlgorithmResult);
    }
 }
