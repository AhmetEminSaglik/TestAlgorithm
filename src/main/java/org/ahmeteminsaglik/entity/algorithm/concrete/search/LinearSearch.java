package org.ahmeteminsaglik.entity.algorithm.concrete.search;

import org.ahmeteminsaglik.API.business.abstracts.BaseSearchAlgorithmFunction;
import org.hibernate.cfg.NotYetImplementedException;

import javax.swing.text.html.HTMLWriter;
import java.util.HashMap;
import java.util.List;

public class LinearSearch implements BaseSearchAlgorithmFunction {

    private boolean searchWithLinearSearch(List<String> list, String val) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(val)) {
                return true;
            }
        }
        return false;
    }

    private boolean searchWithLinearSearch(String[] arr, String val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(val)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean search(List<String> wordPoollist, String word) {
        return searchWithLinearSearch(wordPoollist, word);
    }

    @Override
    public boolean search(String[] wordPoolArr, String word) {
        return searchWithLinearSearch(wordPoolArr, word);
    }

}
