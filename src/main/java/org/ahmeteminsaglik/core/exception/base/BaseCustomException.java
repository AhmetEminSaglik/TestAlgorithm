package org.ahmeteminsaglik.core.exception.base;

public class BaseCustomException extends Exception {
    public BaseCustomException(String msg) {
        super("EXCEPTION : " + msg+"\n");
    }
}
