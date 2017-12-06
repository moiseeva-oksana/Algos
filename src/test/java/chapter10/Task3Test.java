package chapter10;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task3Test {
    private Task3 task = new Task3();

    @Test
    public void search() throws Exception {
        List<Integer> list = Arrays.asList(5, 6, 7, 1, 2, 3, 4);
        assertThat(task.search(list, 3), is(5));
        assertThat(task.search(list, 5), is(0));
        assertThat(task.search(list, 2), is(4));

    }

}