package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> nameOfSubjects = new HashSet<>();
        Collection<List<String>> collectionOfSubjects = timetable.values();
        for (List<String> listOfSubjectsOfDay : collectionOfSubjects) {
            int counter = 0;
            while (counter < listOfSubjectsOfDay.size()) {
                nameOfSubjects.add(listOfSubjectsOfDay.get(counter));
                counter++;
            }
        }
        return nameOfSubjects;
    }
}
