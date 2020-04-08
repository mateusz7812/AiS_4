package com.company.zad3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ListBuilder {
    private ArrayList<Integer> table;

    public ListBuilder(ArrayList<Integer> table) {
        this.table = table;
    }

    public MyList Build(int length){
        var lists = new ArrayList<MyList>();
        for (var integer : table) {
            lists.add(_buildStartingFrom(integer, length));
        }
        lists.sort(Comparator.comparingInt(MyList::maxDifference));
        return lists.get(0);
    }

    private MyList _buildStartingFrom(Integer integer, int length) {
        var baseClone = new ArrayList<>(table);
        baseClone.remove(integer);
        var list = new MyList(List.of(integer));
        while(list.size()<length){
            var lastListElement = list.get(list.size()-1);
            baseClone.sort(Comparator.comparingInt(a -> Math.abs(a - lastListElement)));
            var baseLast = baseClone.remove(0);
            list.add(baseLast);
        }
        return list;
    }
}
