package org.ahmeteminsaglik.utility;

import org.ahmeteminsaglik.entity.Word;

import java.util.ArrayList;
import java.util.List;

public class ObjectConversion {
    public static synchronized List<String> convertWordListToStringList(List<Word> wordList) {
        List<String> stringList = new ArrayList<>();

        wordList.stream().forEachOrdered(e -> {
            stringList.add(e.getWord());
        });
        return stringList;
    }
}
