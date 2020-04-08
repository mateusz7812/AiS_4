package com.company.zad3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestBuilderFacade{
    @Test
    public void Test1(){
        var facade = new BuilderFacade();
        var list = new ArrayList<>(List.of(1, 4, 7, 2));
        var r = facade.GetSmallestDifference(list, 2);
        Assert.assertEquals(1, r);
    }

    @Test
    public void Test2(){
        var list = new ArrayList<>(List.of(1, 4, 7, 2));
        var builder = new ListBuilder(list);
        var smallestDifferencesList = builder.Build(2);
        Assert.assertEquals(2, smallestDifferencesList.size());
        Assert.assertTrue(smallestDifferencesList.contains(1));
        Assert.assertTrue(smallestDifferencesList.contains(2));
    }
}
