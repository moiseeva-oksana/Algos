package chapter8;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class Task4Test {
    private static Set<Integer> set = new HashSet<>();
    private static Set<Set<Integer>> expected = new HashSet<>();
    private Task4 task = new Task4();

    @BeforeClass
    public static void init() {
        set.add(1);
        set.add(2);
        set.add(3);

        expected.add(Collections.emptySet());
        expected.add(new HashSet<>(Collections.singletonList(1)));
        expected.add(new HashSet<>(Collections.singletonList(2)));
        expected.add(new HashSet<>(Collections.singletonList(3)));
        expected.add(new HashSet<>(Arrays.asList(1, 2)));
        expected.add(new HashSet<>(Arrays.asList(1, 3)));
        expected.add(new HashSet<>(Arrays.asList(2, 3)));
        expected.add(new HashSet<>(Arrays.asList(1, 2, 3)));
    }

    @Test
    public void subSet() throws Exception {
        assertEquals(expected, task.subSet(set));

    }

}