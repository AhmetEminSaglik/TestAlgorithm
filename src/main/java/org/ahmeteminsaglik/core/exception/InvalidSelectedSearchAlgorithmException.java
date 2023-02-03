package org.ahmeteminsaglik.core.exception;

import org.ahmeteminsaglik.core.exception.base.BaseCustomException;
import org.ahmeteminsaglik.core.solution.SolutionForException;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;


public class InvalidSelectedSearchAlgorithmException extends BaseCustomException {
    public InvalidSelectedSearchAlgorithmException(EnumDataStructor enumDataStructor, EnumSearchAlgorithm enumSearchAlgorithm) {
        super("Invalid match : " + enumSearchAlgorithm.getName().toUpperCase() + " vs " + enumDataStructor.getName().toUpperCase()+" data structor." +
                "\nPlease check out the following Search Algorithm - Data Structor instruction to use it properly." +
                "\n" + SolutionForException.getSearchAlgorithmInstructorWithSuitableDataStructor());
    }
}
