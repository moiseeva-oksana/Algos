package chapter17;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//1h
public class Task15 {
    public String biggestComplicatedWord(List<String> words) {
        Set<String> complicatedWords = new HashSet<>();
        for (String word : words) {
            for (String s : words) {
                if (word != s && word.contains(s)) {
                    complicatedWords.add(word);
                }
            }
        }
        return Collections.max(complicatedWords, Comparator.comparingInt(String::length));
    }
}
