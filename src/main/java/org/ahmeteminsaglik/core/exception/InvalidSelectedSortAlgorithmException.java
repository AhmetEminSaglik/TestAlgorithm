package org.ahmeteminsaglik.core.exception;

import org.ahmeteminsaglik.core.exception.base.BaseCustomException;
import org.ahmeteminsaglik.core.solution.SolutionForException;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;


public class InvalidSelectedSortAlgorithmException extends BaseCustomException {
    public InvalidSelectedSortAlgorithmException(EnumDataStructor enumDataStructor, EnumSortAlgorithm enumSortAlgorithm) {
        super("Invalid match : " + enumSortAlgorithm.getName().toUpperCase() + " vs " + enumDataStructor.getName().toUpperCase()+" data structor" +
                "\nPlease check out the following SortAlgorithm-DataStructor instruction to use it properly." +
                "\n" + SolutionForException.getSortAlgorithmInstructorWithSuitableDataStructor());
    }
}
