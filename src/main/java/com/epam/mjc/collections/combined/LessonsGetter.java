package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        return timetable.entrySet().stream()
                .flatMap( m -> m.getValue().stream())
                .collect(Collectors.toSet());
    }
}
