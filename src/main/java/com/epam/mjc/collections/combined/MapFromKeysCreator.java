package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        return
        sourceMap.entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.groupingBy(
                        s -> s.length(),
                        Collectors.toSet()
                        )
                );
    }
}
