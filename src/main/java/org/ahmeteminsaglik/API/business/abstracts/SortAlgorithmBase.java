package org.ahmeteminsaglik.API.business.abstracts;

import java.util.List;

public interface SortAlgorithmBase {
    public void sort(List<String> list);

    public void sort(String[] arr);
}