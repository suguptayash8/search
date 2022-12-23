package com.para.search.application.service;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class FindDistinct {

    public Map<String, Integer> findDistinctWords(String string) {
        List<String> words = Arrays.asList(string.split(" "));

        Map<String, Integer> sol = new HashMap<>();

        Map<String, List<String>> distinctWords =  Optional.ofNullable(words).orElse(new ArrayList<String>()).parallelStream()
                .collect(Collectors.groupingBy(word->{
                    return word;
                }));

        distinctWords.keySet().stream().forEach(word->{
            sol.put(word, distinctWords.get(word).size());
        });

        return sol;
    }
}
