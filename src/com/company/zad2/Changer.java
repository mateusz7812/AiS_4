package com.company.zad2;

import java.util.*;

public class Changer {
    private Set<Integer> parts;
    private Map<Integer, Set<MyList>> knownSets = new HashMap<>();

    public Changer(Set<Integer> parts) {
        this.parts = parts;
    }

    public Set<MyList> Change(int neededValue) {
        if (neededValue == 0) return new HashSet<>(Set.of(new MyList()));
        if (knownSets.containsKey(neededValue)) return knownSets.get(neededValue);

        var neededValueSet = _change(neededValue);

        knownSets.computeIfAbsent(neededValue, k -> new HashSet<>()).addAll(neededValueSet);
        return neededValueSet;
    }

    private HashSet<MyList> _change(int neededValue) {
        var neededValueSet = new HashSet<MyList>();
        for (var part : parts) {
            if (neededValue < part) continue;
            var partials = Change(neededValue - part);
            for (var partial : partials) {
                var clone = new MyList(partial);
                clone.add(part);
                neededValueSet.add(clone);
            }
        }
        return neededValueSet;
    }
}
