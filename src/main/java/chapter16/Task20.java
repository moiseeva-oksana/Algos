package chapter16;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

//1.5h
public class Task20 {
    private static Map<Character, List<Character>> map;
    private static List<String> dictionary;

    static {
        map = new HashMap<>();
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }

    static {
        dictionary = new ArrayList<>();
        dictionary.add("tree");
        dictionary.add("used");
        dictionary.add("cat");
        dictionary.add("dog");
    }

    public List<String> getWords(String input) {
        List<String> result = new CopyOnWriteArrayList<>(dictionary); //CopyOnWriteArrayList to avoid ConcurrentModificationException
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            for (String word : result) {
                if (!map.get(ch).contains(word.charAt(i))) {
                    result.remove(word);
                }
            }
        }
        return result;
    }
}
