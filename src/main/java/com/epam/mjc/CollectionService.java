package com.epam.mjc;

import javax.swing.text.Style;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionService {



    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(x-> x%2 == 0 ).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compare);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(Collection::stream).min(Integer::compare);
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0,(x,y)->x+y);
    }
}
