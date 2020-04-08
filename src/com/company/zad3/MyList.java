package com.company.zad3;

import java.util.ArrayList;
import java.util.List;

public class MyList extends ArrayList<Integer> {
    public MyList(List<Integer> table) {
        super(table);
    }

    public int maxDifference(){
        var max = this.get(0);
        var min = this.get(0);
        for (var value :
                this) {
            if (max < value) max = value;
            else if (min > value) min = value;
        }
        return max - min;
    }
}
