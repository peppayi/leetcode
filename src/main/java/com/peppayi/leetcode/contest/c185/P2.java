package com.peppayi.leetcode.contest.c185;

import java.util.*;

public class P2 {

    public List<List<String>> displayTable(List<List<String>> orders) {
        if (orders == null || orders.isEmpty()) return new ArrayList<>(0);

        Map<Integer, Map<String, Integer>> tableOrderItemCounts = new TreeMap<>();
        Set<String> items = new TreeSet<>();

        for (List<String> order: orders) {
            String customer = order.get(0);
            Integer table = Integer.parseInt(order.get(1));
            String item = order.get(2);

            items.add(item);

            Map<String, Integer> orderItemCount = tableOrderItemCounts.computeIfAbsent(table, k -> new HashMap<>());
            orderItemCount.put(item, orderItemCount.getOrDefault(item, 0) + 1);
        }

        List<List<String>> rv = new ArrayList<>(tableOrderItemCounts.size() + 1);

        List<String> header = new ArrayList<>(items.size() + 1);
        header.add("Table");
        header.addAll(items);
        rv.add(header);

        tableOrderItemCounts.forEach((table, counts) -> {
            List<String> row = new ArrayList<>(header.size());
            row.add(String.valueOf(table));

            items.forEach(item -> {
                row.add(String.valueOf(counts.getOrDefault(item, 0)));
            });
            rv.add(row);
        });

        return rv;
    }
}
