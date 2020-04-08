package com.company.zad1;

import com.company.zad1.MergeSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestMergeSort {
    @Test
    public void Test1(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(1);
        integers.add(2);
        integers.add(0);
        var ms = new MergeSort<>(integers);
        var sorted = ms.Sort();
        Assert.assertEquals(0, sorted.get(0).intValue());
        Assert.assertEquals(1, sorted.get(1).intValue());
        Assert.assertEquals(2, sorted.get(2).intValue());
        Assert.assertEquals(3, sorted.get(3).intValue());
    }

    @Test
    public void Test2(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(0);
        integers.add(1);
        integers.add(3);
        integers.add(2);
        var ms = new MergeSort<>(integers);
        var sorted = ms.Sort();
        Assert.assertEquals(0, sorted.get(0).intValue());
        Assert.assertEquals(1, sorted.get(1).intValue());
        Assert.assertEquals(2, sorted.get(2).intValue());
        Assert.assertEquals(3, sorted.get(3).intValue());
        Assert.assertEquals(4, sorted.get(4).intValue());
    }

    @Test
    public void Test3(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        var ms = new MergeSort<>(integers);
        var sorted = ms.Sort();
        Assert.assertEquals(0, sorted.get(0).intValue());
        Assert.assertEquals(1, sorted.get(1).intValue());
        Assert.assertEquals(2, sorted.get(2).intValue());
        Assert.assertEquals(3, sorted.get(3).intValue());
    }
}
