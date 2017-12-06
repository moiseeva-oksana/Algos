package chapter8;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class Task7Test {
    private static Set<String> expected = new HashSet<>();
    private Task7 task = new Task7();

    @BeforeClass
    public static void init() {
        expected.add("acb");
        expected.add("abc");
        expected.add("bca");
        expected.add("bac");
        expected.add("cab");
        expected.add("cba");
    }

    @Test
    public void permutation() throws Exception {
        assertEquals(expected, task.permutations("", "abc"));
    }

}