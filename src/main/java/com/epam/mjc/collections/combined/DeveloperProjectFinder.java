package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        Set<String> strings = new HashSet<>();
        for (Map.Entry<String, Set<String>> projects1 : projects.entrySet()) {
            for (String strings1 : projects1.getValue()) {
                if (strings1.contains(developer)) {
                    strings.add(projects1.getKey());
                }
            }
        }
        Comparator<String> comparator = (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s2.compareTo(s1);
            } else {
                return s2.length() - s1.length();
            }
        };
        List<String> result = new ArrayList<>(strings);
        result.sort(comparator);
        return result;
    }
}
