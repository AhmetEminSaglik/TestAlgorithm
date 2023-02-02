package org.ahmeteminsaglik.entity.algorithm.searchalgorithm;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.entity.algorithm.abstracts.BaseSearchAlgorithmComplexityCalculation;
import org.ahmeteminsaglik.entity.algorithm.concrete.search.HashMapSearch;

import java.util.HashMap;
import java.util.List;

public class SAHashMapSearch extends BaseSearchAlgorithmComplexityCalculation implements BaseSearchAlgorithmFunction {
    public SAHashMapSearch(TestAlgorithmResult testAlgorithmResult) {
        super(testAlgorithmResult);
        baseSearchAlgorithmFunction = new HashMapSearch();
    }

//    @Override
//    public boolean search(List<String> wordPoollist, String word) {
//        System.out.println("WRONG IMPLEMENTATION --> Hashmap search only realize in hashmap structor, not List type structor");
//        return false;
//    }

//    @Override
//    public boolean search(String[] wordPoolArr, String word) {
//        System.out.println("WRONG IMPLEMENTATION --> Hashmap search only realize in hashmap structor, not Array type structor");
//        return false;
//    }

    @Override
    public boolean search(HashMap<String, String> hasMap, String word) {
        return baseSearchAlgorithmFunction.search(hasMap, word);
    }
}
