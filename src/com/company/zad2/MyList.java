package com.company.zad2;

import java.util.*;

public class MyList extends ArrayList<Integer> {
    public MyList(List<Integer> partial) {
        super(partial);
    }

    public MyList() {
        super();
    }

    @Override
    public int hashCode() {
        Collections.sort(this);
        return generateHashCode(this);
    }

    private int generateHashCode(MyList integers) {
        var stringBuilder = new StringBuilder("0");
        for (var value :
                integers) {
            stringBuilder.append(value);
        }
        var string = stringBuilder.toString();
        return Integer.parseInt(string);
    }
}
