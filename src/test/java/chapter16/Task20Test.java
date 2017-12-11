package chapter16;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.Assert.*;

public class Task20Test {

    private Task20 task = new Task20();

    private static List<String> list1;
    private static List<String> list2;
    private static List<String> list3;

    @BeforeClass
    public static void init() {
        list1 = new CopyOnWriteArrayList<>();
        list1.add("tree");
        list1.add("used");

        list2 = new CopyOnWriteArrayList<>();
        list2.add("cat");

        list3 = new CopyOnWriteArrayList<>();
        list3.add("dog");
    }

    @Test
    public void getWords() throws Exception {
        assertEquals(list1, task.getWords("8733"));
        assertEquals(list2, task.getWords("228"));
        assertEquals(list3, task.getWords("364"));
    }

}