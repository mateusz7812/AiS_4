package com.company.zad1;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<E extends Comparable<E>> {
    private List<E> list;

    public MergeSort(List<E> list) {
        this.list = list;
    }

    public List<E> Sort() {
        return _sort(list);
    }

    public List<E> _sort(List<E> list) {
        int middle = list.size() / 2;
        if (list.size() > 1) {
            var list1 = _sort(new ArrayList<>(list.subList(0, middle)));
            var list2 = _sort(new ArrayList<>(list.subList(middle, list.size())));
            return _merge(list1, list2);
        }
        return list;
    }

    private List<E> _merge(List<E> first, List<E> second) {
        var list = new ArrayList<E>();
        while (first.size() > 0 || second.size() > 0) {
            E element;
            if (first.size() > 0 && second.size() > 0) {
                if (first.get(0).compareTo(second.get(0)) < 0) {
                    element = first.remove(0);
                } else {
                    element = second.remove(0);
                }
            } else if (first.size() > 0) {
                element = first.remove(0);
            } else {
                element = second.remove(0);
            }
            list.add(element);
        }
        return list;
    }
}
