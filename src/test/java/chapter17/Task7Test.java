package chapter17;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Task7Test {

    private Task7 task = new Task7();
    private static List<List<String>> synonyms = new ArrayList<>();
    private static Map<String, Integer> data = new HashMap<>();

    @BeforeClass
    public static void init() {
        synonyms.add(Arrays.asList("Jon", "John"));
        synonyms.add(Arrays.asList("John", "Johnny"));
        synonyms.add(Arrays.asList("Chris", "Kris"));
        synonyms.add(Arrays.asList("Chris", "Christopher"));

        data.put("John", 15);
        data.put("Jon", 12);
        data.put("Chris", 13);
        data.put("Kris", 4);
        data.put("Christopher", 19);
        data.put("Anna", 18);
    }

    @Test
    public void countUsages() throws Exception {
        final Map<String, Integer> usages = task.countUsages(data, synonyms);
        assertTrue(usages.containsValue(27));
        assertTrue(usages.containsValue(18));
        assertTrue(usages.containsValue(36));
        assertTrue(usages.get("John") == 27 || usages.get("Jon") == 27 || usages.get("Johnny") == 27);
        assertTrue(usages.get("Kris") == 36 || usages.get("Chris") == 36 || usages.get("Christopher") == 36);
        assertTrue(usages.get("Anna") == 18);
        assertTrue(usages.size() == 3);
    }

}