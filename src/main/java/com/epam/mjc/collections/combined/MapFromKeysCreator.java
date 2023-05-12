package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerMap : sourceMap.entrySet()) {
            String value = stringIntegerMap.getKey();
            int length = value.length();
            Set<String> r = new HashSet<>();
            for (String s : sourceMap.keySet()) {
                if (s.length() == length) {
                    r.add(s);
                }
            }
            result.put(length, r);
        }
        return result;
    }
}
