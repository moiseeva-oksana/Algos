package chapter17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//2h
public class Task7 {
    public Map<String, Integer> countUsages(Map<String, Integer> data, List<List<String>> synonyms) {
        final Set<String> names = data.keySet();
        List<List<String>> unique = new ArrayList<>();
        for (String name : names) {
            List<String> synonymsOfTheName = getAllSynonyms(name, synonyms);
            if (unique.size() == 0) {
                unique.add(synonymsOfTheName);
            }
            boolean flag = false;
            for (List<String> un : unique) {
                if (un.contains(synonymsOfTheName.get(0))) {
                    flag = true;
                }
            }
            if (!flag) {
                unique.add(synonymsOfTheName);
            }
        }
        Map<String, Integer> result = new HashMap<>();
        for (List<String> un : unique) {
            int sum = 0;
            for (String name : un) {
                if (data.containsKey(name)) {
                    sum += data.get(name);
                }
            }
            result.put(un.get(0), sum);
        }
        return result;
    }

    private List<String> getAllSynonyms(String name, List<List<String>> synonyms) {
        List<String> result = new ArrayList<>();
        result.add(name);
        for (int i = 0; i < result.size(); i++) {
            int finalI = i;
            synonyms.stream()
                    .filter(t -> t.contains(result.get(finalI)))
                    .collect(Collectors.toList())
                    .stream()
                    .flatMap(List::stream)
                    .forEach(t -> {
                        if (!result.contains(t))
                            result.add(t);
                    });
        }
        return result;
    }
}
