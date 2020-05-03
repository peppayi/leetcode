package com.peppayi.leetcode.contest.c187;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class P1 {

    public String destCity(List<List<String>> paths) {
        Set<String> sources = new HashSet<>(paths.size());
        Set<String> destinations = new HashSet<>(paths.size());

        for (List<String> path : paths) {
            Iterator<String> itr = path.iterator();
            sources.add(itr.next());
            destinations.add(itr.next());
        }

        destinations.removeAll(sources);

        assert destinations.size() == 1;
        return destinations.iterator().next();
    }
}
