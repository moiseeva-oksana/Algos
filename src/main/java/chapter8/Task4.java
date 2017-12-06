package chapter8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//1.5h
public class Task4 {
    Set<Set<Integer>> subSet(Set<Integer> original) {
        Set<Set<Integer>> result = new HashSet<>();
        if (original.isEmpty()) {
            result.add(new HashSet<>());
            return result;
        }
        List<Integer> list = new ArrayList<>(original);
        int first = list.get(0);
        Set<Integer> rest = new HashSet<>(list.subList(1, list.size()));
        for (Set<Integer> set : subSet(rest)) {
            Set<Integer> newSet = new HashSet<>();
            newSet.add(first);
            newSet.addAll(set);
            result.add(newSet);
            result.add(set);
        }
        return result;
    }
}
