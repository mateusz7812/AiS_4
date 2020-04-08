package com.company.zad2;

import com.company.zad2.Changer;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class TestChanger {
    @Test
    public void Test1(){
        var changer = new Changer(Set.of(1));
        var possibilities = changer.Change(1);
        Assert.assertEquals(1, possibilities.size());
        Assert.assertTrue(possibilities.contains(new MyList(List.of(1))));
    }

    @Test
    public void Test2(){
        var changer = new Changer(Set.of(1));
        var possibilities = changer.Change(2);
        Assert.assertEquals(1, possibilities.size());
        Assert.assertTrue(possibilities.contains(new MyList(List.of(1, 1))));
    }

    @Test
    public void Test3(){
        var changer = new Changer(Set.of(1, 2));
        var possibilities = changer.Change(2);
        Assert.assertEquals(2, possibilities.size());
        Assert.assertTrue(possibilities.contains(new MyList(List.of(1, 1))));
        Assert.assertTrue(possibilities.contains(new MyList(List.of(2))));
    }

    @Test
    public void Test4(){
        var changer = new Changer(Set.of(1,2,3));
        var possibilities = changer.Change(4);
        Assert.assertEquals(4, possibilities.size());
        Assert.assertTrue(possibilities.contains(new MyList(List.of(1, 1, 1, 1))));
        Assert.assertTrue(possibilities.contains(new MyList(List.of(1, 1, 2))));
        Assert.assertTrue(possibilities.contains(new MyList(List.of(1, 3))));
        Assert.assertTrue(possibilities.contains(new MyList(List.of(2, 2))));
    }
}
