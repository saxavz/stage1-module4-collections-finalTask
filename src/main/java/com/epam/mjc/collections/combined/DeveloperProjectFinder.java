package com.epam.mjc.collections.combined;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        Comparator<String> nameLenReversed = Comparator.<String>comparingInt(s -> s.length()).reversed();

        return projects.entrySet().stream()
                .filter( e -> e.getValue().contains(developer))
                .map(  e -> e.getKey())
                .sorted(
                        nameLenReversed
                                .thenComparing(
                                            Comparator.<String> naturalOrder().reversed()
                                )
                )
                .collect(Collectors.toList());
    }
}
