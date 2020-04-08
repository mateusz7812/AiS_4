package com.company.zad3;

import java.util.ArrayList;
import java.util.List;

public class BuilderFacade {
    public int GetSmallestDifference(ArrayList<Integer> Table, int length){
        var listBuilder = new ListBuilder(Table);
        MyList list = listBuilder.Build(length);
        return list.maxDifference();
    }
}
