package chapter17;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task5Test {

    private Task5 task = new Task5();
    private static List<Character> expected;
    private static List<Character> list;

    @BeforeClass
    public static void init() {
        expected = new ArrayList<>();
        expected.add('1');
        expected.add('d');
        expected.add('d');
        expected.add('d');
        expected.add('2');
        expected.add('8');

        list = new ArrayList<>();
        list.add('1');
        list.add('d');
        list.add('d');
        list.add('d');
        list.add('2');
        list.add('8');
        list.add('8');
    }

    @Test
    public void subList() throws Exception {
        assertThat(task.subList(list), is(expected));
        list.add('e');
        assertThat(task.subList(list), is(list));
    }

}