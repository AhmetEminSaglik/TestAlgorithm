package org.ahmeteminsaglik.API.business.concrete;

import org.ahmeteminsaglik.API.business.concrete.exception.NullEnumException;

public class InputValidation {
    public boolean validate(Class clazz, Enum enumData) {
        if (enumData == null) {
            throw new NullEnumException(clazz);
        }
        return true;
    }
}
